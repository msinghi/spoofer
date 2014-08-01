package com.spoofer.core;

import org.glassfish.jersey.server.ResourceConfig;

import com.spoofer.resources.HelloWorldResource;
import com.spoofer.resources.SpooferResource;

public class MyApplication extends ResourceConfig {

    public MyApplication() throws Exception {
        register(HelloWorldResource.class);
        register(SpooferResource.class);
    }
}
