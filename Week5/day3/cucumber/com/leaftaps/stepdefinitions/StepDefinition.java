package com.leaftaps.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	@Given("launch the browser and load the URL")
	public void launch_the_browser_and_load_the_url() {
	    System.out.println("browser is launched url is loaded ");
	}

	@When("user enters the username as demosalesmanager")
	public void user_enters_the_username_as_demosalesmanager() {
		 System.out.println("user enters the username as demosalesmanager");
	}

	@When("user enters the password as crmsfa")
	public void user_enters_the_password_as_crmsfa() {
		 System.out.println("user enters the password as crmsfa");
	}

	@When("user clicks the submit button")
	public void user_clicks_the_submit_button() {
		 System.out.println("user clicks the submit button");
	}

	@When("user clicks the crmsfa link")
	public void user_clicks_the_crmsfa_link() {
		 System.out.println("user clicks the crmsfa link");
	}
	@When("user clicks the leads link")
	public void user_clicks_the_leads_link() {
		 System.out.println("user clicks the leads link");
	}

	@When("user clicks the create lead link")
	public void user_clicks_the_create_lead_link() {
		 System.out.println("user clicks the create lead link");
	}

	@When("user enters the company name as Testleaf")
	public void user_enters_the_company_name_as_testleaf() {
		 System.out.println("user enters the company name as Testleaf");
	}

	@When("user enters the first name as Bhuvanesh")
	public void user_enters_the_first_name_as_bhuvanesh() {
		 System.out.println("user enters the first name as Bhuvanesh");
	}

	@When("user enters the last name as M")
	public void user_enters_the_last_name_as_m() {
		 System.out.println("user enters the last name as M");
	}

	@When("user enters the phone number")
	public void user_enters_the_phone_number() {
		 System.out.println("user enters the phone number");
	}

	@Then("user verify the lead id using the company name")
	public void user_verify_the_lead_id_using_the_company_name() {
		 System.out.println("user verify the lead id using the company name");
	}


}
