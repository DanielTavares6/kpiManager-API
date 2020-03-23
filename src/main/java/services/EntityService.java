package services;

import javax.inject.Inject;

import models.Entity_;
import repositories.EntityRepository;

public abstract class EntityService<R extends EntityRepository<E>, E extends Entity_> {
 	
	@Inject // vai ser injectada em runtime pelo cdi
	protected R repository;
}
