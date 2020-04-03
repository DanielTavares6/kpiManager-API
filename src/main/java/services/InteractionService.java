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
	
	public Collection<Interaction> showAllWeeksFilter(String filter) {
		return I.showAllWeeksFilter(filter);
	}
	
	public Collection<String> showAllClients() {
		return I.showAllClients();
	}
	
	public Collection<Interaction> showAllClientsFilter(String filter) {
		return I.showAllClientsFilter(filter);
	}
	
	public Collection<String> showAllUnities() {
		return I.showAllUnities();
	}
	
	public Collection<Interaction> showAllUnitiesFilter(String filter) {
		return I.showAllUnitiesFilter(filter);
	}
	
	public Collection<String> showAllBManagers() {
		return I.showAllBManagers();
	}
	
	public Collection<Interaction> showAllBManagersFilter(String filter) {
		return I.showAllBManagersFilter(filter);

	}
	
	public Collection<String> showAllInteractions() {
		return I.showAllInteractions();
	}
	
	public Collection<Interaction> showAllInteractionsFilter(String filter) {
		return I.showAllInteractionsFilter(filter);

	}

//	public Collection<Interaction> showAllFilter(String filter) {
//		return I.showAllFilter(filter);
//	}

	public Collection<Interaction> showAllSearch(String search) {
		return I.showAllSearch(search);
	}

	


	public Collection<Interaction> filtro(String myselectSemana, String myselectUnidade, String myselectCliente, String myselectBM,String myselectInteration) {
		return I.filtro(myselectSemana, myselectUnidade, myselectCliente, myselectBM, myselectInteration);
	}

	
	
//	public Collection<Interaction> showAll() {
//		return I.showAll();
//	}
//	
//	public Collection<String> showAllWeeks() {
//		return I.showAllWeeks();
//	}
//	
//	public Collection<String> showAllClients() {
//		return I.showAllClients();
//	}
//	
//	public Collection<String> showAllUnities() {
//		return I.showAllUnities();
//	}
//	
//	public Collection<String> showAllBManagers() {
//		return I.showAllBManagers();
//	}
//	
//	public Collection<String> showAllInteractions() {
//		return I.showAllInteractions();
//	}
//
//	public Collection<Interaction> showAllFilter(String filter) {
//		return I.showAllFilter(filter);
//	}
//
//	public Collection<Interaction> showAllSearch(String search) {
//		return I.showAllSearch(search);
//	}
//	
}
