package controllers;

import javax.ws.rs.Path;

import models.Interaction;
import repositories.InteractionRepository;
import services.InteractionService;

@Path("interactions")
public class InteractionController extends EntityController<InteractionService, InteractionRepository, Interaction> 

{

	
//	@GET
//	@Path("allWeeks")
//	@Produces(MediaType.APPLICATION_JSON)
//
//	public Collection<Interaction> showAll() {
//
//		return I.showAll();
//	}
//
//	@GET
//	@Path("allWeeks")
//	@Produces(MediaType.APPLICATION_JSON)
//
//	public Collection<String> showAllWeeks() {
//
//		return I.showAllWeeks();
//	}
//
//	@GET
//	@Path("allClients")
//	@Produces(MediaType.APPLICATION_JSON)
//
//	public Collection<String> showAllClients() {
//
//		return I.showAllClients();
//	}
//
//	@GET
//	@Path("allBManagers")
//	@Produces(MediaType.APPLICATION_JSON)
//
//	public Collection<String> getAllBManagers()
//
//	{
//		return I.showAllBManagers();
//	}
//
//	@GET
//	@Path("allInteractions")
//	@Produces(MediaType.APPLICATION_JSON)
//
//	public Collection<String> getAllInteractions()
//
//	{
//		return I.showAllInteractions();
//	}
//
//	@GET
//	@Path("allUnities")
//	@Produces(MediaType.APPLICATION_JSON)
//
//	public Collection<String> getAllUnities()
//
//	{
//		return I.showAllUnities();
//	}
//
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
//
//// A variável search é uma palavra que vai ser pesquisada em todas as colunas da base de dados
//	@GET
//	@Path("search/{search}")
//	@Produces({ MediaType.APPLICATION_JSON })
//	public Collection<Interaction> showAllSearch(@PathParam("search") String search) {
//		return I.showAllSearch(search);
//	}


