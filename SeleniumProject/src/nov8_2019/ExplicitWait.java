package nov8_2019;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver,60);
		
		driver.get("http://www.echoecho.com/javascript4.htm");
		
		driver.findElementByXPath("//input[@name='B2']").click();
		wait.until(ExpectedConditions.alertIsPresent());
		
		 Alert al =   driver.switchTo().alert();
		 System.out.println(al.getText());
		 al.accept();
		 
		 driver.quit();

	}

}
