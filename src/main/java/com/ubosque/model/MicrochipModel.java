package com.ubosque.model;

public class MicrochipModel {

    //Attributes
    private String timestamp;
    private String microchip;
    private String pateName;
    private String ownerName;
    private String species;
    private GeoModel geolocation;
    private VitalSignsModel vitalSigns;

    //Constructor
    public MicrochipModel(){}

    //Constructor with parameters
    public MicrochipModel(String timestamp, String microchip, String pateName, String ownerName,
                          String species, GeoModel geolocation, VitalSignsModel vitalSigns) {
        this.timestamp = timestamp;
        this.microchip = microchip;
        this.pateName = pateName;
        this.ownerName = ownerName;
        this.species = species;
        this.geolocation = geolocation;
        this.vitalSigns = vitalSigns;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getMicrochip() {
        return microchip;
    }

    public void setMicrochip(String microchip) {
        this.microchip = microchip;
    }

    public String getPateName() {
        return pateName;
    }

    public void setPateName(String pateName) {
        this.pateName = pateName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public GeoModel getGeolocation() {
        return geolocation;
    }

    public void setGeolocation(GeoModel geolocation) {
        this.geolocation = geolocation;
    }

    public VitalSignsModel getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSignsModel vitalSigns) {
        this.vitalSigns = vitalSigns;
    }
}
