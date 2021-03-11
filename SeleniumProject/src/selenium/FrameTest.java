package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		 
		driver.get("https://jqueryui.com/droppable/");
		List <WebElement> li = driver.findElementsByLinkText("Sortable");
		
		if(li.size()>0)
		{
			System.out.println("Element Present");
	
		}
		else 
		{
			System.out.println("Element not found");
	
		}

	   driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
       List <WebElement> li1  = driver.findElements(By.id("draggable"));
		
		if(li1.size()>0)
		{
			System.out.println("Element Present");
	
		}
		else 
		{
			System.out.println("Element not found");
	
		}
		driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame()
		System.out.println("After switching to default mode--------------");
		
		List <WebElement> li2  = driver.findElements(By.id("draggable"));
		
		if(li2.size()>0)
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
