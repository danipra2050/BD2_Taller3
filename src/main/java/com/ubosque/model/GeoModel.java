package com.ubosque.model;

public class GeoModel {

    //Attributes
    private Double latitude;
    private Double longitude;

    //Constructor
    public GeoModel() {
    }

    //Constructor with parameters
    public GeoModel(Double latitude, Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
