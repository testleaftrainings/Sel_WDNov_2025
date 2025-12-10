package runner;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC002_CreateLead extends ProjectSpecificMethod {

	@Test
	public void runCreateLeatTest() {
		System.out.println("From runner TC002 : "+driver);
		// b36a35fc-5cae-479d-8fad-22df90b73a03
		LoginPage user = new LoginPage(driver);
		
		// Singleton design pattern --> constructor chaining
		user.enterUsername().enterPassword().clickLoginButton()
		       .user_clicks_the_crmsfa_link()
				  .user_clicks_the_leads_link()
				     .user_clicks_the_create_lead_link();

	}
}
