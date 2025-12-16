package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import base.ProjectSpecificMethod;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethod{

	@When("user enters the username as {string}")
	public LoginPage enterUsername(String uname) throws IOException {
	      try {
			getrDriver().findElement(By.id("username")).sendKeys(uname);
			reportStep("PASS","User name is entered successfully");
		} catch (Exception e) {
			reportStep("FAIL","User name not entered"+e);
		}
	      return this;
	}
	
	@When("user enters the password as {string}")
	public LoginPage enterPassword(String password) throws IOException {
	      try {
			getrDriver().findElement(By.name("PASSWORD")).sendKeys(password);
			reportStep("PASS","password is entered successfully");

		} catch (Exception e) {
			reportStep("FAIL","password not entered"+e);
		}
	      return this;
	}
	
	@When("user clicks the submit button")
	public WelcomePage clickLoginButton() throws IOException {
          try {
			getrDriver().findElement(By.className("decorativeSubmit")).click();
			reportStep("PASS","Login button is clicked successfully");
		} catch (Exception e) {
			reportStep("FAIL","Login button cannot accept the click action"+e);
		}
          return new WelcomePage();
	}
}
