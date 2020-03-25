package repositories;

import javax.faces.bean.ApplicationScoped;

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
	
}
