package repositories;

import models.Client;
import models.Unit;

public class UnitRepository extends EntityRepository <Unit>{

	@Override
	public Class<Unit> getEntityClass() 
	
	{
		return Unit.class;
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

	@Override
	protected String getAllWeeksQueryName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getAllClientsQueryName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getAllBManagersQueryName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getAllUnitiesQueryName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getAllInteractionsQueryName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getAllFilterQueryName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getAllSearchQueryName() {
		// TODO Auto-generated method stub
		return null;
	}

}
