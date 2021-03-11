package nov3_2019;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MissiasguaHoverTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.mississauga.ca/portal/home");
		
		
		
		Actions builder = new Actions(driver);
		
		WebElement fashion = driver.findElementByXPath("//div[@id='tnNavHall']//a//img");
		builder.moveToElement(fashion).build().perform();
		Thread.sleep(3000);
		
		List<WebElement> option2 = driver.findElements(By.xpath("//div[@id='tnNavHallMenu']/a"));
		Thread.sleep(3000);
		System.out.println(option2.size());
		
		for (int i = 0 ;i<option2.size();i++) {
			if(option2.get(i).getText().equals("City Clerk's Office"))
					{
				driver.findElementByLinkText("City Clerk's Office").click();
					break;
					}
		}
		driver.quit();
		

	}

}
