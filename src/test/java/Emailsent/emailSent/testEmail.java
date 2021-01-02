package Emailsent.emailSent;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.apache.commons.mail.EmailException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class testEmail {
  @Test
  public void f() {
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() throws EmailException {
	  emailSent.sentEmail();
  }

  

}
