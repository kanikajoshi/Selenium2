package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");//to get the url
		//to get email use any unique attribute
		
		//driver.findElement(By.className("inputtext")).sendKeys("gjhgjgkghjg");
	//	driver.findElement(By.id("email")).sendKeys("fhfjkkgjgf");
		driver.findElement(By.id("email")).sendKeys("ka");
		
	
		//to get the password
		driver.findElementById("pass").sendKeys("utyrhkbk");
		
		//to click on ligin button
		driver.findElement(By.id("loginbutton")).click();
	}

}
