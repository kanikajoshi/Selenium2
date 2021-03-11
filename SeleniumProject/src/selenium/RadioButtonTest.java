package selenium;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		List<WebElement> option = driver.findElementsByXPath("//input[@name='group1']");
		
		
		option.get(2).click();
		for(int i =0 ;i<option.size();i++)
		{
			if(option.get(i).isSelected()) {
				System.out.println(option.get(i).getAttribute("value"));
				
		}
				
			}
		driver.quit();
		}
		
	}


