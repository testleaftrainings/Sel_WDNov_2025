package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnModalAlert {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		driver.switchTo().alert().accept();
		String confirmationText= driver.findElement(By.id("simple_result")).getText();
		System.out.println(confirmationText);
		// confirmation alert
		driver.findElement(By.xpath("//h5[contains(text(),'Confirm Dialog')]/following-sibling::button")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
		// prompt alert
		driver.findElement(By.xpath("//h5[contains(text(),'Prompt Dialog')]/following-sibling::button")).click();
		alert.sendKeys("Bhuvanesh");
		alert.accept();
		String promptConfirmation = driver.findElement(By.xpath("//h5[contains(text(),'Prompt Dialog')]/following-sibling::span")).getText();
		System.out.println(promptConfirmation);
		Thread.sleep(2000);
		driver.close();// org.openqa.selenium.UnhandledAlertException
	}
}
