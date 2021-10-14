package com.ubosque.interfaces;

import com.ubosque.geolocation.PetGeolocation;
import com.ubosque.model.MicrochipModel;
import com.ubosque.model.RequestVitalModel;

import java.util.ArrayList;

public interface IMicrochip {

    public void createChip(MicrochipModel microchipData);

    public void createLocation(String chip, String location);

    public PetGeolocation createPetLocation(String chip);

    public ArrayList<MicrochipModel> getVitalSigns(RequestVitalModel requestVital);
}
