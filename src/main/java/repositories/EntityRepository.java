package repositories;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import models.Entity_;

public abstract class EntityRepository<T extends Entity_>  {

	@PersistenceContext 
	protected EntityManager entityManager;
	
	
	public T create(T obj) {
		return entityManager.merge(obj);
	}
	
	
	public abstract Class <T> getEntityClass();
	public abstract String getAllEntityQueryName();
	
	protected abstract String getAllIdsQueryName();
	
	
	
	public T save(T entity)

	{
		return entityManager.merge(entity);
	}
	
	
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
	
	public void deleteEntity(long removeId) {
		
		T entity = entityManager.find(getEntityClass(), removeId);
	//	entityManager.
		entityManager.remove(entity);
		
	}
	
	
	
	
	
}
