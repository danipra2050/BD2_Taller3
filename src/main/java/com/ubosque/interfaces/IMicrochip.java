package com.ubosque.interfaces;

import com.ubosque.geolocation.PetGeolocation;
import com.ubosque.model.MicrochipModel;

public interface IMicrochip {

    public void createChip(MicrochipModel microchipData);

    public void createLocation(String chip, String location);

    public PetGeolocation createPetLocation(String chip);
}
