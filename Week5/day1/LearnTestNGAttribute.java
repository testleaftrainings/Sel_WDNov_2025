package week5.day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LearnTestNGAttribute {
  @Test(priority = 1, enabled = true)
  public void runcreateLead() throws Exception {
	  System.out.println("CreateLead");
	  throw new Exception("Create Lead Failed");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@BeforeMethod Executed here");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@AfterMethod Executed here");
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
  @Test(priority = 3, invocationCount = 3, threadPoolSize = 3 )
  public void runDeleteLead() throws InterruptedException {
	  Thread.sleep(2500);//didn't finish within the time-out 5000
	  System.out.println("DeleteLead");
  }
  @Test(priority = 2, dependsOnMethods = "runcreateLead",alwaysRun = true)
  public void runEditLead() {
	  System.out.println("EditLead");
	  //runEditLead() is depending on method public void week5.day1.LearnTestNGAttribute.runcreateLead(), 
	  //which is not annotated with @Test or not included.
  }

}
