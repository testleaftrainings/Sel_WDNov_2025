package week4.day3;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWebtable {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver(options);
		driver.navigate().to("https://www.leafground.com/table.xhtml");
		int sizeOfTheRow = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']//tbody/tr")).size();// size start from 1 
		int sizeOfTheColumn = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']//tbody/tr[1]/td")).size();// size start from 1 
		Thread.sleep(5000);
		Set<String> tableDATA = new LinkedHashSet<String>();
		for (int i = 1; i <= sizeOfTheRow; i++) {// row in the webtable
			System.out.print("| ");
			for (int j = 1; j <= sizeOfTheColumn; j++) { // column in the webtable
				String name = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']//tbody/tr["+i+"]/td["+j+"]")).getText();
				tableDATA.add(name);
				System.out.print(name+" | ");
			}
			System.out.println();
		}
		driver.close();
	}
}
