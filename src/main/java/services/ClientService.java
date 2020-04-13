package services;

import javax.enterprise.context.RequestScoped;

import models.Client;
import repositories.ClientRepository;

@RequestScoped // Avoid circular dependency between services
public class ClientService extends EntityService<ClientRepository, Client>

{

	public void updateRevenue(long id, Long potentialRevenue) {
		// TODO Auto-generated method stub
		repository.updateRevenue(id, potentialRevenue);
		
	}

	public void updateDecreaseRevenue(long id, Long potentialRevenue) {
		// TODO Auto-generated method stub
		repository.updateDecreaseRevenue(id, potentialRevenue);
	}


}
