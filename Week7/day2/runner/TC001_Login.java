package runner;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC001_Login extends ProjectSpecificMethod {

	@BeforeTest
	  public void selectDataPath() {
		  filePath= "LoginTest";
		  testName="Login Check";
		  testDescription="Test to verify the application accepts the valid credentials";
		  testAuthor="Bhuvanesh";
		  testCategory="Smoke";
	  }
	@Test(dataProvider = "fetchData")
	public void runLoginTest(String uname,String pword) throws IOException {
		
		LoginPage lp = new LoginPage();
		lp.enterUsername(uname)
		.enterPassword(pword)
		.clickLoginButton();
		
	}
	
}
