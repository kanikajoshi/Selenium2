package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:/SeleniumJars/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		Thread.sleep(3000);
		
		driver.get("https://www.ebay.ca/");
		
		String s =driver.findElement(By.xpath("//input[@id='gh-ac']")).getAttribute("type");
		System.out.println(s);
		
		driver.findElement(By.id("gh-ac")).sendKeys("iphone");
		System.out.println(driver.findElement(By.id("gh-ac")).getAttribute("value"));
		
		Thread.sleep(3000);
		
		driver.quit();
		
		

	}

}
