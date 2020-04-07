package controllers;

import java.util.Collection;

import javax.annotation.security.PermitAll;
import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response.Status;

import models.Interaction;
import repositories.InteractionRepository;
import services.InteractionService;

@PermitAll
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
	@PermitAll
	@Path("all")
	@Produces(MediaType.APPLICATION_JSON)

	public Collection<Interaction> showAll() {

		return I.showAll();
	}

	@GET
	@PermitAll
	@Path("allWeeks")
	@Produces(MediaType.APPLICATION_JSON)

	public Collection<String> showAllWeeks() {

		return I.showAllWeeks();
	}

	@GET
	@PermitAll
	@Path("allWeeksFilter/{filter}")
	@Produces(MediaType.APPLICATION_JSON)

	public Collection<Interaction> showAllWeeksFilter(@PathParam("filter") String filter) {

		return I.showAllWeeksFilter(filter);
	}

	@GET
	@PermitAll
	@Path("allClients")
	@Produces(MediaType.APPLICATION_JSON)

	public Collection<String> showAllClients() {

		return I.showAllClients();
	}

	@GET
	@PermitAll
	@Path("allClientsFilter/{filter}")
	@Produces(MediaType.APPLICATION_JSON)

	public Collection<Interaction> showAllClientsFilter(@PathParam("filter") String filter)

	{
		return I.showAllClientsFilter(filter);
	}

	@GET
	@PermitAll
	@Path("allBManagers")
	@Produces(MediaType.APPLICATION_JSON)

	public Collection<String> getAllBManagers()

	{
		return I.showAllBManagers();
	}

	@GET
	@PermitAll
	@Path("allBManagersFilter/{filter}")
	@Produces(MediaType.APPLICATION_JSON)

	public Collection<Interaction> showAllBManagersFilter(@PathParam("filter") String filter)

	{
		return I.showAllBManagersFilter(filter);
	}

	@GET
	@PermitAll
	@Path("allInteractions")
	@Produces(MediaType.APPLICATION_JSON)

	public Collection<String> getAllInteractions()

	{
		return I.showAllInteractions();
	}

	@GET
	@PermitAll
	@Path("allInteractionsFilter/{filter}")
	@Produces(MediaType.APPLICATION_JSON)

	public Collection<Interaction> showAllInteractionsFilter(@PathParam("filter") String filter)

	{
		return I.showAllInteractionsFilter(filter);
	}

	@GET
	@PermitAll
	@Path("allUnits")
	@Produces(MediaType.APPLICATION_JSON)

	public Collection<String> getAllUnities()

	{
		return I.showAllUnities();
	}

	@GET
	@PermitAll
	@Path("allUnits/Filter/{filter}")
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
	@PermitAll
	@Path("search/{search}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Collection<Interaction> showAllSearch(@PathParam("search") String search) {
		return I.showAllSearch(search);
	}
	
	@GET
	@PermitAll
	@Path("filter")
	@Produces({ MediaType.APPLICATION_JSON })
	public Collection<Interaction> filtrer(@QueryParam("week") String myselectWeek,
			@QueryParam("unity") String myselectUnity,
			@QueryParam("client") String myselectClient,
			@QueryParam("businessManagers") String myselectBM,
			@QueryParam("interaction") String myselectInteration			
			) {

		return I.filtrer(myselectWeek, myselectUnity, myselectClient, myselectBM, myselectInteration);
	}
	
	@GET
	@PermitAll
	@Path("all/between")
	@Produces({ MediaType.APPLICATION_JSON })
	public Collection<Interaction> filtro(@QueryParam("startIndex") Long startIndex,
			@QueryParam("quantity") Long quantity) {
		quantity += startIndex;
		return I.showAllBetween(startIndex, quantity);
	}

	 /*************************
	 * Dashboard Module Starts*
	 *************************/

	@GET
	@PermitAll
	@Path("cvs/{manager}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Collection<Interaction> getAllCvsPerWeekPerManager(@PathParam("manager") String manager,
			@NotNull @QueryParam("week") String week) {
		return I.getAllCvsPerWeekPerManager(manager, week);
	}
	
	@GET
	@PermitAll
	@Path("cvs/count/{manager}")
	@Produces({ MediaType.APPLICATION_JSON })
	public long countAllCvsPerWeekPerManager(@PathParam("manager") String manager,
			@NotNull @QueryParam("week") String week) {
		return I.countAllCvsPerWeekPerManager(manager, week);
	}

	@GET
	@PermitAll
	@Path("count/interactions")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response countAllInteractionsPer(@QueryParam("unit") String unit,
			@QueryParam("interactionType") String interactionType, @QueryParam("clientName") String clientName) {
		try {
			if (unit != null && interactionType != null && clientName != null) {
				throw new Exception("Insira apenas ou unit query ou interactionType query ou a query clientName" );
			}
			if (unit != null && interactionType != null) {
				throw new Exception("Insira apenas ou unit query ou interactionType query ou a query clientName");
			}
			if (unit != null && clientName != null) {
				throw new Exception("Insira apenas ou unit query ou interactionType query ou a query clientName");
			}
			if (interactionType != null && clientName != null) {
				throw new Exception("Insira apenas ou unit query ou interactionType query ou a query clientName");
			}
			if (unit != null) {
				return Response.ok().entity(I.countAllInteractionsPerUnit(unit)).build();
			}
			if(clientName != null) {
				return Response.ok().entity(I.countAllInteractionsPerClient(clientName)).build();
			}
			if (interactionType != null) {
				return Response.ok().entity(I.countAllInteractionsPerInteractionType(interactionType)).build();
			} else {
				throw new Exception("Preencha ou a query unit ou a query interactionType ou a query clientName");
			}
		} catch (Exception e) {
			return Response.status(400).entity(e.getMessage()).build();
		}
	}
	
	 /************************
	 * Dashboard Module Ends *
	 ************************/
}
