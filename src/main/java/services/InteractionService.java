package services;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.QueryParam;

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
	
	public Collection<Interaction> showAllBetween(int startIndex, int quantity) {
		return I.showAllBetween(startIndex, quantity);
	}

	 /**************************
	 * Dashboard Module Starts *
	 **************************/
	
	/**
	 * Gets all cvs sent per manager per week
	 * @param manager manager name
	 * @param week week of cv sent
	 * @return a collection containing all cvs sent by week
	 */
	public Collection<Interaction> getAllCvsPerWeekPerManager(String manager, String week) {
		return I.getAllCvsPerWeekPerManager(manager, week);
	}
	
	/**
	 * Counts all cvs sent per manager per week
	 * @param manager manager name
	 * @param week week of cv sent
	 * @return the count of all cvs set per manager per week
	 */
	public long countAllCvsPerWeekPerManager(String manager, String week) {
		return I.countAllCvsPerWeekPerManager(manager, week);
	}
	
	/**
	 * Counts all interactions per business unit
	 * @param unit business unit
	 * @return the count of all interactions
	 */
	public long countAllInteractionsPerUnit(String unit) {
		return I.countAllInteractionsPerUnit(unit);
	}
	
	/**
	 * Counts all interactions per interaction type
	 * @param interactionType interaction type
	 * @return the count of all interactions
	 */
	public long countAllInteractionsPerInteractionType(String interactionType) {
		return I.countAllInteractionsPerInteractionType(interactionType);
	}
	
	/**
	 * Counts all interactions per client
	 * @param clientName client name
	 * @return the count of all interactions
	 */
	public long countAllInteractionsPerClient(String clientName) {
		return I.countAllInteractionsPerClient(clientName);
	}


	public Collection<Interaction> filtrer(String myselectWeek, String myselectUnity, String myselectClient, String myselectBM,String myselectInteration) {
		return I.filtrer(myselectWeek, myselectUnity, myselectClient, myselectBM, myselectInteration);
	}
	
	public long countAllContractsPerWeek(String week) {
		return I.countAllContractsPerWeek(week);
	}

	
	/************************
	* Dashboard Module Ends *
	************************/
	
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
