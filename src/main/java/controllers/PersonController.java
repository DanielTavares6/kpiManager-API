package controllers;

import models.Person;
import repositories.PersonRepository;
import services.PersonService;

import javax.inject.Inject;

public abstract class PersonController<S extends PersonService<R, E>, R extends PersonRepository<E>, E extends Person> extends EntityController <S,R,E>  

{
	@Inject
	private S service;

}
