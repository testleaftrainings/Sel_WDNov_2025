package com.leaftaps.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/com/leaftaps/features/CreateLead.feature",
		glue = {"com.leaftaps.stepdefinitions","com.leaftaps.hooks"},
		dryRun = false,
		publish = true,
		monochrome = true,
		tags = "@positive") //No tests found. Nothing was run 
public class TC001_CreateLead extends AbstractTestNGCucumberTests  {

}
