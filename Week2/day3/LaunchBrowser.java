package week2.day3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
//		ChromeDriver driver; // declaration
//		driver = new ChromeDriver();
		FirefoxDriver driver;
		driver = new FirefoxDriver();// launches the browser 
		driver.manage().window().maximize();// maximizes the browser window
		driver.get("https://www.selenium.dev/downloads");// loads the web page
		String title = driver.getTitle();// helps to retrieve the title of the window 
		if (title.contains("Downloads")) {
			System.out.println("Title is verified");
		}
		else
		{
			System.out.println("Window has been navigated to the wrong page");
		}
		Thread.sleep(2000);
		driver.close();// helps to close the last window in the browser
		}
	}
