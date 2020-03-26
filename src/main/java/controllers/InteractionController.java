package controllers;

import java.util.Collection;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import models.Interaction;
import repositories.InteractionRepository;
import services.InteractionService;

@Path("interactions")
public class InteractionController extends EntityController<InteractionService, InteractionRepository, Interaction> {
	
	@Inject // Inject generic variable in runtime
	protected InteractionService I;


///////////// STATISTICS-MODULE /////////////////////////////////////////////////////////

	@Context
	private UriInfo context;
	
	@GET
	@Path("healthCheck")
	@Produces(MediaType.TEXT_PLAIN) // "text/plain"
	public String healthCheck() {
		return "URI " + context.getRequestUri().toString() + " is OK!";
	}
	
	@GET
	@Path("allWeeks")
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
	@Path("allClients")
	@Produces(MediaType.APPLICATION_JSON)

	public Collection<String> showAllClients() {

		return I.showAllClients();
	}

	@GET
	@Path("allBManagers")
	@Produces(MediaType.APPLICATION_JSON)

	public Collection<String> getAllBManagers()

	{
		return I.showAllBManagers();
	}

	@GET
	@Path("allInteractions")
	@Produces(MediaType.APPLICATION_JSON)

	public Collection<String> getAllInteractions()

	{
		return I.showAllInteractions();
	}

	@GET
	@Path("allUnities")
	@Produces(MediaType.APPLICATION_JSON)

	public Collection<String> getAllUnities()

	{
		return I.showAllUnities();
	}

// A variável filter tem que ser a coluna e o valor que se está a procurar
// EX.: filter = "semana = 3"
// Se for para aplicar vários filtros, tem que estar na variável também
// EX.: filter = "semana = 3 AND manager = carlos" 
	@GET
	@Path("filter/{filter}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Collection<Interaction> showAllFilter(@PathParam("filter") String filter) {
		return I.showAllFilter(filter);
	}

// A variável search é uma palavra que vai ser pesquisada em todas as colunas da base de dados
	@GET
	@Path("search/{search}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Collection<Interaction> showAllSearch(@PathParam("search") String search) {
		return I.showAllSearch(search);
	}

//////////////////////////////////////////////////////////////////////////////////////

}
