package repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import models.Person;

public abstract class PersonRepository<T extends Person>

{

	@PersistenceContext
	protected EntityManager entityManager;


}























