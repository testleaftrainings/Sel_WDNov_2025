package com.leaftaps.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class StepDefinitionTwo extends Base{
	@When("user clicks the find lead link")
	public void user_clicks_the_find_lead_link() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@When("user clicks the phone tab")
	public void user_clicks_the_phone_tab() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}

	@When("user enters the phone number of the lead id")
	public void user_enters_the_phone_number() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("98127");// hard coding the test data is allowed
	}
	@When("user clicks the find lead button")
	public void user_clicks_the_find_lead_button() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	@When("user select the first lead for the list")
	public void user_select_the_first_lead_for_the_list() {
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a")).click();
	}
	@When("user click the edit button")
	public void user_click_the_edit_button() {
		driver.findElement(By.linkText("Edit")).click();
	}
	@When("user edits the existing leads data")
	public void user_edits_the_existing_leads_data() {
		WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys("Qualitest");	}
	@When("user clicks the update button")
	public void user_clicks_the_update_button() {
		driver.findElement(By.name("submitButton")).click();
	}
}
