package services;

import javax.enterprise.context.RequestScoped;
import models.Interaction;
import repositories.InteractionRepository;

@RequestScoped // Avoid circular dependency between services
public class InteractionService extends EntityService<InteractionRepository, Interaction>{

	
}
