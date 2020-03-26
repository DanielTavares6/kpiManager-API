package repositories;

import models.Interaction;

public class InteractionRepository extends EntityRepository <Interaction>{

	@Override
	public Class<Interaction> getEntityClass() {

		return null;
	}

	@Override
	public String getAllEntityQueryName() {

		return null;
	}

	@Override
	protected String getAllIdsQueryName() {

		return null;
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
