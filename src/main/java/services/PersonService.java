package services;

import javax.inject.Inject;
import javax.transaction.Transactional;

import models.Person;
import repositories.PersonRepository;


public abstract class PersonService <R extends PersonRepository<E>, E extends Person> extends EntityService<R,E>

{

//	@Inject
//	protected R repository;
	
}

