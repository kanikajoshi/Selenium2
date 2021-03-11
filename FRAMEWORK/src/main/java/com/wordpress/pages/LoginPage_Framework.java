/**
 * 
 */
package com.wordpress.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author kanika
 *
 */
public class LoginPage_Framework {
	
	WebDriver driver;
	
	@FindBy(id="usernameOrEmail") 
	WebElement username;

	@FindBy(how=How.XPATH , using ="//button[@class='button form-button is-primary']")
	WebElement continueBtn;

	@FindBy(how = How.XPATH , using="//input[@id='password']")
	WebElement password;


	//to initialise the WebDriver element
	public LoginPage_Framework(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	
	public void enterUsername(String user,String pass) throws InterruptedException {
	username.sendKeys(user);
	continueBtn.click();	
	Thread.sleep(1000);
	password.sendKeys(pass);
	Thread.sleep(1000);
	continueBtn.click();
	}

}
