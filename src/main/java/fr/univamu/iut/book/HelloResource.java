package fr.univamu.iut.book;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/test")
public class HelloResource {
    @GET
    @Produces("text/plain")
    public String hello() {
        return "big feur";
    }
}
