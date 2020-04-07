package services;

import java.io.IOException;

import javax.enterprise.context.RequestScoped;
import javax.persistence.NoResultException;
import javax.transaction.Transactional;

import models.Client;
import models.Person;
import repositories.ClientRepository;

@RequestScoped // Avoid circular dependency between services
public class ClientService extends EntityService<ClientRepository, Client>

{
	
	@Transactional
	public Client create(Client entity) throws Exception {

		if(checkClientExists(entity.getName()) ==true) {
			
			throw new Exception(" Client already exists!  ");
		}
		else if( checkNipcExists(entity.getNipc()) == true) {
			throw new Exception ("Nipc already exists!");
		}
		else {

			Client c = new Client();
			String name = entity.getName();
			int nipc = entity.getNipc();
			int potentialRevenue = entity.getPotentialRevenue();
			int unit = entity.getUnitId();
			c.setName(name);
			c.setNipc(nipc);
			c.setPotentialRevenue(potentialRevenue);
			c.setUnitId(unit);
			return repository.create(c);
		}
	}
	public Client getClientByName(String name) throws NoResultException  {
		
		return repository.getClientByName(name);
	}

	public Client getClientByNipc(int nipc) throws NoResultException {
		
		return repository.getClientByNipc(nipc);
	}
	
	
	/******* logic to avoid duplicated values at DB on creation **************/
	public Boolean checkClientExists(String name) {
		boolean flag = false;
		try {
			Client check = repository.getClientByName(name);
	
			if (check.getName().length() != 0) {

				flag = true;
			}
		} catch (NoResultException nre) {
			flag = false;
		}
		return flag;
	}

	public Boolean checkNipcExists(int nipc) {
		boolean flag = false;
		try {
			Client check = repository.getClientByNipc(nipc);
		
			if (check.getNipc() == nipc) {
				flag = true;
			}
		} catch (NoResultException nre) {
			System.out.println(nre);
			flag = false;
		}
		return flag;
	}
	
}
