package controllers;



import java.util.Collection;
import java.util.List;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import controllers.PersonController.Secured;
import models.Client;
import models.Interaction;
import models.Person;
import repositories.ClientRepository;
import services.ClientService;
import services.InteractionService;




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
/************************************************Edit Client***********************************/
	/**** http://localhost:8080/kpiManager/api/clients/{id} ****/
	@PUT
	@Secured 
	@PermitAll //change to director
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON) 
	@Produces(MediaType.APPLICATION_JSON)
	public Response editClient(Client client,@PathParam("id") int id){
		try {
			
			service.edit(client,id);
			return Response.ok().entity("cliente editado com sucesso").build();
		} catch (Exception e) {
			return Response.status(Response.Status.UNAUTHORIZED).entity(e.getMessage()).build();
		}
	}
/************************************************Delete Client and Interactions --> permission granted to SuperUser***********************************/
/**** http://localhost:8080/kpiManager/api/clients/{id} ****/
	
	@Transactional
	@DELETE
	@Secured
	@RolesAllowed (value = { "SuperUser"})
	@Path("/{clientId}")
	public Response clearInteractionsByClientId(@PathParam("clientId") long clientId ){
		try {
			 service.clearInteractionByClientId(clientId);
			return Response.ok().entity("sucesso").build();
		} catch (Exception e) {
			e.printStackTrace();			
			return Response.status(Response.Status.UNAUTHORIZED).entity(e.getMessage()).build();
		}
	}
/************************************************Delete Client and Interactions***********************************/
/**** http://localhost:8080/kpiManager/api/clients/{id} ****/
	@Transactional
	@DELETE
	@Secured
	@RolesAllowed (value = { "director"})
	@Path("dir/{clientId}")
	public Response deleteNoInterClient(@PathParam("clientId") long clientId ){
		try {
			 service.remove(clientId);
			return Response.ok().entity("sucesso").build();
		} catch (Exception e) {
			e.printStackTrace();			
			return Response.status(Response.Status.UNAUTHORIZED).entity(e.getMessage()).build();
		}
	}
	
/************************************************Get Interaction Count***********************************/
/**** http://localhost:8080/kpiManager/api/clients/count/{id} ****/
	@GET
	@Secured 
	@RolesAllowed (value = { "director"})
	@Path("/count")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCount(){
		try {
			List<Long> num = service.getCount();
			
			return Response.ok().entity(num).build();
		} catch (Exception e) {
			return Response.status(Response.Status.UNAUTHORIZED).entity(e.getMessage()).build();
		}
	}
	
}
