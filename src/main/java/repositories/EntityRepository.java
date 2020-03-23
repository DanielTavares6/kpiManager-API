package repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import models.Entity_;

public class EntityRepository<T extends Entity_>  {

	@PersistenceContext 
	protected EntityManager entityManager;
	
	public T getEntity(T entity) {
		return entityManager.merge(entity);
	}
}
