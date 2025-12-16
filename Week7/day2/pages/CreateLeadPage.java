package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.When;

public class CreateLeadPage extends ProjectSpecificMethod{
	@When("user enters the company name as {string}")
	public CreateLeadPage user_enters_the_company_name_as_testleaf(String cname) {
		getrDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		return this;
	}

	@When("user enters the first name as {string}")
	public CreateLeadPage user_enters_the_first_name_as_bhuvanesh(String fname) {
		getrDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
	}

	@When("user enters the last name as {string}")
	public CreateLeadPage user_enters_the_last_name_as_m(String lname) {
		getrDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;
	}

	@When("user enters the phone number as {string}")
	public CreateLeadPage user_enters_the_phone_number(String phNo) {
		getrDriver().findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
		return this;
	}
	
	@When("user clicks the create lead submit button")
	public ViewLeadPage user_clicks_the_create_lead_submit_button() {
		getrDriver().findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
	}
	
	@When("user verify the error message")   
	public CreateLeadPage user_verify_the_error_message() throws InterruptedException {
		Thread.sleep(2000);
	   String text = getrDriver().findElement(By.className("errorList")).getText();
	   System.out.println(text);
	   return this;
	}

}
