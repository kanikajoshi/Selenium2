package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.qa.pages.LoginPage_withoutPagefactory;

public class LoginTest_withoutPageFactory {


	@Test
	public void verifyLoginCreditenials() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:/SeleniumJars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		
		driver.get("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
		driver.manage().window().maximize();
		
		LoginPage_withoutPagefactory ob = new LoginPage_withoutPagefactory(driver);
		
		ob.enterUsername("kanikacs123","kanikatp123.0");
		
		driver.quit();
	
	
	}
	
	
}
