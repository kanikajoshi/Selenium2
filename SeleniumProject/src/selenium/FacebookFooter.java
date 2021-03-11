package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookFooter {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//WebElement footer = driver.findElement(By.xpath("//div[@id='js_b']"));
			
		//List<WebElement> allLinks = footer.findElements(By.tagName("a"));
		List<WebElement> allLinks = driver.findElementsByXPath("//div[@aria-label='Facebook site links']//li");
		
		System.out.println(allLinks.size());
		
		
		for (int i = 0;i<allLinks.size();i++) {
			
			System.out.println(allLinks.get(i).getText());
		}
	}

}
