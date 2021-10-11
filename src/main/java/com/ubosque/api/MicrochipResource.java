package com.ubosque.api;

import com.ubosque.conn.MongoConnection;
import com.ubosque.controller.MicrochipController;
import com.ubosque.model.MicrochipModel;
import org.bson.Document;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.logging.Logger;

@Path("/micro")
public class MicrochipResource {

    private MicrochipController microController = new MicrochipController();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String createChip(MicrochipModel microchipData) {
        microController.createChip(microchipData);
        return microchipData.getMicrochip();
    }
}
