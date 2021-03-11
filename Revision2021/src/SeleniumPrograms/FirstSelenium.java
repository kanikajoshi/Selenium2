package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSelenium {

	public static void main(String[] args) throws InterruptedException {
		
	//	System.setProperty("webdriver.chrome.driver","C:\\Users\\kanika\\chromedriver.exe");
	//	WebDriver driver = new ChromeDriver();
		
		
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement element = driver.findElement(By.id("pageFooterChildren"));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		//to scroll into the bottom of the page
		int y = element.getLocation().y;
		System.out.println(y);
		//js.executeScript("window.scrollTo(argument[0],argument[1])",0,element.getLocation().y);
		//js.executeScript("window.scrollTo(0, (-(document.body.scrollHeight))");
		Thread.sleep(1000);
	
		
		
		driver.close();
		
		
	}

}
