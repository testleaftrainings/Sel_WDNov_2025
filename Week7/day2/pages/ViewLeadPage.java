package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Then;

public class ViewLeadPage extends ProjectSpecificMethod {

	@Then("user verify the lead id using the company name")
	public ViewLeadPage user_verify_the_lead_id_using_the_company_name() {
		String text = getrDriver().findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text);
		return this;
	}
}
