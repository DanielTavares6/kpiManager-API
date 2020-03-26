package repositories;

import javax.enterprise.context.ApplicationScoped;

import models.Person;

@ApplicationScoped
public class PersonRepository extends EntityRepository <Person>

{

		public Person getManagerByUsername(String username) {
			
			return entityManager.createNamedQuery(Person.GET_PERSON_BY_USERNAME,Person.class)
					.setParameter("username", username)
					.getSingleResult();
		}
		
		@Override
		public Class <Person> getEntityClass() {
			return Person.class;
		}

		@Override
		public String getAllEntityQueryName() {
			return Person.GET_ALL_PERSON_QUERY_NAME;
		}

		@Override
		protected String getAllIdsQueryName() {
			return Person.GET_ALL_PERSON_IDS;
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























