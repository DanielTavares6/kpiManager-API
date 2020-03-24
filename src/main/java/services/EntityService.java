package services;

import java.util.Collection;
import java.util.List;

import javax.inject.Inject;

import models.Entity_;
import repositories.EntityRepository;

public abstract class EntityService<R extends EntityRepository<E>, E extends Entity_> {
 	
	@Inject // vai ser injectada em runtime pelo cdi
	protected R repository;
	
	
	public Collection<E> showAllEntities() 
	
	{	
		return repository.getAll();
	}

	public E getObject(long id)

	{
		return repository.getObj(id);
	}
	
	public List<Long> getAllKeys()

	{
		return repository.getAllKeys();
	}
	
	public Collection<String> showAllWeeks() {
		return repository.showAllWeeks();
	}


	
	
	
	
	
}
