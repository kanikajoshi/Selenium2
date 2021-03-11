/**
 * 
 */
package com.wordpress.test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpress.pages.LoginPageNew;
import com.wordpress.utility.BrowserFactory;;

/**
 * @author kanika
 *
 */
public class LoginTestNew {

	@Test
	public void verifyLoginCreditenials() throws InterruptedException {
		
	
		//launch the 
		BrowserFactory ob = new BrowserFactory();
		WebDriver driver = ob.openBrowser("firefox","https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
		 
		LoginPageNew loginobject = PageFactory.initElements(driver, LoginPageNew.class);
		
		loginobject.enterUsername("kanikacs123", "kanikatp123.0");
		
		driver.quit();
		
		
		
		
		
	
	}
}
