package com.rwa.springjerseyrest;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.rwa.springjerseyrest.Controllers.EmployeeController;

@Configuration
@ApplicationPath("/spring-jersey-rest/api") //The default mapping path can be changed via javax.ws.rs.ApplicationPath annotation added to ResourceConfig configuration class:
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(EmployeeController.class);
    }
}