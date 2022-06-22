package org.wimprovit;


import org.wimprovit.service.AlticciService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/wimprovit")
@Produces(MediaType.APPLICATION_JSON)
public class AlticciResource {

    @Inject
    AlticciService alticciService;

    @GET
    @Path("/alticci/{n}")
    public Response alticci(@PathParam("n") Integer n) {
        if (n ==null || n < 0) {
            return Response.status(Response.Status.BAD_REQUEST).entity("The value must be greater than 0").type(MediaType.APPLICATION_JSON_TYPE).build();
        }
        return Response.ok(alticciService.alticci(n)).build();
    }
}
