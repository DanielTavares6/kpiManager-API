package controllers;

import models.Manager;
import models.Person;
import repositories.PersonRepository;
import services.PersonService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


public abstract class PersonController<S extends PersonService<R, E>, R extends PersonRepository<E>, E extends Person> 

{
	@Inject
	protected S service;


}
