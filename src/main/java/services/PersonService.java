package services;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.BadRequestException;

import models.Person;
import models.dto.PersonDTO;
import repositories.PersonRepository;
import utils.PasswordUtils;

@RequestScoped
public class PersonService extends EntityService<PersonRepository,Person>

{

	@Inject
	protected ClientService CLIENT_SERVICE;

	@Transactional
	public Person create(PersonDTO entity)
	
	{

		Person m = new Person();
		
		String password = entity.getPassword();
		String [] hashcode = passwordToHashcode(password);
		m = entity.normalize(entity, m, hashcode[1], hashcode[0]);

		return repository.create(m);
	}

	public void checkIfPasswordValid(PersonDTO userDTO, String password) throws Exception 
	
	{
		Person myUser = repository.getManagerByUsername(userDTO.getUsername());
		String key = myUser.getHashcode();
		String salt = myUser.getSalt();
		if (!PasswordUtils.verifyPassword(password, key, salt))

			throw new BadRequestException("Invalid Password");
	}

	public String[] passwordToHashcode(String password) 
	
	{
		String salt = PasswordUtils.generateSalt(50).get();
		String key = PasswordUtils.hashPassword(password, salt).get();
		String[] result = { key, salt };
		return result;
	}
	
	
	
}

