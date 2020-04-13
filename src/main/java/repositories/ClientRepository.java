package repositories;

import javax.faces.bean.ApplicationScoped;

import models.Client;

@ApplicationScoped
public class ClientRepository extends EntityRepository <Client>

{

	
	@Override
	public Class<Client> getEntityClass() 
	
	{
		return Client.class;
	}

	@Override
	public String getAllEntityQueryName() 
	
	{
		return Client.GET_ALL_CLIENTS_QUERY_NAME;
	}

	@Override
	protected String getAllIdsQueryName() 
	
	{
		return Client.GET_ALL_CLIENTS_IDS;
	}
	public int updateRevenue(long id, long value) {
		return entityManager.createNamedQuery
		(Client.UPDATE_POTENTIAL_REVENUE).setParameter("value",value).setParameter("id",id ).executeUpdate();

	}

	public void updateDecreaseRevenue(long id, Long potentialRevenue) {
		// TODO Auto-generated method stub
		entityManager.createNamedQuery
				(Client.UPDATE_DECREASE_POTENTIAL_REVENUE).setParameter("value", potentialRevenue).setParameter("id",id ).executeUpdate();
	}


	
	
	
}
