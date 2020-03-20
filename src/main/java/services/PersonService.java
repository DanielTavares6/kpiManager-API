package services;

import javax.inject.Inject;
import javax.transaction.Transactional;

import models.Person;
import repositories.PersonRepository;

@Transactional
public abstract class PersonService <R extends PersonRepository<E>, E extends Person> 

{

	@Inject
	protected R repository;
	
}

