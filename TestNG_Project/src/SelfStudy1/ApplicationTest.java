package SelfStudy1;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ApplicationTest {
		
		@BeforeSuite
		public void beforeSuite() {
			
			System.out.println("=========Before Suite==============");
		}
	
		@BeforeTest
		public void beforeTest()
		{
			System.out.println("Before test");
			System.out.println("");
		}//open the browser
		
		
		@AfterTest
		public void afterTest()
		{
			System.out.println("After test");
		}//close the browser
	
		@BeforeMethod
		public void beforeMethod()
		{
			System.out.println("Before method");
			System.out.println("");
			
		}
		
		@AfterMethod
		public void afterMethod()
		{
			System.out.println("After method");
			System.out.println("");
			
		}
		
		@Test (priority = 1)
		public void loginTest() {
			throw new SkipException("any reason");
			
			//webdriver code
		}
		
		@Test (priority = 2,dependsOnMethods = {"loginTest"})
		public void passwordChangeTest()
		{
			System.out.println("Changing the password");
			System.out.println("");
		}
		
		
		@Test (priority = 3,dependsOnMethods = {"loginTest","passwordChangeTest"})
		public void logoutTest()
		{
			System.out.println("Logging out");
			System.out.println("");
		}
		
		@AfterSuite
		public void afterSuite() {
			
			System.out.println("=========After Suite==============");
		}
	
		
}
