package repositories;

import javax.faces.bean.ApplicationScoped;

import models.Client;
import models.Director;
import models.Manager;

@ApplicationScoped
public class ManagerRepository extends PersonRepository <Manager>

{

	@Override
	public Class<Manager> getEntityClass() {
		return Manager.class;
	}

	@Override
	public String getAllEntityQueryName() {
		return Manager.GET_ALL_MANAGERS_QUERY_NAME;
	}

	@Override
	protected String getAllIdsQueryName() {
		return Manager.GET_ALL_MANAGERS_IDS;
	}

	@Override
	protected String getAllWeeksQueryName() {
		return Director.GET_ALL_WEEKS;
	}

	@Override
	protected String getAllClientsQueryName() {
		return Director.GET_ALL_CLIENTS;
	}

	@Override
	protected String getAllBManagersQueryName() {
		return Director.GET_ALL_B_MANAGERS;
	}

	@Override
	protected String getAllUnitiesQueryName() {
		// TODO Auto-generated method stub
		return Director.GET_ALL_UNITIES;
	}

	@Override
	protected String getAllInteractionsQueryName() {
		// TODO Auto-generated method stub
		return Director.GET_ALL_INTERACTIONS;
	}

	@Override
	protected String getAllFilterQueryName() {
		// TODO Auto-generated method stub
		return Director.GET_ALL_FILTER;
	}
	
	
	
	// O manager é uma person, o client é uma entity.
	
	// a person extende a entity
	
	// posso fazer o client e o manager a extender da entityrepository para nao dar erro
	// e nao ter que definir os mesmos metodos nas classes de entity e person?
	
	// No serviço também dá raia
	
	
}
