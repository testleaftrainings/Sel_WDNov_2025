package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod {
	
	public WelcomePage(RemoteWebDriver driver) {
		this.driver=driver;
	}

	public MyHomePage user_clicks_the_crmsfa_link() {
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	}
}
