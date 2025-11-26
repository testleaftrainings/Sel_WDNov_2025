package week4.day3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnTestNGBasics {
	// main() - java as the executor will work
	// @Test - Testng as the executor will work
	ChromeDriver driver;
	@Test
	public void runTestng() {
		driver =   new ChromeDriver();
		driver.get("https://www.leafground.com/table.xhtml");
	}

}
