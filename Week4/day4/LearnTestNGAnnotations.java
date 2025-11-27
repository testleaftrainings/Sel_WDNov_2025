package week4.day4;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LearnTestNGAnnotations {
  @Test
  public void runCreateLead() {
	  System.out.println("CreateLead");
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
  @Test
  public void runDeleteLead() {
	  System.out.println("DeleteLead");
  }

}
