package com.ubosque.model;

public class VitalSignsModel {

    //Attributes
    private Double temperature;
    private Double heartRate;
    private Double breathingFrequency;

    //Constructor
    public VitalSignsModel() {
    }

    //Constructor with parameters
    public VitalSignsModel(Double temperature, Double heartRate, Double breathingFrequency) {
        this.temperature = temperature;
        this.heartRate = heartRate;
        this.breathingFrequency = breathingFrequency;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(Double heartRate) {
        this.heartRate = heartRate;
    }

    public Double getBreathingFrequency() {
        return breathingFrequency;
    }

    public void setBreathingFrequency(Double breathingFrequency) {
        this.breathingFrequency = breathingFrequency;
    }
}
