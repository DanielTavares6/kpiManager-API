package services;

import javax.enterprise.context.RequestScoped;

import models.Client;
import repositories.ClientRepository;

@RequestScoped // Avoid circular dependency between services
public class ClientService extends EntityService<ClientRepository, Client>

{


}
