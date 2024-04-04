package fr.univamu.iut.book;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/suuu")
public class test {
    @GET
    @Produces("text/plain")
    public String hello() {
        return "haaaauuugh";
    }
}
