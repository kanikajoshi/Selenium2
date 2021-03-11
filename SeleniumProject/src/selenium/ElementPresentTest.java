package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//to check if the element is present or not 
public class ElementPresentTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		List<WebElement> element = driver.findElements(By.linkText("Aboutt"));
		
		if(element.size()>0)
		{
			System.out.println("Element Present");
	
		}
		else 
		{
			System.out.println("Element not found");
	
		}
	}

}
