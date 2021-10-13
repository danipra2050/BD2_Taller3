package com.ubosque.geolocation;

import java.util.ArrayList;

public class PetGeolocation {

    private String type;
    private ArrayList<Feature> features;

    public PetGeolocation() {
    }

    public PetGeolocation(String type, ArrayList<Feature> features) {
        this.type = type;
        this.features = features;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
    }
}
