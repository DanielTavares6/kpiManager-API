package services;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.BadRequestException;

import models.Manager;
import models.dto.ManagerDTO;
import repositories.ManagerRepository;
import utils.PasswordUtils;

@RequestScoped // Avoid circular dependency between services
public class ManagerService {

	@Inject
	protected ClientService CLIENT_SERVICE;

	@Inject // vai ser injectada em runtime pelo cdi
	protected ManagerRepository repository;

	@Transactional
	public Manager create(ManagerDTO entity) {

		Manager m = new Manager();
		
		String password = entity.getPassword();
		String [] hashcode = passwordToHashcode(password);
		m = entity.normalize(entity, m,hashcode[1],hashcode[0]);

		return repository.create(m);
	}

	public void checkIfPasswordValid(ManagerDTO userDTO, String password) throws Exception {
		Manager myUser = repository.getManagerByUsername(userDTO.getUsername());
		String key = myUser.getHashcode();
		String salt = myUser.getSalt();
		if (!PasswordUtils.verifyPassword(password, key, salt))

			throw new BadRequestException("Invalid Password");
	}

	public String[] passwordToHashcode(String password) {
		String salt = PasswordUtils.generateSalt(50).get();
		String key = PasswordUtils.hashPassword(password, salt).get();
		String[] result = { key, salt };
		return result;
	}

}
