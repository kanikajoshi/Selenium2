package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSuggestionList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Canada");
		
		
		Thread.sleep(2000);
		List<WebElement> allLinks = driver.findElementsByXPath("//ul[@class='erkvQe']/li");
		
		System.out.println(allLinks.size());
		
		
		for (int i = 0;i<allLinks.size();i++) {
			
			System.out.println(allLinks.get(i).getText());
		}
		
		
	}

}
