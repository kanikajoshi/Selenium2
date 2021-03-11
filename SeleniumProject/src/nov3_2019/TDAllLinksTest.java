package nov3_2019;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TDAllLinksTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.td.com/ca/en/personal-banking/");
		
		
		
		List<WebElement> option2 = driver.findElements(By.xpath("//div[@class='td-footer-links td-copy-align-centre td-copy-white']//a"));
		
		Thread.sleep(3000);
		System.out.println(option2.size());
		
		for(WebElement a1 : option2) {
			
			System.out.println(a1.getText());
		}
		driver.quit();
	}

}
