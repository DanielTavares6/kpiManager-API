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
	
	
}
