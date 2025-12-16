package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.When;

public class MyHomePage extends ProjectSpecificMethod {
	
	@When("user clicks the leads link")
	public LeadsPage user_clicks_the_leads_link() {
		getrDriver().findElement(By.linkText("Leads")).click();
		return  new LeadsPage();
	}
}
