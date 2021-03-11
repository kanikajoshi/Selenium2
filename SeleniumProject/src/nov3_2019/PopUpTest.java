package nov3_2019;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.aliexpress.com/");
		
		//WebElement pop = driver.findElementByLinkText("x");
		List<WebElement> pop = driver.findElementsByLinkText("x");
		if(pop.size()>0 )
		{
			driver.findElementByLinkText("x").click();
			driver.findElementByLinkText("Buyer Protection").click();
			Thread.sleep(9000);
		}
		else {
			
			driver.findElementByLinkText("Buyer Protection").click();
			
		}
		driver.quit();

	}

}
