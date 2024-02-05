package com.example;


import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.ArrayList;
import java.util.List;

@Path("/movies")
public class MovieResource {
    public List<String> movies = new ArrayList<>();

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response getMovies() {
        return Response.ok(movies).build();
    }


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/size")
    public Integer countMovies() {
        return movies.size();
    }

}
