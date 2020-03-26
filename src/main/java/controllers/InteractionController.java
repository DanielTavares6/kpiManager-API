package controllers;

import javax.ws.rs.Path;

import models.Interaction;
import repositories.InteractionRepository;
import services.InteractionService;

@Path("interactions")
public class InteractionController extends EntityController<InteractionService, InteractionRepository, Interaction> 

{

	
}


