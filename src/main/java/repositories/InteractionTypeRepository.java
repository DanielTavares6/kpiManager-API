package repositories;

import models.InteractionType;
import models.Unit;

public class InteractionTypeRepository extends EntityRepository <InteractionType> {

	@Override
	public Class<InteractionType> getEntityClass() 
	
	{
		return InteractionType.class;
	}

	@Override
	public String getAllEntityQueryName() 
	
	{
		return Unit.GET_ALL_UNITS_QUERY_NAME;
	}

	@Override
	protected String getAllIdsQueryName()
	
	{
		return Unit.GET_ALL_UNITS_IDS;
	}

	
	
}
