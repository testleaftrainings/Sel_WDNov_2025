package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectDropDown {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/select.xhtml");
		WebElement selectDD = driver.findElement(By.className("ui-selectonemenu"));
		Select select = new Select(selectDD);
		// from the dropdown select the fav ui tool as 'Puppeteer'
		// M1 :
		//select.selectByIndex(3);
		// from the dropdown select the fav ui tool as 'Selenium'
		// M2 :
		select.selectByVisibleText("Selenium");
	}
}
