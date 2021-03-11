package testng;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestngProgram {
	
	WebDriver driver;
	
		@BeforeMethod
		public void setUp() {
				
				
				System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
				
				driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.get("https://www.ebay.ca/");
				driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		}
	
		
		@Test(priority = 1)
		public void totalLinksCount()  {
			
			List<WebElement> links = driver.findElements(By.tagName("a"));
			System.out.println(links.size());
		}
		
		
		@Test(priority = 2)
		public void elementPresent()  {
			
			List<WebElement> find = driver.findElements(By.linkText("Fashion"));
			Assert.assertTrue(find.size()>0, "element is present");
		}
	
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
}
