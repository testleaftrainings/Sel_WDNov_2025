package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
import org.testng.annotations.Parameters;

public class ProjectSpecificMethods {
	RemoteWebDriver driver; // declaration at global level
	//FAILED CONFIGURATION: @BeforeMethod week5.day1.ProjectSpecificMethods.preCondition
    @Parameters({"url","username","password","browser"}) //case sensitivity
	@BeforeMethod
	public void preCondition(String link, String uname ,String pword, String browserType) {
    	System.out.println("data from the xml file --> "+link+" : "+uname+" : "+ pword +" : "+browserType);
	  
    	switch (browserType) {
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "chrome":
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--guest");
			driver = new ChromeDriver(options);
			break;
		default:
			driver = new FirefoxDriver();
			break;
		}
    	//  // Initialization at Local level
		driver.manage().window().maximize();
		driver.get(link);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uname);// hard coding the test data
		driver.findElement(By.id("password")).sendKeys(pword);
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
