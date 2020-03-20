package services;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import models.Manager;
import repositories.ManagerRepository;


@RequestScoped // Avoid circular dependency between services
public class ManagerService extends PersonService<ManagerRepository, Manager> 

{

	@Inject
	protected ClientService CLIENT_SERVICE;
	
}
