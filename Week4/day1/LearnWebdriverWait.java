package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWebdriverWait {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		int windowCount =3;
		// condition : Wait for 2 new tabs to open : 8-10 sec delay is there
		// int totalNoOfwindow = driver.getWindowHandles().size();
		// System.out.println(totalNoOfwindow);
		WebDriverWait waits = new WebDriverWait(driver,Duration.ofSeconds(10));
		Boolean WaitFor2NewTabsToOpen = waits.until(ExpectedConditions.numberOfWindowsToBe(windowCount)); // true 
		if (WaitFor2NewTabsToOpen==true) {
			// step to take screenshot
			// step 1 : Capture the screenshot and store it in the specified location( temporary file that will be deleted once the JVM exits).
			File source = driver.getScreenshotAs(OutputType.FILE);
			// step 2 : Create a permanent file within the project
			File destination = new File("./snap/screenShot.png");
			// step 3 : Copy the data from source directory (temporary) to destination director(permanent)
			FileUtils.copyFile(source, destination);
		}
		driver.quit();
	}
}
