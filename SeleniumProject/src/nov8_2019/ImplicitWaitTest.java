package nov8_2019;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitWaitTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		
		 
	
		driver.findElement(By.name("lastname")).sendKeys("popopopopo");
		
		
		driver.findElement(By.name("reg_email__")).sendKeys("32525454");
		
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("password");
		
		
		driver.findElement(By.name("websubmit")).click();
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s = new Select(month);
		s.selectByIndex(4);
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select day2= new Select(day);
		day2.selectByValue("8");
		
		WebElement day3 = driver.findElement(By.xpath("//select[@id='year']"));
		Select day5= new Select(day3);
		day5.selectByVisibleText("1998");
		
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		driver.findElement(By.name("websubmit")).click();
		String msg = driver.findElement(By.xpath("//div[@class='uiContextualLayerPositioner _572t uiLayer']/div/div/div")).getText();
		Thread.sleep(3000);
		//to select the particular option from the drop down menu
		
       
		
		
		 
		//Thread.sleep(9000);
		 
		System.out.println(msg);
		
		String emsg = "What’s your name?";
		
		if (msg.equals(emsg)) {
			System.out.println("its correct");
			
		}
		
		else {
		System.out.println("you selected wrong locator");	
		}
		
	driver.quit();
		
		
	}

}
