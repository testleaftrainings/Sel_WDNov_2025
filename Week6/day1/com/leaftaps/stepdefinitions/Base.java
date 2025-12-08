package com.leaftaps.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class Base extends AbstractTestNGCucumberTests {
	public static RemoteWebDriver driver; // Only declaration is done--> driver value is Null
                   //ChromeDriver driver;
	@BeforeMethod
	public void preCondition() {
		driver = new FirefoxDriver();
		System.out.println("driver value is : " + driver);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
}
