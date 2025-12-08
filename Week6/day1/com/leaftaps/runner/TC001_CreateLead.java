package com.leaftaps.runner;


import com.leaftaps.stepdefinitions.Base;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/com/leaftaps/features/CreateLead.feature",
		glue = {"com.leaftaps.stepdefinitions"},
		dryRun = false,
		publish = true,
		monochrome = true,
		tags = "@positive") //No tests found. Nothing was run 
public class TC001_CreateLead extends Base {

}
