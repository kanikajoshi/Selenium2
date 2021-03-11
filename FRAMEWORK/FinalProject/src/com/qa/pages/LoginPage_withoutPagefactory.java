package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_withoutPagefactory {
	
	WebDriver driver;
	
	//Storing all the required webpage locators inside the variables
	By username = By.id("usernameOrEmail");
	By continueBtn = By.xpath("//button[@class='button form-button is-primary']");
	By password = By.xpath("//input[@id='password']");

	//input[@id='password']
	//to initialise the WebDriver element
	public LoginPage_withoutPagefactory(WebDriver driver) {
		this.driver=driver;
	}
	
	//methods to perform actions on the webelement
	
	
	public void enterUsername(String user,String pass) throws InterruptedException {
	driver.findElement(username).sendKeys(user);
	driver.findElement(continueBtn).click();	
	Thread.sleep(1000);
	driver.findElement(password).sendKeys(pass);	
	driver.findElement(continueBtn).click();
	}
	
	
	
	
	
	


}
