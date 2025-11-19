package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnImplicitlyWait {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//Specifies the amount of time the driver should wait when searching for an element if it is not immediately present.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://leaftaps.com/opentaps/control/main");
		// enter the valid username - DemoSalesManager
		WebElement usernameField = driver.findElement(By.id("username"));
		usernameField.sendKeys("DemoSalesManager");
		// enter the valid password - crmsfa
		WebElement passwordField = driver.findElement(By.name("PASSWORD"));
		passwordField.sendKeys("crmsfa");
		// click the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.close();
	}
}
