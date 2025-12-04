package com.leaftaps.hooks;

import java.time.Duration;

import org.openqa.selenium.firefox.FirefoxDriver;
import com.leaftaps.stepdefinitions.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksImplementation extends Base {
	
	@Before
	public void preCondition() {
		driver = new FirefoxDriver();
		System.out.println("driver value is : "+driver);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	
	@After
	public void postCondition() {
		driver.close();
	}

}
