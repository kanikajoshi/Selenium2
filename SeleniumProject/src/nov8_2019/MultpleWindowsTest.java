package nov8_2019;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultpleWindowsTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("https://scet.ac.in/");
		
		//to scroll down
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		WebElement a = driver.findElement(By.id("menu-item-4594"));
		
		System.out.println(a.getLocation());
		
		jse.executeScript("arguments[0].scrollIntoView(true);", a);
		
		//click the element
		a.click();
		
		Thread.sleep(3000);
		
		//to store non duplicated titles
		Set<String> allTitle = driver.getWindowHandles();
		
		System.out.println(allTitle.size());
		
		//to print the value of the set
		Iterator<String> iter = allTitle.iterator();
		String main = iter.next();
		String child = iter.next();
		
		//to switch to second window
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		
		//to switch back to main window
		driver.switchTo().window(main);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		
		driver.quit();
	}

}
