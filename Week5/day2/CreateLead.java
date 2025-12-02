package week5.day1;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethods {
	// Instansiation way - Array : 2-Dimensional
	@DataProvider(name = "fetchData")
	public String[][] sendData() {
		String[][] testData = new String[3][4]; // row -> 3 column ->4

		// test data set no.1
		// {"Qualitest","Bhuvanesh", "Moorthy","998800"}
		testData[0][0] = "Qualitest";
		testData[0][1] = "Bhuvanesh";
		testData[0][2] = "Moorthy";
		testData[0][3] = "998800";

		// test data set no.2
		// {"Qeagle","Harrish","A","897645"}
		testData[1][0] = "Qeagle";
		testData[1][1] = "Harrish";
		testData[1][2] = "A";
		testData[1][3] = "897645";

		// test data set no.3
	
		testData[2][0] = "ABSA";
		testData[2][1] = "Vineeth";
		testData[2][2] = "R";
		testData[2][3] = "776688";
		
		return testData;

	}

	@Test(dataProvider = "fetchData")
	public void runCreateLead(String cname, String fname, String lname, String phno) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);// hard coding the test data is allowed
        // or restricted in parameterization principle ?
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname); // restricted
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(cname)) {
			System.out.println("Lead created successfully");
		} else {
			System.out.println("Lead is not created");
		}
	}
}
