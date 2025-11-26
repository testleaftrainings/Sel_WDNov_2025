package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateLead {

	@Test
	public void runCreateLead() throws InterruptedException {

		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		// enter the valid username - DemoSalesManager
		WebElement usernameField = driver.findElement(By.id("username"));
		usernameField.sendKeys("DemoSalesManager");
		// enter the valid password - crmsfa
		WebElement passwordField = driver.findElement(By.name("PASSWORD"));
		passwordField.sendKeys("crmsfa");
		// click the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		// click the crm/sfa link
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		// click the leads link
		driver.findElement(By.linkText("Leads")).click();
		// validate the title 
		String actualTitle = driver.getTitle();// helps to retrieve the title of the window 
		String expectedTitle = "My Leads | opentaps CRM";
		Thread.sleep(2000);
		// Asserts that two Strings are equal. If they are not, an AssertionError, with the given message, is thrown
		Assert.assertEquals(expectedTitle,actualTitle,"Verification of the title is not success");
		driver.findElement(By.linkText("Create Lead")).click();
		WebElement selectDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select select = new Select(selectDD);
		// M3 : selectByValue
		select.selectByValue("LEAD_EMPLOYEE");
		Thread.sleep(2000);
		driver.close();// helps to close the last window in the browser
	}
}
