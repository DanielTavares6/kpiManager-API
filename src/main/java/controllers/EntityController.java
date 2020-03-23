package controllers;

import javax.inject.Inject;

import models.Entity_;
import repositories.EntityRepository;
import services.EntityService;

public abstract class EntityController<S extends EntityService<R, E>, R extends EntityRepository<E>, E extends Entity_> {

	@Inject // variavel ser injetada em runtime
	protected S service;
}
