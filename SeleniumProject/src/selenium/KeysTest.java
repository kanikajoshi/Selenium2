package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeysTest {

	public static void main(String[] args) throws InterruptedException {
		
		//to get the driver path
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		//to launch the browser
		FirefoxDriver driver = new FirefoxDriver();
		
		//to get the url
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		//to input the value for login id
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("test23");
		
		
		//to hit enter at the input box
		driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
		
		//to hold for 3 sec
		Thread.sleep(3000);
		
		//to input the password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("truo");
		
		//to hit enter after entering the password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Keys.ENTER);
		
		//to hold for 2 sec
		Thread.sleep(2000);
		
		
		String expectedErrMsg = "Wrong password. Try again or click Forgot password to reset it.";
		
		//to get the msg using getText() function
		String actual = driver.findElement(By.xpath("//div[@jsname='B34EJ']/span")).getText();
		
		System.out.print(actual);
		
		if (expectedErrMsg.equals(actual))
		{
			System.out.print("pass");
		}
		else
		{
			
			System.out.print("Fail");
		}
		driver.quit();
	
	}

}
