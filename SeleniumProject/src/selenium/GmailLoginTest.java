package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		//driver.findElement(By.xpath("//input[@id='identifierId'])")).sendKeys("test253");
		driver.findElement(By.id("identifierId")).sendKeys("test23");
		
		//driver.findElement(By.xpath("//span[@class='RveJvd snByac'][1]")).click();
		driver.findElement(By.id("identifierNext")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("truo");
		//driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
		
		Thread.sleep(2000);
		
		String expectedErrMsg = "Wrong password. Try again or click Forgot password to reset it.";
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
			
		}
	}


