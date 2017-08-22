package net.olada.service;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

/**
 * Created by David Olah on 05.05.2017.
 */
@Component
@ApplicationPath("/api/v1")
public class ServiceApplication extends ResourceConfig {
    public ServiceApplication() {
        register(Service.class);
    }
}
