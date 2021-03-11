package nov8_2019;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonListTest {

	public static void main(String[] args) throws InterruptedException {
			
    System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.ca/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone charger");
		Thread.sleep(3000);
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@id='suggestions']/div"));
		System.out.println(suggestions.size());
		for (int i =0 ; i<suggestions.size();i++)
		{
			System.out.println(suggestions.get(i).getText());
			
		}
		driver.quit();
	}

}
