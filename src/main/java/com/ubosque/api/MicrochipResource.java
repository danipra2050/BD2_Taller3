package com.ubosque.api;

import com.ubosque.controller.MicrochipController;
import com.ubosque.geolocation.PetGeolocation;
import com.ubosque.model.MicrochipModel;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/micro")
public class MicrochipResource {

    private MicrochipController microController = new MicrochipController();

    @POST
    @Path("/createchip")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String createChip(MicrochipModel microchipData) {
        microController.createChip(microchipData);
        return microchipData.getMicrochip();
    }

    @GET
    @Path("/getPetLocation")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public PetGeolocation getPetLocation(@QueryParam("chip") String chip){
        return microController.createPetLocation(chip);
    }
}
