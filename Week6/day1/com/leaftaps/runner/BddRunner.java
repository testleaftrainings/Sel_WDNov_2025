package com.leaftaps.runner;

import com.leaftaps.stepdefinitions.Base;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/com/leaftaps/features",
glue = {"com.leaftaps.stepdefinitions","com.leaftaps.hooks"},
dryRun = false,
publish = true,
monochrome = true,
tags = "@positive")
public class BddRunner extends Base {

}
