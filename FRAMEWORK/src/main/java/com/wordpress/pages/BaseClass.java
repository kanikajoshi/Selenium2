/**
 * 
 */
package com.wordpress.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.wordpress.utility.BrowserFactory_Framework;

/**
 * @author kanika
 *
 */
public class BaseClass {
    public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		 driver = BrowserFactory_Framework.openBrowser(driver, "firefox","https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
		}
		
		
	@AfterClass	
	public void tearDown() {
		BrowserFactory_Framework.quitBrowser(driver);
	}


}
