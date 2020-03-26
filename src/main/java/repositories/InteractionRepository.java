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

}
