package com.template.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.corda.core.messaging.CordaRPCOps;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

// This API is accessible from /api/template. The endpoint paths specified below are relative to it.
@Path("template")
public class TemplateApi {
    private final ObjectMapper mapper = new ObjectMapper();
    private final CordaRPCOps services;

    public TemplateApi(CordaRPCOps services) {
        this.services = services;
    }

    /**
     * Accessible at /api/template/templateGetEndpoint.
     */
    @GET
    @Path("templateGetEndpoint")
    @Produces(MediaType.APPLICATION_JSON)
    public Response templateGetEndpoint() {
        ObjectNode entity = mapper.createObjectNode()
                .put("name", "Template GET endpoint.");
        return Response.ok(entity).build();
    }

    /**
     * Accessible at /api/template/templatePutEndpoint.
     */
    @PUT
    @Path("templatePutEndpoint")
    public Response templatePutEndpoint(Object payload) {
        return Response.ok("Template PUT endpoint.").build();
    }
}