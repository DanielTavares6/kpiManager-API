package controllers;

import java.util.Collection;

import javax.annotation.security.PermitAll;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import controllers.PersonController.Secured;
import models.Interaction;
import repositories.InteractionRepository;
import services.InteractionService;

@Path("interactions")
public class InteractionController extends EntityController<InteractionService, InteractionRepository, Interaction> {
	
	@Inject // Inject generic variable in runtime
	protected InteractionService I;


///////////// STATISTICS-MODULE /////////////////////////////////////////////////////////

//	@Context
//	private UriInfo context;
//	
//	@GET
//	@Path("healthCheck")
//	@Produces(MediaType.TEXT_PLAIN) // "text/plain"
//	public String healthCheck() {
//		return "URI " + context.getRequestUri().toString() + " is OK!";
//	}
//	
	@GET
	@Path("all")
	@Produces(MediaType.APPLICATION_JSON)

	public Collection<Interaction> showAll() {

		return I.showAll();
	}

	@GET
	@Path("allWeeks")
	@Produces(MediaType.APPLICATION_JSON)

	public Collection<String> showAllWeeks() {

		return I.showAllWeeks();
	}
	
	@GET
	@Path("allWeeksFilter/{filter}")
	@Produces(MediaType.APPLICATION_JSON)

	public Collection<Interaction> showAllWeeksFilter(@PathParam("filter") String filter) {

		return I.showAllWeeksFilter(filter);
	}

	@GET
	@Path("allClients")
	@Produces(MediaType.APPLICATION_JSON)

	public Collection<String> showAllClients() {

		return I.showAllClients();
	}
	
	@GET
	@Path("allClientsFilter/{filter}")
	@Produces(MediaType.APPLICATION_JSON)

	public Collection<Interaction> showAllClientsFilter(@PathParam("filter") String filter)

	{
		return I.showAllClientsFilter(filter);
	}

	@GET
	@Path("allBManagers")
	@Produces(MediaType.APPLICATION_JSON)

	public Collection<String> getAllBManagers()

	{
		return I.showAllBManagers();
	}
	
	@GET
	@Path("allBManagersFilter/{filter}")
	@Produces(MediaType.APPLICATION_JSON)

	public Collection<Interaction> showAllBManagersFilter(@PathParam("filter") String filter)

	{
		return I.showAllBManagersFilter(filter);
	}

	@GET
	@Path("allInteractions")
	@Produces(MediaType.APPLICATION_JSON)

	public Collection<String> getAllInteractions()

	{
		return I.showAllInteractions();
	}
	@GET
	@Path("allInteractionsFilter/{filter}")
	@Produces(MediaType.APPLICATION_JSON)

	public Collection<Interaction> showAllInteractionsFilter(@PathParam("filter") String filter)

	{
		return I.showAllInteractionsFilter(filter);
	}

	@GET
	@Path("allUnities")
	@Produces(MediaType.APPLICATION_JSON)

	public Collection<String> getAllUnities()

	{
		return I.showAllUnities();
	}
	
	@GET
	@Path("allUnitiesFilter/{filter}")
	@Produces(MediaType.APPLICATION_JSON)

	public Collection<Interaction> getAllUnitiesFilter(@PathParam("filter") String filter)

	{
		return I.showAllUnitiesFilter(filter);
	}


//// A variável filter tem que ser a coluna e o valor que se está a procurar
//// EX.: filter = "semana = 3"
//// Se for para aplicar vários filtros, tem que estar na variável também
//// EX.: filter = "semana = 3 AND manager = carlos" 
//	@GET
//	@Path("filter/{filter}")
//	@Produces({ MediaType.APPLICATION_JSON })
//	public Collection<Interaction> showAllFilter(@PathParam("filter") String filter) {
//		return I.showAllFilter(filter);
//	}

// A variável search é uma palavra que vai ser pesquisada em todas as colunas da base de dados
	@GET
	@Path("search/{search}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Collection<Interaction> showAllSearch(@PathParam("search") String search) {
		return I.showAllSearch(search);
	}
	
	@GET
	@Path("filtro")
	@Produces({ MediaType.APPLICATION_JSON })
	public Collection<Interaction> filtro(@QueryParam("sel0") String myselectSemana,
			@QueryParam("sel1") String myselectUnidade,
			@QueryParam("sel2") String myselectCliente,
			@QueryParam("sel3") String myselectBM,
			@QueryParam("sel4") String myselectInteration			
			) {
		System.out.println("sel0 = " + myselectSemana);
		return I.filtro(myselectSemana, myselectUnidade, myselectCliente, myselectBM, myselectInteration);
	}


	/***********Get Interactions by client id ****************/
	/**** http://localhost:8080/kpiManager/api/interactions/interactionbyclientid/{clientid} ****/

	@GET
	@Secured
	@PermitAll //mudar 
	@Path("/interactionbyclientid/{clientId}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Collection<Interaction> getInteractionsByClientId(@PathParam("clientId") long clientId ){
		return I.getInteractionByClientId(clientId);
	}
	
	
	


}
