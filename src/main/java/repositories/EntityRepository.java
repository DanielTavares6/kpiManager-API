package repositories;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import models.Entity_;
import models.Manager;

public abstract class EntityRepository<T extends Entity_>  {

	@PersistenceContext 
	protected EntityManager entityManager;
	
	
	public abstract Class <T> getEntityClass();
	public abstract String getAllEntityQueryName();
	protected abstract String getAllIdsQueryName();
	protected abstract String getAllWeeksQueryName();
	protected abstract String getAllClientsQueryName();
	protected abstract String getAllBManagersQueryName();
	protected abstract String getAllUnitiesQueryName();
	protected abstract String getAllInteractionsQueryName();
	
	public T getObj(long id)

	{
		return entityManager.find
				(getEntityClass(), id) ;
	}


	public Collection<T> getAll()

	{ 
		return entityManager.createNamedQuery
				(getAllEntityQueryName(), getEntityClass())
				.getResultList();
	}

	
	public List<Long> getAllKeys()

	{
		return entityManager.createNamedQuery
				(getAllIdsQueryName(), Long.class)
				.getResultList();
	}
	
	public Collection<String> showAllWeeks() {
		
		return entityManager.createNamedQuery
				(getAllWeeksQueryName(), String.class)
				.getResultList();
	}
	
	public Collection<String> showAllClients() {
		
		return entityManager.createNamedQuery
				(getAllClientsQueryName(), String.class)
				.getResultList();
	}
	
	public Collection<String> showAllBManagers() {
		
		return entityManager.createNamedQuery
				(getAllBManagersQueryName(), String.class)
				.getResultList();
	}
	
	public Collection<String> showAllInteractions() {
		
		return entityManager.createNamedQuery
				(getAllInteractionsQueryName(), String.class)
				.getResultList();
	}

	public Collection<String> showAllUnities() {
		
		return entityManager.createNamedQuery
				(getAllUnitiesQueryName(), String.class)
				.getResultList();
	}
	
	
}
