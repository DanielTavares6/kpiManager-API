package repositories;

import java.util.Collection;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.persistence.NoResultException;

import models.Client;
import models.Interaction;
import models.Person;

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
		return Client.GET_ALL_CLIENTS;
	}

	@Override
	protected String getAllIdsQueryName() 
	
	{
		return Client.GET_ALL_CLIENTS_IDS;
	}



	public Client getClientByName(String name) throws NoResultException {
		
		return entityManager.createNamedQuery(Client.GET_CLIENT_BY_NAME, Client.class)
				.setParameter("name", name)
				.getSingleResult();
	}
	
	public Client getClientByNipc(int nipc) throws NoResultException {
		
		return entityManager.createNamedQuery(Client.GET_CLIENT_BY_NIPC, Client.class)
				.setParameter("nipc", nipc)
				.getSingleResult();
	}

	public void edit(Client client, int id) {

	}

	public void clearInteractionByClientId (long clientId )
		{
				entityManager.createNamedQuery(Client.CLEAR_INTERACTION_BY_CLIENTID)
					.setParameter("clientId", clientId) 
					.executeUpdate();
				
		}
	
	public   Collection<Client> getCount(int startIndex, int quantity) {
		return entityManager.createNamedQuery(Client.GET_COUNT_INTERACTIONS)
				.setFirstResult(startIndex)
				.setMaxResults(quantity)
				.getResultList();
	}
	
	public Long getTotal() {
		return (long) entityManager.createNamedQuery(Client.COUNT)
				.getSingleResult();
	}
	
	}
	


