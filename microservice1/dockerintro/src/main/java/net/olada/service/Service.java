package net.olada.service;

import net.olada.BlahBean;
import net.olada.model.Entity;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by David Olah on 05.05.2017.
 */
@Component
@Path("/")
public class Service {
    @Inject
    private BlahBean blahBean;

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get() {
        Entity entity = new Entity();
        entity.setFeld1("Feld1");
        entity.setFeld2(blahBean.bigMethod());
        return Response.ok().entity(entity).build();
    }
}
