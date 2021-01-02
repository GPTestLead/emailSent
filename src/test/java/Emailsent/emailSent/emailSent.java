package Emailsent.emailSent;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class emailSent {

	public static void main(String[] args) throws EmailException {
		
		sentEmail();

	}

	public static void sentEmail() throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("garvita1m", "123"));
		email.setSSL(true);
		email.setFrom("garvita160109@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("garvita.chem@gmail.com");
		email.send();
	}

}
