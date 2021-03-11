package nov8_2019;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PageLoadTimeOutTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); 
		driver.get("https://www.facebook.com");
		
	
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("popopopopo");
		
		
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("32525454");
		
		
		driver.findElement(By.cssSelector("#u_0_p")).sendKeys("password");
		
		
		
		
		WebElement month = driver.findElement(By.cssSelector("select[id='month']"));
		
		Select s = new Select(month);
		s.selectByIndex(4);
		
		WebElement day = driver.findElement(By.cssSelector("select[id='day']"));
		Select day2= new Select(day);
		day2.selectByValue("8");
		
		WebElement day3 = driver.findElement(By.cssSelector("select[id='year']"));
		Select day5= new Select(day3);
		day5.selectByVisibleText("1998");
		
		
		driver.findElement(By.cssSelector("input[value='2']")).click();
		
		driver.findElement(By.cssSelector("button[name='websubmit']")).click();

	}

}
