package repositories;

import javax.faces.bean.ApplicationScoped;

import models.Client;
import models.Entity_;


@ApplicationScoped
public class ClientRepository extends EntityRepository <Client>

{

	
	@Override
	public Class<Client> getEntityClass() {
		return Client.class;
	}

	@Override
	public String getAllEntityQueryName() {
		return Client.GET_ALL_CLIENTS_QUERY_NAME;
	}

	@Override
	protected String getAllIdsQueryName() {
		return Client.GET_ALL_CLIENTS_IDS;
	}

	@Override
	protected String getAllWeeksQueryName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
