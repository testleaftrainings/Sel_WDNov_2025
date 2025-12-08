package com.leaftaps.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.leaftaps.hooks.HooksImplementation;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//io.cucumber.java.InvalidMethodException: 
//You're not allowed to extend classes that define Step Definitions or hooks
public class StepDefinition extends Base {
	
    String cname;
	//io.cucumber.testng.UndefinedStepException
	@When("user enters the username as {string}")
	public void user_enters_the_username_as_demosalesmanager(String uname) {
		WebElement usernameField = driver.findElement(By.id("username"));
		usernameField.sendKeys(uname);
	}

	@When("user enters the password as {string}")
	public void user_enters_the_password_as_crmsfa(String password) {
		WebElement passwordField = driver.findElement(By.name("PASSWORD"));
		passwordField.sendKeys(password);
	}

	@When("user clicks the submit button")
	public void user_clicks_the_submit_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@When("user clicks the crmsfa link")
	public void user_clicks_the_crmsfa_link() {
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
	}
	@When("user clicks the leads link")
	public void user_clicks_the_leads_link() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@When("user clicks the create lead link")
	public void user_clicks_the_create_lead_link() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@When("user enters the company name as (.*)$")
	public void user_enters_the_company_name_as_testleaf(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		this.cname=cname;
	}

	@When("user enters the first name as (.*)$")
	public void user_enters_the_first_name_as_bhuvanesh(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	}

	@When("user enters the last name as (.*)$")
	public void user_enters_the_last_name_as_m(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	}

	@When("user enters the phone number as (.*)$")
	public void user_enters_the_phone_number(String phNo) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
	}
	
	//io.cucumber.core.runner.DuplicateStepDefinitionException
	@When("user clicks the create lead submit button")
	public void user_clicks_the_create_lead_submit_button() {
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("user verify the lead id using the company name")
	public void user_verify_the_lead_id_using_the_company_name() {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(cname)) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}	
		}
   //io.cucumber.testng.UndefinedStepException
	@When("user closes the browser")
	public void user_closes_the_browser() {
	   driver.close();
	}
	@When("user verify the error message")   
	public void user_verify_the_error_message() throws InterruptedException {
		Thread.sleep(2000);
	   String text = driver.findElement(By.className("errorList")).getText();
	   System.out.println(text);
	}
}
