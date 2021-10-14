package com.ubosque.controller;

import com.mongodb.client.model.geojson.GeoJsonObjectType;
import com.mongodb.client.model.geojson.GeometryCollection;
import com.ubosque.conn.MongoConnection;
import com.ubosque.conn.RedisConnection;
import com.ubosque.constant.Constant;
import com.ubosque.geolocation.Feature;
import com.ubosque.geolocation.Geometry;
import com.ubosque.geolocation.PetGeolocation;
import com.ubosque.geolocation.Properties;
import com.ubosque.interfaces.IMicrochip;
import com.ubosque.model.MicrochipModel;
import com.ubosque.model.RequestVitalModel;
import org.bson.Document;
import redis.clients.jedis.Jedis;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

public class MicrochipController implements IMicrochip {

    //Attributes
    private final MongoConnection mongoConn = new MongoConnection();
    private final RedisConnection redisConn = new RedisConnection();

    @Override
    public void createChip(MicrochipModel microchipData) {
        try {
            mongoConn.getMongoCollection().insertOne(new Document()
                    .append("timestamp", new Timestamp(new Date().getTime()))
                    .append("microchip", microchipData.getMicrochip())
                    .append("pateName", microchipData.getPateName())
                    .append("ownerName", microchipData.getOwnerName())
                    .append("species", microchipData.getSpecies())
                    .append("geolocation", new Document()
                            .append("latitude", microchipData.getGeolocation().getLatitude())
                            .append("longitude", microchipData.getGeolocation().getLongitude()))
                    .append("vitalSigns", new Document()
                            .append("temperature", microchipData.getVitalSigns().getTemperature())
                            .append("heartRate", microchipData.getVitalSigns().getHeartRate())
                            .append("breathingFrequency", microchipData.getVitalSigns().getBreathingFrequency())
                    )
            );

            String location = microchipData.getGeolocation().getLatitude() + "_" + microchipData.getGeolocation().getLongitude();
            createLocation(microchipData.getMicrochip(), location);
        }catch (Exception ex){
            Logger.getLogger("Error Mongo: " + ex.getMessage());
        }
    }

    @Override
    public void createLocation(String chip, String location) {
        try{
            redisConn.getJedis().lpush(chip, location);
            redisConn.getJedis().expire(chip, Constant.RedisInfo.DB_EXPIRE_TIME);
        }catch (Exception ex){
            Logger.getLogger("createLocation: " + ex.getMessage());
        }
    }

    @Override
    public PetGeolocation createPetLocation(String chip) {
        PetGeolocation petGeolocation = new PetGeolocation();
        Geometry geometry = new Geometry();
        Feature feature = new Feature();
        try {
            List<String> locations = redisConn.getJedis().lrange(chip, 0, -1);

            for(String location : locations){
                ArrayList<Double> locCordinate = new ArrayList<>();

                String[] loc = location.split("_");

                locCordinate.add(Double.parseDouble(loc[0]));
                locCordinate.add(Double.parseDouble(loc[1]));

                geometry.setCoordinates(locCordinate);
            }

            ArrayList<Feature> featureArrayList = new ArrayList<>();

            geometry.setType(Constant.GeoInfo.GEOMETRY_TYPE);

            feature.setType(Constant.GeoInfo.FEATURE_TYPE);
            feature.setProperties(new Properties());
            feature.setGeometry(geometry);
            featureArrayList.add(feature);

            petGeolocation.setType(Constant.GeoInfo.GEO_TYPE);
            petGeolocation.setFeatures(featureArrayList);
        }catch (Exception ex){
            Logger.getLogger("createPetLocation: " + ex.getMessage());
        }
        return petGeolocation;
    }

    @Override
    public ArrayList<MicrochipModel> getVitalSigns(RequestVitalModel requestVital) {
        ArrayList<MicrochipModel> microList = new ArrayList<>();
        try{
            mongoConn.getMongoCollection().find();
        }catch(Exception ex){
            Logger.getLogger("getVitalSigns: " + ex.getMessage());
        }
        return microList;
    }
}
