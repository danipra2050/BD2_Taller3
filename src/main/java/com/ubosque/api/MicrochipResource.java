package com.ubosque.api;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/micro")
public class MicrochipResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
        return "Hello, World from other class!";
    }
}
