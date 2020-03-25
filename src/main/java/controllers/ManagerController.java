package controllers;

import javax.inject.Inject;
import javax.persistence.Entity;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import models.Manager;
import models.dto.ManagerDTO;
import repositories.ManagerRepository;

import services.ManagerService;

@Path("/managers")
public class ManagerController

{
	@Inject
	protected ManagerService service;

	@POST
	@Consumes(MediaType.APPLICATION_JSON) // "text/plain"
	@Produces(MediaType.TEXT_PLAIN)
	public String create(ManagerDTO obj) {
		service.create(obj);
		return "Criado com sucesso";
	}

	@POST
	@Path("/auth")
	@Consumes(MediaType.APPLICATION_JSON) // "text/plain"
	@Produces(MediaType.TEXT_PLAIN)
	public Response login(ManagerDTO obj) {
		try {
			service.checkIfPasswordValid(obj, obj.getPassword());
			return Response.ok().entity("Success").build();
			
		} catch(Exception e) { 
			return Response.status(Response.Status.UNAUTHORIZED).entity("Login Failed").build();
		}
		
	}
}
