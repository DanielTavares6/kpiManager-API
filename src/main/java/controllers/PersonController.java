package controllers;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import models.Person;
import models.dto.PersonDTO;
import repositories.PersonRepository;
import services.PersonService;


@Path("users")
public class PersonController extends EntityController <PersonService,PersonRepository,Person>  

{
	@POST
	@Consumes(MediaType.APPLICATION_JSON) // "text/plain"
	@Produces(MediaType.TEXT_PLAIN)
	public String create(PersonDTO obj) {
		service.create(obj);
		return "Criado com sucesso";
	}

	@POST
	@Path("/auth")
	@Consumes(MediaType.APPLICATION_JSON) // "text/plain"
	@Produces(MediaType.TEXT_PLAIN)
	public Response login(PersonDTO obj) {
		try {
			service.checkIfPasswordValid(obj, obj.getPassword());
			return Response.ok().entity("Success").build();
			
		} catch(Exception e) { 
			return Response.status(Response.Status.UNAUTHORIZED).entity("Login Failed").build();
		}
		
	}
	
	
	@GET
	@Path("{unitId}/managers")
	@Produces(MediaType.APPLICATION_JSON)

	public Collection<Person> showAllEntitiesByUnit(@PathParam("unitId") long unitId)

	{
		return service.showAllEntitiesByUnit(unitId);
	}
	
	
	@GET
	@Path("managers")
	@Produces(MediaType.APPLICATION_JSON)

	public Collection<Person> showAllManagers()

	{
		return service.showAllManagers();
	}
	
	
	@GET
	@Path("directors")
	@Produces(MediaType.APPLICATION_JSON)

	public Collection<Person> showAllDirectors()

	{
		return service.showAllDirectors();
	}
	
	
	
	
}


























