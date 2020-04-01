package controllers;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.NameBinding;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import models.Person;
import models.dto.PersonDTO;
import repositories.PersonRepository;
import services.PersonService;
import utils.DecoderUtils;

@Path("/users")
public class PersonController extends EntityController<PersonService, PersonRepository, Person>

{
	
	//secure annotation to implement authentication filter
	@NameBinding
	@Retention(value = RetentionPolicy.RUNTIME)
	@Target({ElementType.TYPE,ElementType.METHOD})
	public @interface Secured{
	}
	
	DecoderUtils decoder = new DecoderUtils();

	/**********************************************AUTHENTICATION**************************************************/
	
	/**** http://localhost:8080/kpiManager/api/users/auth ****/
	@POST
	@Path("/auth")
	@Consumes(MediaType.APPLICATION_JSON) // "text/plain"
	@Produces(MediaType.TEXT_PLAIN)
	public Response login(PersonDTO obj) {
		try {

			// Authenticate and issue the Token to the client
			return Response.ok().entity(service.checkIfPasswordValid(obj, obj.getPassword())).build();

		} catch (Exception e) {
			return Response.status(Response.Status.FORBIDDEN).build(); //returns 403
		}
	}
	
	/***********************************************MANAGER CREATION- ROLE->"SUPER USER"*********************************/
	/**** http://localhost:8080/kpiManager/api/users ****/
	@POST
	@Secured
	@Consumes(MediaType.APPLICATION_JSON) 
	@Produces(MediaType.TEXT_PLAIN)
	public Response create(PersonDTO obj) {

		try {
			service.create(obj);
			return Response.ok().entity("sucesso").build();

		} catch (Exception e) {
			return Response.status(Response.Status.UNAUTHORIZED).entity(e.getMessage()).build();
		}
	}
}