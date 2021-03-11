package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUpTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		 
		driver.get("https://www.facebook.com/r.php");
		
	
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
		
	//	driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
	driver.findElement(By.cssSelector("button[name^='websubmit']")).click();
		
		String msg = driver.findElement(By.xpath("//div[@class='uiContextualLayerPositioner _572t uiLayer']/div/div/div")).getText();
		Thread.sleep(3000);
		//to select the particular option from the drop down menu
		
       
		
		
		 
		Thread.sleep(5000);
		 
		System.out.println(msg);
		
		String emsg = "What’s your name?";
		
		if (msg.equals(emsg)) {
			System.out.println("its a match");
			
		}
		
		else {
		System.out.println("you selected wrong locator");	
		}
		
		driver.quit();
	}
	

}
