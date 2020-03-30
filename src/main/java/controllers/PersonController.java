package controllers;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
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


@Path("users")
public class PersonController extends EntityController <PersonService,PersonRepository,Person>  

{
	DecoderUtils decoder = new DecoderUtils();

	@POST
	@Consumes(MediaType.APPLICATION_JSON) // "text/plain"
	@Produces(MediaType.TEXT_PLAIN)
	public Response create(PersonDTO obj ){
		try {
		service.create(obj);
		return Response.status(Response.Status.ACCEPTED).encoding("added new manager to Database").build();
	
		} catch (Exception e) {
			return Response.status(Response.Status.UNAUTHORIZED).entity("user already exists in database").build();
		}
	}
	

	@POST
	@Path("/auth")
	@Consumes(MediaType.APPLICATION_JSON) // "text/plain"
	@Produces(MediaType.TEXT_PLAIN)
	public Response login(PersonDTO obj) {
		try { 
			return Response.ok().entity(service.checkIfPasswordValid(obj, obj.getPassword())).build();
			
		} catch(Exception e) { 
			return Response.status(Response.Status.UNAUTHORIZED).entity("Login Failed").build();
		}
	}
}
	
	//perceber como o token vai ser enviado em cada refresh da pagina no frontend, e como vamos buscar o token
//	@GET
//	@Path("/Auth/getToken")  //temporary path
//    public void getOrders(@HeaderParam("Authorization") String bearerToken){
//
//		String headerField = bearerToken.substring(6);  
//		String jwtBody = decoder.decodeJWT(headerField);
//    }
	

	

	

