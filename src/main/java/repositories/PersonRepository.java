package repositories;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.PersistenceContext;

import models.Person;


public abstract class PersonRepository<T extends Person> extends EntityRepository<T>

{
	@Override
	public T create(T obj) {
		return entityManager.merge(obj);
	}

}























