package controllers;



import javax.ws.rs.Path;

import models.Client;
import models.Entity_;
import repositories.ClientRepository;
import repositories.EntityRepository;
import services.ClientService;


@Path("clients")
public class ClientController extends EntityController<ClientService, ClientRepository, Client>{

	

}
