/**
 * 
 */
package com.wordpress.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wordpress.pages.BaseClass;
import com.wordpress.pages.LoginPage_Framework;
import com.wordpress.utility.BrowserFactory_Framework;

/**
 * @author kanika
 *
 */
public class LoginTest_Framework extends BaseClass{
	
				
	@Test
	public void signIn() throws InterruptedException {
	
	LoginPage_Framework loginobject = PageFactory.initElements(driver, LoginPage_Framework.class);
	
	loginobject.enterUsername("kanikacs123", "kanikatp123.0");
	}



}
