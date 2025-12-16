package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.When;

public class WelcomePage extends ProjectSpecificMethod {
	
	
	@When("user clicks the crmsfa link")
	public MyHomePage user_clicks_the_crmsfa_link() {
		getrDriver().findElement(By.partialLinkText("CRM/SFA")).click();
		return new MyHomePage();
	}
}
