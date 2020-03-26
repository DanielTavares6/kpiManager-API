package controllers;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import models.Person;
import models.dto.PersonDTO;
import repositories.PersonRepository;
import services.PersonService;


// Isto vai ter um path ('users')

// e vai deixar de ser abstracto

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
	
	
}
