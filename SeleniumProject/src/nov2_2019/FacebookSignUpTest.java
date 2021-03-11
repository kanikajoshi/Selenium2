package nov2_2019;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUpTest {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedrive.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		
		driver.findElement(By.name("lastname")).sendKeys("harry");
		driver.findElement(By.name("reg_email__")).sendKeys("paras");
		driver.findElement(By.name("reg_passwd__")).sendKeys("pass");
		
		WebElement month = driver.findElement(By.id("month"));
		Select month_ob = new Select(month);
		month_ob.selectByIndex(3);
		
		WebElement day = driver.findElement(By.id("day"));
		Select day_ob = new Select(day);
		day_ob.selectByVisibleText("24");
		
		WebElement year = driver.findElement(By.id("year"));
		Select year_ob = new Select(year);
		year_ob.selectByValue("1991");
		
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		driver.findElement(By.name("websubmit")).click();
		
		Thread.sleep(3000);
		
		
		String msg = driver.findElement(By.xpath("//div[@class='uiContextualLayerPositioner _572t uiLayer']/div/div/div")).getText();
		
		Thread.sleep(9000);
		
		
		System.out.println(msg);
		
		String emsg = "What’s your name?";
		
		if(msg.equals(emsg)) {
			
			System.out.println("Verified");
		}
		else
		{
			System.out.println("Not Verified");
		}
		driver.quit();
	}

}
