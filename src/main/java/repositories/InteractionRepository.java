package repositories;

import java.util.Collection;

import models.Interaction;

public class InteractionRepository extends EntityRepository <Interaction>{

	protected String getAllWeeksQueryName() {
		return Interaction.GET_ALL_WEEKS;
	}
	
	protected String getAllWeeksFilterQueryName() {
		return Interaction.GET_ALL_WEEKS_FILTER;
	}
	
	protected String getAllClientsQueryName() {
		return Interaction.GET_ALL_CLIENTS;
	}
	protected String getAllClientsFilterQueryName() {
		return Interaction.GET_ALL_CLIENTS_FILTER;
	}
	
	protected String getAllBManagersQueryName() {
		return Interaction.GET_ALL_B_MANAGERS;
	}
	
	protected String getAllBManagersFilterQueryName() {
		return Interaction.GET_ALL_B_MANAGERS_FILTER;
	}
	protected String getAllUnitiesQueryName() {
		return Interaction.GET_ALL_UNITIES;
	}
	protected String getAllUnitiesFilterQueryName() {
		return Interaction.GET_ALL_UNITIES_FILTER;
	}
	protected String getAllInteractionsQueryName() {
		return Interaction.GET_ALL_INTERACTIONS;
	}
	protected String getAllInteractionsFilterQueryName() {
		return Interaction.GET_ALL_INTERACTIONS_FILTER;
	}
//	protected String getAllFilterQueryName() {
//		return Interaction.GET_ALL_FILTER;
//	}
	protected String getAllSearchQueryName() {
		return Interaction.GET_ALL_SEARCH;
	}
	
	protected String getAllQueryName() {
		return Interaction.GET_ALL;
	}
	
	@Override
	public Class<Interaction> getEntityClass() {

		return null;
	}

	@Override
	public String getAllEntityQueryName() {

		return null;
	}

	@Override
	protected String getAllIdsQueryName() {

		return null;
	}
//	
	public Collection<Interaction> showAll() {
		return entityManager.createNamedQuery(getAllQueryName()).getResultList();
	}

	public Collection<String> showAllWeeks() {
		
		return entityManager.createNamedQuery
				(getAllWeeksQueryName(), String.class)
				.getResultList();
	}
	
	public Collection<Interaction> showAllWeeksFilter(String filter) {
		
		return entityManager.createNamedQuery
				(getAllWeeksFilterQueryName()).setParameter("filter", filter)
				.getResultList();
	}
	
	public Collection<String> showAllClients() {
		
		return entityManager.createNamedQuery
				(getAllClientsQueryName(), String.class)
				.getResultList();
	}
	
	public Collection<Interaction> showAllClientsFilter(String filter) {
		return entityManager.createNamedQuery
				(getAllClientsFilterQueryName()).setParameter("filter", filter)
				.getResultList();
	}
	
	public Collection<String> showAllBManagers() {
		
		return entityManager.createNamedQuery
				(getAllBManagersQueryName(), String.class)
				.getResultList();
	}
	
	public Collection<Interaction> showAllBManagersFilter(String filter) {
		return entityManager.createNamedQuery
				(getAllBManagersFilterQueryName()).setParameter("filter", filter)
				.getResultList();
	}

	public Collection<String> showAllInteractions() {
		
		return entityManager.createNamedQuery
				(getAllInteractionsQueryName(), String.class)
				.getResultList();
	}
	
	public Collection<Interaction> showAllInteractionsFilter(String filter) {
		return entityManager.createNamedQuery
				(getAllInteractionsFilterQueryName()).setParameter("filter", filter)
				.getResultList();
	}

	public Collection<String> showAllUnities() {
		
		return entityManager.createNamedQuery
				(getAllUnitiesQueryName(), String.class)
				.getResultList();
	}
	
	public Collection<Interaction> showAllUnitiesFilter(String filter) {
		
		return entityManager.createNamedQuery
				(getAllUnitiesFilterQueryName()).setParameter("filter", filter)
				.getResultList();
	}

//	public Collection<Interaction> showAllFilter(String filter) {
//		return entityManager.createNamedQuery
//				(getAllFilterQueryName(), getEntityClass()).setParameter("filter", filter)
//				.getResultList();
//	}
	
	public Collection<Interaction> showAllSearch(String search) {
		return entityManager.createNamedQuery
				(getAllSearchQueryName(), getEntityClass()).setParameter("search", search).getResultList();
	}

	

	

	

}
