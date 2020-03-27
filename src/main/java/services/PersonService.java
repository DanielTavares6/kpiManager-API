package services;

import java.io.IOException;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.BadRequestException;

import com.sendgrid.Content;
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
	public Person create(PersonDTO entity)

	{

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

}
