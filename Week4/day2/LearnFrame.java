package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.leafground.com/frame.xhtml");
		//driver the driver focus from main html doc to the default.xhtml html doc
		// using index to switch the driver focus
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();// org.openqa.selenium.NoSuchElementException
		// swifting driver focus back to parent html doc
		driver.switchTo().parentFrame();//org.openqa.selenium.NoSuchFrameException
		// using webelement to switch the driver focus to nested.xhtml html doc
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='nested.xhtml']")));//org.openqa.selenium.NoSuchElementException
		System.out.println(driver.findElement(By.id("Click")).getText());
		// shifting driver focus back to parent html doc
		driver.switchTo().parentFrame();
		// using webelement to switch the driver focus to page.xhtml html doc
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='page.xhtml']")));
		// using id/name attribute to switch the driver focus to framebutton.xhtml html doc
		driver.switchTo().frame("frame2");
		WebElement innerNestedFrameButton = driver.findElement(By.id("Click"));
		innerNestedFrameButton.click();
		Thread.sleep(2000);
		System.out.println(innerNestedFrameButton.getText());
		// shifting driver focus back to main html doc
		driver.switchTo().defaultContent();
		driver.close();
	}

}
