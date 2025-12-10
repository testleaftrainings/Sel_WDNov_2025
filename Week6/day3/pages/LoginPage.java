package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod{

	public LoginPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	public LoginPage enterUsername() {
		System.out.println("From Pages : "+driver);
		//java.lang.NullPointerException:
	      driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	      return this;
	}
	public LoginPage enterPassword() {
	      driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	      return this;
	}
	public WelcomePage clickLoginButton() {
          driver.findElement(By.className("decorativeSubmit")).click();
          return new WelcomePage(driver);
	}
}
