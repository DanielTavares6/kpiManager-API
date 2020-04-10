package controllers;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.security.Principal;

import javax.annotation.security.DeclareRoles;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.NameBinding;
import java.util.Collection;

import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import controllers.PersonController.Secured;
import models.Client;
import models.Person;
import models.Unit;
import models.dto.PersonDTO;
import repositories.PersonRepository;
import services.PersonService;


/***************************************************** 
 * 
 * Use the following annotations to secure endpoints:
 * 
 * @PermitAll
 * @DenyAll
 * @RolesALlowed(value = {"role to give Permission" }
 * Authentication is required for non-annotated methods
 * For more information on the subject refer to AuthorizationFilter.Java
 * 
 * @author UpAcademy 13
 *
 *******************************************************/


@PermitAll
@Path("/users")
public class PersonController extends EntityController<PersonService, PersonRepository, Person>

{
	// new secure annotation to implement authentication filter
	@NameBinding
	@Retention(value = RetentionPolicy.RUNTIME)
	@Target({ElementType.TYPE,ElementType.METHOD})
	public @interface Secured{
	}
	
	@Context
	SecurityContext securityContext;
	
	/**********************************************AUTHENTICATION*************************************************************************/
	/**** http://localhost:8080/kpiManager/api/users/auth ****/
	@POST
	@PermitAll
	@Path("/auth")
	@Consumes(MediaType.APPLICATION_JSON) 
	@Produces(MediaType.TEXT_PLAIN)
	public Response login(PersonDTO obj) {
		try {

			// Authenticate and issue the Token to the client
			return Response.ok().entity(service.checkIfPasswordValid(obj, obj.getPassword())).build();

		} catch (Exception e) {
			return Response.status(Response.Status.FORBIDDEN).build(); //returns 403
		}
	}
	
	/***********************************************MANAGER CREATION---Permission Granted to "SUPER USER"  *******************************/
	/**** http://localhost:8080/kpiManager/api/users ****/
	@POST
	@Secured 
	@RolesAllowed(value = { "SuperUser" })
	@Consumes(MediaType.APPLICATION_JSON) 
	@Produces(MediaType.TEXT_PLAIN)
	public Response create(PersonDTO obj){
		try {
			service.create(obj);
			return Response.ok().entity("sucesso").build();
		} catch (Exception e) {
			return Response.status(Response.Status.UNAUTHORIZED).entity(e.getMessage()).build();
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
	
/************************************************Edit Manager***********************************/
/**** http://localhost:8080/kpiManager/api/users/{id} ****/

	@PUT
	@Secured 
	@PermitAll //change to director
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON) 
	@Produces(MediaType.APPLICATION_JSON)
	public Response editManager(Person manager,@PathParam("id") int id){
		try {
			String newName = manager.getName();
			Unit newUnit = manager.getUnit();
			
			Person setManager = service.getObj(id);
			setManager.setName(newName);
			setManager.setUnit(newUnit);
			
			service.edit(setManager,id);
			return Response.ok().entity("manager editado com sucesso").build();
		} catch (Exception e) {
			return Response.status(Response.Status.UNAUTHORIZED).entity(e.getMessage()).build();
		}
	}
	
/************************************************Delete Manager***********************************/
/**** http://localhost:8080/kpiManager/api/users/{id} ****/
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public String delete(@PathParam("id") long id) {
		try {
			service.remove(id);
			return "Removido";
		} catch (Exception e) {
			e.printStackTrace();
			return "Id nao existe";
		}
	}
	

}


























