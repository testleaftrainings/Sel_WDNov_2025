package runner;

import org.testng.annotations.Test;
import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC001_Login extends ProjectSpecificMethod {

	@Test
	public void runLoginTest() {
		// Builder pattern
		System.out.println("From runner TC001 : "+driver);
		// 1de56b12-479a-443f-8ab9-20f262801d01
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton();
		
	}
	
}
