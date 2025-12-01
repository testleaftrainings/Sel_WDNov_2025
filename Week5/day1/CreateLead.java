package week5.day1;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethods {
	@Test
	public void runCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Qualitest");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bhuvanesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Moorthy");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("98127");
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
	}
}
