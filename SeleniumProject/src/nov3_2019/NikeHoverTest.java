package nov3_2019;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NikeHoverTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.nike.com/ca/");
		Actions builder = new Actions(driver);
		
		WebElement fashion = driver.findElementByLinkText("MEN");
		builder.moveToElement(fashion).build().perform();
		Thread.sleep(3000);
		List<WebElement> option2 = driver.findElements(By.xpath("//div[@id='NavigationMenu-1']//div[2]//a"));
		Thread.sleep(3000);
		System.out.println(option2.size());
		
		/*for (int i = 0 ;i<option2.size();i++) {
			System.out.println(option2.get(i).getText());
			
		}*/
		
		for(WebElement a : option2) {
			
			System.out.println(a.getText());
		}
		
		
		driver.quit();
	}

}
