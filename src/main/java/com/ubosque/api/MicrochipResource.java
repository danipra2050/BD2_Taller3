package com.ubosque.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/test")
public class MicrochipResource {

    @G
    @Produces("text/plain")
    public String hello() {
        return "Hello, World from other class!";
    }
}
