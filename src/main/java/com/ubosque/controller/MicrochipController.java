package com.ubosque.controller;

import com.ubosque.conn.MongoConnection;
import com.ubosque.interfaces.IMicrochip;
import com.ubosque.model.MicrochipModel;
import org.bson.Document;

import java.util.logging.Logger;

public class MicrochipController implements IMicrochip {

    //Attributes
    private MongoConnection mongoConn = new MongoConnection();

    @Override
    public void createChip(MicrochipModel microchipData) {
        try {
            mongoConn.getMongoCollection().insertOne(new Document()
                    .append("timestamp", microchipData.getTimestamp())
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
        }catch (Exception ex){
            Logger.getLogger("error" + ex.getMessage());
        }
    }

    @Override
    public void findChip() {

    }
}
