package repositories;

import javax.faces.bean.ApplicationScoped;

import models.Client;
import models.Manager;

@ApplicationScoped
public class ManagerRepository extends PersonRepository <Manager>

{

	public Manager getManagerByUsername(String username) {
		
		return entityManager.createNamedQuery(Manager.GET_MANAGER_BY_USERNAME,Manager.class)
				.setParameter("username", username)
				.getSingleResult();
	}
	
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
	
	
	// O manager é uma person, o client é uma entity.
	
	// a person extende a entity
	
	// posso fazer o client e o manager a extender da entityrepository para nao dar erro
	// e nao ter que definir os mesmos metodos nas classes de entity e person?
	
	// No serviço também dá raia
	
	
}
