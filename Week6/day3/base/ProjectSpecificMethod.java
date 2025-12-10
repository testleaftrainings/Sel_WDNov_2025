package base;

import java.time.Duration;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {
	
	public RemoteWebDriver driver;
	//org.openqa.selenium.WebDriverException : TIMEOUT
	//org.openqa.selenium.StaleElementReferenceException : Driver value is same
	@BeforeMethod
	public void preCondition() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://leaftaps.com/opentaps/control/main");
		System.out.println("From base : "+driver);
		// b36a35fc-5cae-479d-8fad-22df90b73a03
	}
	
	@AfterMethod
	public void postCondition() {
		driver.quit();
	}

}
