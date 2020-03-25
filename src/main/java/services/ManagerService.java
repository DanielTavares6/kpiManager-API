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
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;

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
		String[] hashcode = passwordToHashcode(password);
		m = entity.normalize(entity, m, hashcode[1], hashcode[0]);
		try {
			sendGrid();
		} catch (IOException e) {
			e.printStackTrace();
		}
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

	public void sendGrid() throws IOException {

		Email from = new Email("kpimanager13@gmail.com");
		Email to = new Email("danieljosetavares@gmail.com"); // use your own email address here

		String subject = "Sending email test";
		Content content = new Content("text/html", "and <em>easy</em> to do anywhere with <strong>Java</strong>");

		Mail mail = new Mail(from, subject, to, content);

		SendGrid sg = new SendGrid("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");
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
			throw ex;
		}

	}
}
