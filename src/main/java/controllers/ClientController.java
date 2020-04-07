package controllers;



import java.util.Collection;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import controllers.PersonController.Secured;
import models.Client;
import models.Person;
import repositories.ClientRepository;
import services.ClientService;



@PermitAll // mudar para director
@Path("/clients")
public class ClientController extends EntityController <ClientService, ClientRepository, Client>
{

/********@Get AllClients*******************/
/********Already implemented in entityController*******/
/**** http://localhost:8080/kpiManager/api/clients ****/	

	

/***********************************************Client Creation---Permission Granted to "DIRECTOR"  *******************************/
/**** http://localhost:8080/kpiManager/api/clients ****/

	@POST
	@Secured 
	@PermitAll //change to director
	@Consumes(MediaType.APPLICATION_JSON) 
	@Produces(MediaType.APPLICATION_JSON)
	public Response create(Client client){
		try {
			service.create(client);
			return Response.ok().entity("cliente criado com sucesso").build();
		} catch (Exception e) {
			return Response.status(Response.Status.UNAUTHORIZED).entity(e.getMessage()).build();
		}
	}
	
/***********************************************Get Client by name*******************************/
/**** http://localhost:8080/kpiManager/api/clients/testename ****/
	@GET
	@Secured
	@PermitAll
	@Path("/testename")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Client getClientbyName(Client obj)
	{
		return service.getClientByName(obj.getName());
	}
/***********************************************Get Client by nipc*******************************/
/**** http://localhost:8080/kpiManager/api/clients/testenipc ****/
	@GET
	@Secured
	@PermitAll
	@Path("/testenipc")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Client getClientByNipc(Client obj)
	{
		return service.getClientByNipc(obj.getNipc());
	}
	
}
