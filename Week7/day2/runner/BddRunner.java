package runner;


import org.testng.annotations.DataProvider;

import base.ProjectSpecificMethod;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/java/features",
glue = {"pages"},
dryRun = false,
publish = true,
monochrome = true,
tags = "@positive or @negative")
public class BddRunner extends ProjectSpecificMethod {

	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
