package com.cdryx;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RequestScoped
@Path("/remoteejbotherjvm")
public class SimpleRestApi {

	@EJB
	private IClientService clientService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response hello()  {
		return Response.ok(new Object[] {clientService.doSomething()}).build();
	}
}