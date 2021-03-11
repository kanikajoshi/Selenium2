package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public void openBrowser() {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
	}
	
	public void closeBrowser() {
		  driver.quit();
	}
	
	public void openGmail() {
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
	}
	
	public void enterEmail(String a) throws InterruptedException {
		driver.findElement(By.id("identifierId")).sendKeys(a);
		driver.findElement(By.xpath("//span[@class='RveJvd snByac'][1]")).click();
		Thread.sleep(3000);
	}
	
	public void enterPassword() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("truo");
		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
		Thread.sleep(3000);
	}
	
	public String readPasswordError() {
		String actual = driver.findElement(By.xpath("//div[@jsname='B34EJ']/span")).getText();
		System.out.print(actual);
		return actual;
		}
	
	public String readEmailError() {
		String msg =driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText();
		System.out.println(msg);
		return msg;
	}
}
