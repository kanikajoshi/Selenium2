package tests;

import org.testng.annotations.Test;

import pages.LoginPage;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginTest {
  
	WebDriver driver;
	LoginPage lp =  new LoginPage();
	Xls_Reader d = new Xls_Reader("C:\\Testing\\Data1.xlsx");
	
	String validEmail = d.getCellData("Sheet1",1,1);
	//System.out.println(d);
	/*
	 * String InvalidEmail String wrongPassword String passErrmsg String emailErrmsg
	 */
	
	@Test
	public void LoginWithWrongPasswordTest() throws InterruptedException {
		String a = "test23";
		lp.enterEmail(a);
		lp.enterPassword();
		
		String expectedErrMsg = "Wrong password. Try again or click Forgot password to reset it.";
		String actual = lp.readPasswordError();
		Assert.assertEquals(expectedErrMsg, actual);
		
	}
	@Test
	public void LoginWithEmailTest() throws InterruptedException{
		String a = "yyy";
		lp.enterEmail(a);
		String msg  = lp.readEmailError();
		Assert.assertEquals(msg,"Couldn't find your Google Account");
	}
	
	@BeforeMethod
	public void beforeMethod() {
	lp.openBrowser();
	lp.openGmail();
		
  }

  @AfterMethod
  public void afterMethod() {
	lp.closeBrowser();
  }

}
