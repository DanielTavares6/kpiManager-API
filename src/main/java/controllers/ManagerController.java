package controllers;


import javax.ws.rs.Path;

import models.Manager;
import repositories.ManagerRepository;

import services.ManagerService;

@Path("managers")
public class ManagerController extends PersonController <ManagerService, ManagerRepository, Manager>

{

	
}
