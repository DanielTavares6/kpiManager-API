package services;

import java.util.Collection;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import models.Entity_;
import repositories.EntityRepository;

@Transactional
public abstract class EntityService<R extends EntityRepository<E>, E extends Entity_> {
 	
	@Inject // It's going to be injected in runtime by CDI
	protected R repository;
	
	public E create (E entity) {
		return repository.create(entity);
	}
	
	public E save(E object) throws Exception

	{
		return repository.save(object);
	}
	
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


	
	
	
	
	
}