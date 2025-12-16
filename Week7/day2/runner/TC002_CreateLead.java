package runner;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC002_CreateLead extends ProjectSpecificMethod {
	
	 @BeforeClass
	  public void selectDataPath() {
		  filePath= "CreateLead";
	  }
	 
	 @Test(dataProvider = "fetchData")
	public void runCreateLeatTest(String uname,String pword,String cname,String fname,String lname,String phno) throws IOException {
		System.out.println("From runner TC002 : "+getrDriver());
		// 
		LoginPage user = new LoginPage();
		
		// Singleton design pattern --> constructor chaining
		user.enterUsername(uname).enterPassword(pword).clickLoginButton()
		       .user_clicks_the_crmsfa_link()
				  .user_clicks_the_leads_link()
				     .user_clicks_the_create_lead_link()
				     .user_enters_the_company_name_as_testleaf(cname)
				     .user_enters_the_first_name_as_bhuvanesh(fname)
				     .user_enters_the_last_name_as_m(lname)
				     .user_enters_the_phone_number(phno)
				     .user_clicks_the_create_lead_submit_button()
				     .user_verify_the_lead_id_using_the_company_name();

	}
}
