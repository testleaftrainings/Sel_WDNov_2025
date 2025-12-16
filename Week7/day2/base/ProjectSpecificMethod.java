package base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utils.DataLibrary;

public class ProjectSpecificMethod extends AbstractTestNGCucumberTests {

	private static final ThreadLocal<RemoteWebDriver> rDriver = new ThreadLocal<RemoteWebDriver>();
	public static String filePath, testName,testDescription,testAuthor,testCategory;
	public static ExtentReports extent;
	public static ExtentTest test;

	@Parameters({"browserName","url"})
	@BeforeMethod
	public void preCondition(String browserName, String url) {
		
		
		switch (browserName.toLowerCase()) {
		case "firefox":
			setrDriver(new FirefoxDriver());
			break;

		default:
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--guest");
			setrDriver(new ChromeDriver(options));
			break;
		}
		getrDriver().manage().window().maximize();
		getrDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		getrDriver().get(url);
		System.out.println("From base : " + getrDriver());
	}

	@AfterMethod
	public void postCondition() {
		getrDriver().quit();
	}

	@DataProvider(name = "fetchData")
	public String[][] sendData() throws IOException {
		return DataLibrary.readData(filePath);
	}

	public void setrDriver(RemoteWebDriver driver) {
		rDriver.set(driver);
	}

	public RemoteWebDriver getrDriver() {
		return rDriver.get();
	}

	// --------------------Extent Report related Implementations-------------------//
	@BeforeSuite
	public void startReport() { 
		DateTimeFormatter requiredPattern = DateTimeFormatter.ofPattern("MMM dd,yyyy HH_mm_ssa");
		String timeStamp = LocalDateTime.now().format(requiredPattern);
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/" + timeStamp + "-result.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}

	@AfterSuite
	public void stopReport() { 
		extent.flush();
	}

	@BeforeClass
	public void testCaseDetails() {
		test = extent.createTest(testName,testDescription);
		test.assignAuthor(testAuthor);
		test.assignCategory(testCategory);
	}

	public int takeSnap() throws IOException {
		int ranNum =(int) (Math.random()*999999);
		File source = getrDriver().getScreenshotAs(OutputType.FILE);
		File destination = new File("./snap/"+ranNum+".png");
		FileUtils.copyFile(source, destination);
		return ranNum;
	}
	
	public void reportStep(String status, String message) throws IOException {//step 5
		int ranNum = takeSnap();
		if (status.equalsIgnoreCase("pass")) {
			test.pass(message,MediaEntityBuilder.createScreenCaptureFromPath(".././snap/"+ranNum+".png").build());
		}
		else {
			test.fail(message,MediaEntityBuilder.createScreenCaptureFromPath(".././snap/"+ranNum+".png").build());
		}
	}
	

}
