package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSuggestion {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/");
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.id("header-desktop-search-button"));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		Thread.sleep(2000);
		js.executeScript("document.getElementById('header-search-input').value='Canada'");
		Thread.sleep(2000);
		
		WebElement search1 = driver.findElement(By.xpath("//button[@id='header-desktop-search-button']"));
		js.executeScript("argument[0].click()",search);
		
		//search.click();
		Thread.sleep(2000);
		
		driver.quit();
		
		//List<WebElement> allLinks = driver.findElementsByXPath("//ul[@role='listbox']/li");
		//System.out.println(allLinks.size());
		//for (int i = 0;i<allLinks.size();i++) {
		//System.out.println(allLinks.get(i).getText());
		//}

	}
	
	
}
