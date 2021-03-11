package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		WebElement footer = driver.findElement(By.id("fsl"));
			
		//List<WebElement> allLinks = footer.findElements(By.tagName("a"));
		List<WebElement> allLinks = driver.findElementsByXPath("//span[@id='fsr']/a");
		System.out.println(allLinks.size());
		
		
		for (int i = 0;i<allLinks.size();i++) {
			
			System.out.println(allLinks.get(i).getText());
		}
	}

}
