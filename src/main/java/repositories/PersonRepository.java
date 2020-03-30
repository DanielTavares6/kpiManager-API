package repositories;

import java.util.Collection;

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
		
		
		public Collection<Person> showAllEntitiesByUnit(long unitId)
		
		{
			
			return entityManager.createNamedQuery(Person.GET_MANAGERS_BY_UNIT,Person.class)
					.setParameter("unit", unitId) // It's going to substitute unit in query by unitId defined from endpoint
					.getResultList();
			
		}
		
		
		public Collection<Person> showAllManagers()
		
		{
			
			return entityManager.createNamedQuery(Person.GET_MANAGERS,Person.class)
					.getResultList();
			
		}
		
		
		public Collection<Person> showAllDirectors()
		
		{
			
			return entityManager.createNamedQuery(Person.GET_DIRECTORS,Person.class)
					.getResultList();
			
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























