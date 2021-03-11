/**
 * 
 */
package com.wordpress.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author kanika
 *
 */
public class BrowserFactory_Framework {

	
	public static  WebDriver openBrowser(WebDriver driver,String browserName,String url)
	{
		if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:/SeleniumJars/geckodriver.exe");
			driver =new FirefoxDriver();
			
		}
		else if(browserName.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver","C:/SeleniumJars/chromedriver.exe");
			driver = new ChromeDriver();
			
			
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
	public static void quitBrowser(WebDriver driver) {
		
		driver.quit();
		
		
	}

}
