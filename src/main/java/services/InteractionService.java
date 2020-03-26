package services;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import models.Interaction;
import repositories.InteractionRepository;

@RequestScoped // Avoid circular dependency between services
public class InteractionService extends EntityService<InteractionRepository, Interaction>{

	@Inject // Inject generic variable in runtime
	protected InteractionRepository I;
	
	public Collection<Interaction> showAll() {
		return I.showAll();
	}
	
	public Collection<String> showAllWeeks() {
		return I.showAllWeeks();
	}
	
	public Collection<String> showAllClients() {
		return I.showAllClients();
	}
	
	public Collection<String> showAllUnities() {
		return I.showAllUnities();
	}
	
	public Collection<String> showAllBManagers() {
		return I.showAllBManagers();
	}
	
	public Collection<String> showAllInteractions() {
		return I.showAllInteractions();
	}

	public Collection<Interaction> showAllFilter(String filter) {
		return I.showAllFilter(filter);
	}

	public Collection<Interaction> showAllSearch(String search) {
		return I.showAllSearch(search);
	}
	
}
