package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.echoecho.com/javascript4.htm");
		
		//driver.findElement("//input[@name='B2']").click();
		
		driver.findElement(By.xpath("//input[@name='B2']")).click();
		Thread.sleep(3000);
		
		 Alert al =   driver.switchTo().alert();
		 System.out.println(al.getText());
		 al.accept();
		// al.dismiss();
		 
		 
		
		driver.quit();
	}

}
