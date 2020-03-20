package controllers;

import javax.inject.Inject;

import models.Person;
import repositories.PersonRepository;
import services.PersonService;

public abstract class PersonController<S extends PersonService<R, E>, R extends PersonRepository<E>, E extends Person> 

{
	@Inject
	private S service;


}
