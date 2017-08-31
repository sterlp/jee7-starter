package org.sterl.jee.starter.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloWorldRest {
    
    @Produces(MediaType.TEXT_PLAIN)
    @GET
    public String get() {
        return "Hello World!";
    }
}