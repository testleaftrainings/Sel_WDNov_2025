package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnAUI {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver(options);
		driver.navigate().to("https://www.myntra.com/");
		WebElement mensSection = driver.findElement(By.xpath("//a[text()='Men']"));
		Actions action = new Actions(driver);
		action
		.moveToElement(mensSection)//mouse hover action here
		.pause(3000)
		.click(driver.findElement(By.xpath("//a[text()='T-Shirts']"))) 
		.build().perform();
		action.scrollToElement(driver.findElement(By.xpath("//a[text()=' Contact Us ']"))).build().perform(); // scrolling action
	}
}
