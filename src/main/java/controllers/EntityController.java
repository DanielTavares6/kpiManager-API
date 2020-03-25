package controllers;

import java.util.Collection;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import models.Entity_;
import repositories.EntityRepository;
import services.EntityService;

public abstract class EntityController<S extends EntityService<R, E>, R extends EntityRepository<E>, E extends Entity_> {

	@Inject // Inject generic variable in runtime
	protected S service;

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public E save(E entity) {
		E current = service.create(entity);
		return current;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)

	public Collection<E> showAllEntities()

	{
		return service.showAllEntities();
	}

	@GET
	@Path("allIds")
	@Produces(MediaType.APPLICATION_JSON)

	public List<Long> getAllIds()

	{
		return service.getAllKeys();
	}


	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)

	public E getEntity(@PathParam("id") long id)

	{
		return service.getObject(id);
	}

}
