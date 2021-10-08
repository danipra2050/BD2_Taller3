package com.ubosque.conn;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.ubosque.constant.Constant;

public class MongoConnection {

    private MongoDatabase mongoDatabase;
    private MongoCollection mongoCollection;

    public MongoConnection(){
        MongoClient mongoClient = new MongoClient(Constant.DbInfo.DB_SERVER, Constant.DbInfo.DB_PORT);
        setMongoDatabase(mongoClient.getDatabase(Constant.DbInfo.DB_NAME));
        setMongoCollection(mongoDatabase.getCollection(Constant.DbInfo.DB_COLLECTION));
    }

    public MongoDatabase getMongoDatabase() {
        return mongoDatabase;
    }

    public void setMongoDatabase(MongoDatabase mongoDatabase) {
        this.mongoDatabase = mongoDatabase;
    }

    public MongoCollection getMongoCollection() {
        return mongoCollection;
    }

    public void setMongoCollection(MongoCollection mongoCollection) {
        this.mongoCollection = mongoCollection;
    }
}
