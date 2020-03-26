package controllers;

import javax.ws.rs.Path;

import models.Unit;
import repositories.UnitRepository;
import services.UnitService;

@Path("units")
public class UnitController extends EntityController<UnitService, UnitRepository, Unit>

{
	
}
