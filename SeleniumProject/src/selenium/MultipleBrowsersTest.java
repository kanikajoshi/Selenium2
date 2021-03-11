package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MultipleBrowsersTest {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver ;
	String browser = "Chrome";
	
	if(browser.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		 driver = new FirefoxDriver();
		}
	else if(browser.equals("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	else{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		 driver = new SafariDriver();
	}
	
	
	driver.get("https://www.google.com/");
	Thread.sleep(3000);
	
	List<WebElement> element = driver.findElements(By.linkText("Aboutt"));
	
	if(element.size()>0)
	{
		System.out.println("Element Present");

	}
	else 
	{
		System.out.println("Element not found");

	}
	driver.quit();
}
	}


