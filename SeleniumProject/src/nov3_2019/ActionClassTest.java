package nov3_2019;
//to hover over 
import java.awt.Desktop.Action;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.ebay.ca/");

		Actions builder = new Actions(driver);
		
		WebElement fashion = driver.findElementByLinkText("Fashion");
		builder.moveToElement(fashion).build().perform();
	}

}
