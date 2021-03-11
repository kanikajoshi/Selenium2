package nov3_2019;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuterClassTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nike.com/ca/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	
		WebElement a = driver.findElementByLinkText("Trousers and Leggings");
		System.out.println(a.getLocation());
		
		jse.executeScript("arguments[0].scrollIntoView(true);", a);
	}

}
