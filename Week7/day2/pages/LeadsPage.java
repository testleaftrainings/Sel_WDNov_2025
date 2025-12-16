package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.When;

public class LeadsPage  extends ProjectSpecificMethod{
	
	@When("user clicks the create lead link")
	public CreateLeadPage user_clicks_the_create_lead_link() {
		getrDriver().findElement(By.linkText("Create Lead")).click();
	    return new CreateLeadPage();
	}
}
