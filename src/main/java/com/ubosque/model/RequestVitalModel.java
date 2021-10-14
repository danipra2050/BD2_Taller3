package com.ubosque.model;

import java.sql.Timestamp;

public class RequestVitalModel {

    //Attribute
    private Timestamp initialDate;
    private Timestamp finalDate;
    private String petName;

    public RequestVitalModel() {
    }

    public RequestVitalModel(Timestamp initialDate, Timestamp finalDate, String petName) {
        this.initialDate = initialDate;
        this.finalDate = finalDate;
        this.petName = petName;
    }

    public Timestamp getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(Timestamp initialDate) {
        this.initialDate = initialDate;
    }

    public Timestamp getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Timestamp finalDate) {
        this.finalDate = finalDate;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }
}
