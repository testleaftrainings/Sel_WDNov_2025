package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ProjectSpecificMethods {
	RemoteWebDriver driver; // declaration at global level
    @BeforeMethod
	public void preCondition() {
	    driver = new FirefoxDriver(); // Initialization at Local level
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	}
	@AfterMethod
	public void postCondition() {
		
		driver.close();
	}
	
	@BeforeClass
	  public void beforeClass() {
		  System.out.println("@BeforeClass Executed here");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("@AfterClass Executed here");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("@BeforeTest Executed here");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("@AfterTest Executed here");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("@BeforeSuite Executed here");
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("@AfterSuite Executed here");
	  }
	
}
