package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnKeyboardEvents {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver(options);
		driver.navigate().to("https://www.leafground.com/drag.xhtml");
		Actions action = new Actions(driver);
		// if selenium sendKeys() is not entering the value into the textfield what will be your alternative approach ?
		action.sendKeys(driver.findElement(By.xpath("//input[@placeholder='Search...']")), "Testleaf")
		.keyDown(Keys.SHIFT) // press and hold 
		.keyDown(Keys.HOME)
		.keyUp(Keys.HOME) // release
		.keyUp(Keys.SHIFT)
		.keyDown(Keys.TAB)
		.keyUp(Keys.TAB)
		.pause(3000)
		.perform();
		// mouse events 
		action.dragAndDrop(driver.findElement(By.id("form:drag_content")), driver.findElement(By.id("form:drop_content")))
		.pause(3000)
		.perform();
		driver.close();
	}
}
