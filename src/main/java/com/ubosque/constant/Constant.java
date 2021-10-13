package com.ubosque.constant;

public class Constant {

    private Constant(){}

    public static class DbInfo{
        private DbInfo(){}
        public static final String DB_SERVER = "localhost";
        public static final int DB_PORT = 27017;
        public static final String DB_NAME = "PPDBYBA";
        public static final String DB_COLLECTION = "microchips";
    }

    public static class RedisInfo{
        private RedisInfo(){}
        public static final String DB_SERVER = "localhost";
        public static final int DB_PORT = 6379;
        public static final int DB_EXPIRE_TIME = 3600;
    }

    public static class GeoInfo{
        private GeoInfo(){}
        public static final String FEATURE_TYPE = "Feature";
        public static final String GEOMETRY_TYPE = "Polygon";
        public static final String GEO_TYPE = "FeatureCollection";
    }
}
