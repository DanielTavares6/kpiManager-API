package services;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.NoResultException;
import javax.transaction.Transactional;
import javax.ws.rs.BadRequestException;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.sendgrid.Email;
import com.sendgrid.Mail;
import com.sendgrid.Method;
import com.sendgrid.Personalization;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;

import models.Person;
import models.dto.PersonDTO;
import repositories.PersonRepository;
import utils.PasswordUtils;

@RequestScoped
public class PersonService extends EntityService<PersonRepository, Person>

{

	@Inject
	protected ClientService CLIENT_SERVICE;

	
	@Transactional
	public Person create(PersonDTO entity) throws Exception
	{
		
		if(checkUserExists(entity.getUsername()) == true) {
			
			throw new Exception("Username already exists in database!");
			
		}else if(checkEmailExists(entity.getEmail()) == true) {
			
			throw new Exception("Email already exists in database!");
		}
		else {
			Person m = new Person();

			String password = entity.getPassword();
			String[] hashcode = passwordToHashcode(password);
			m = entity.normalize(entity, m, hashcode[1], hashcode[0]);
			try {
				sendGrid(entity);
			} catch (IOException e) {
				e.printStackTrace();
			}
			return repository.create(m);
		}
	}

	
	public String checkIfPasswordValid(PersonDTO userDTO, String password) throws Exception

	{
		// create JWT (Signed) -->JWS
		Person myUser = repository.getManagerByUsername(userDTO.getUsername());
		Algorithm algorithm = Algorithm.HMAC256(myUser.getSalt() + myUser.getHashcode());
        String token = JWT.create()
        .withClaim("username", userDTO.getUsername())
        .withClaim("role", myUser.getRole())
        .sign(algorithm);
        System.out.println(token);
		
		String key = myUser.getHashcode();
		String salt = myUser.getSalt();
		if (!PasswordUtils.verifyPassword(password, key, salt)) {

			throw new BadRequestException("Invalid Password");
		}
		return token;
	}

	public String[] passwordToHashcode(String password)

	{
		String salt = PasswordUtils.generateSalt(50).get();
		String key = PasswordUtils.hashPassword(password, salt).get();
		String[] result = { key, salt };
		return result;
	}

	//send email when SuperUser creates a new manager.CHANGE EMAIL
	public void sendGrid(PersonDTO entity) throws IOException {

		Mail mail = new Mail();
		Email from = new Email("kpimanager13@gmail.com");
		Email to = new Email("pedrogabrielbeirao@live.com.pt"); // use your own email address here
		mail.setFrom(from);
		mail.setTemplateId("d-d2707774fecd4221b757231424f79fc2");

		Personalization personalization = new Personalization();
		personalization.addDynamicTemplateData("username", entity.getUsername());
		personalization.addDynamicTemplateData("password", entity.getPassword());
		personalization.addTo(to);
		mail.addPersonalization(personalization);

		SendGrid sg = new SendGrid(System.getProperty("SGKey"));
		Request request = new Request();

		try {
			request.setMethod(Method.POST);
			request.setEndpoint("mail/send");
			request.setBody(mail.build());

			Response response = sg.api(request);

			System.out.println(response.getStatusCode());
			System.out.println(response.getHeaders());
			System.out.println(response.getBody());
		} catch (IOException ex) {
			ex.printStackTrace();
			throw ex;
		}

	}

	public Boolean checkUserExists(String username) {
		boolean flag = false;
		try {
		Person check = repository.getManagerByUsername(username);
		System.out.println("username: try"+ check.getUsername());
		if(check.getUsername().length() != 0) {
			System.out.println("username igual"+ check.getUsername());
			flag = true;
		} 
		}catch(NoResultException nre) {
			flag = false;
		}
		return flag ;
	}
	
	public Boolean checkEmailExists(String email) {
		boolean flag = false;
		try {
		Person check = repository.getManagerByEmail(email);
		System.out.println("mail try:"+ check.getEmail());
		if(check.getEmail().length() != 0) {
			System.out.println("mail try equal:"+ check.getEmail());
			flag = true;
		} 
		} catch(NoResultException nre) {
			System.out.println( nre);
			flag = false;
		}
		return flag;
	}
}

	


