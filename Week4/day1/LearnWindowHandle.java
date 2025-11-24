package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.leafground.com/window.xhtml");
		// Print the Parent window id 
		String parentWindowId = driver.getWindowHandle();
		String parentWindowTitle = driver.getTitle();
		Thread.sleep(2000);
		System.out.println("parent Window Id : "+parentWindowId);
		System.out.println("parent Window Title : "+parentWindowTitle);
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		// step 1 : Print all currently opened Window id -> getWindowHandles()
		Set<String> windowHandles = driver.getWindowHandles();
		// windowHandles.forEach(System.out::println);
		// step 2 : Convert set into List --> .get()
		List<String> windowHandleList =  new ArrayList<String>(windowHandles);
		for (int i = 0; i < windowHandleList.size(); i++) {
			System.out.println(windowHandleList.get(i));
		}
		//  step 3 : switch the driver focus from parent to child window 
		driver.switchTo().window(windowHandleList.get(1));
		System.out.println("child Window id : "+windowHandleList.get(1));
		String childWindowTitle = driver.getTitle();
		System.out.println("child Window Title : "+childWindowTitle);// Dashboard
//		driver.close();
		// Close the parent window
//		switch the driver focus from child to parent window 
//		driver.switchTo().window(windowHandleList.get(0));
//		driver.close();// Error --> NoSuchWindowException
		driver.quit();
		}

}
