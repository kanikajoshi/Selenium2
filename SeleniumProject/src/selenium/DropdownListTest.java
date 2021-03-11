package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownListTest {

	public static void main(String[] args) throws InterruptedException {
		//to set the driver location
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		//to launch the browser
		FirefoxDriver driver = new FirefoxDriver();
		
		//to get the url
		driver.get("https://www.ebay.ca/");
		
		
	
       // List<WebElement> allLinks = driver.findElementsByXPath("//select[@id='gh-cat']/option");
        
		WebElement box = driver.findElement(By.id("gh-cat"));
        
		List<WebElement> allLinks = box.findElements(By.tagName("option"));
        
		System.out.println(allLinks.size());
      	
          for (int i = 0;i<allLinks.size();i++) {
        	  if(allLinks.get(i).isSelected()==true) {
			System.out.println(allLinks.get(i).getText()+"-----------"+allLinks.get(i).isSelected());
        	  }
		/*for (int i = 0;i<allLinks.size();i++) {
			
			System.out.println(allLinks.get(i).getText());
		}*/
	}
          Select s = new Select(box);
          s.selectByIndex(4);
          Thread.sleep(3000);
          s.selectByValue("550");
          Thread.sleep(3000);
          s.selectByVisibleText("Real Estate");
          
          for (int i = 0;i<allLinks.size();i++) {
  			if(allLinks.get(i).isSelected()==true) {
  			System.out.println(allLinks.get(i).getText()+"-----------"+allLinks.get(i).isSelected());
  			}
  			
	}
          driver.quit();
          
	}
}
