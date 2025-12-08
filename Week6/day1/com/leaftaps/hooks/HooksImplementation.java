package com.leaftaps.hooks;
import io.cucumber.java.BeforeStep;

public class HooksImplementation  {
	@BeforeStep
	public void slowMotion() throws InterruptedException {
		Thread.sleep(2000);
	}
	
}
