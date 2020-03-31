package repositories;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.NoResultException;

import models.Person;

@ApplicationScoped
public class PersonRepository extends EntityRepository <Person>

{

		public Person getManagerByUsername(String username) throws NoResultException {
			
			return entityManager.createNamedQuery(Person.GET_PERSON_BY_USERNAME,Person.class)
					.setParameter("username", username)
					.getSingleResult();
		
		}
		
		public Person getManagerByEmail(String email) throws NoResultException {

			return entityManager.createNamedQuery(Person.GET_PERSON_BY_EMAIL,Person.class)
					.setParameter("email", email)
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

}























