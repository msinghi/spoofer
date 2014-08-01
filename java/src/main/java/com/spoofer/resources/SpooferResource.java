package com.spoofer.resources;

import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("spoofer")
public class SpooferResource {

    
    @GET
    public Response spoofer(@QueryParam("size") Integer size, @QueryParam("delay") Integer delay) {
        
        System.out.println("Thread executing request - " + Thread.currentThread().getName());
        Random randomno = new Random();
        byte[] bytes = new byte[size];
        randomno.nextBytes(bytes);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return Response.ok(bytes).build();
    }
}
