package SelfStudy2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

	
	
	//Pre-conditions
	@BeforeSuite
	public void setUp() {
		System.out.println("Before Suite");
	}

	@BeforeClass
	public void login () {
		System.out.println("Before Class");
	}

	@BeforeMethod
	public void enterUrl() {
		System.out.println("====Before Method====");
		System.out.println("");
	}
	
	@BeforeTest
	public void launchBrowser () {
		System.out.println("Before Test");
	}
	
	//Test Case
	@Test
	public void googleTitle() {
		System.out.println("Test case 1");
		
	}
	
	@Test
	public void googleT() {
		System.out.println("Google Test case 2");
		
	}
	
	@Test
	public void google3() {
		System.out.println("Google Test case 3");
		
	}
	//Post conditions
	@AfterMethod
	public void logout() {
		System.out.println("====Logout from app====");
		System.out.println("");
	}
	
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("After Test");
		
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("After Class");
	}
	
	@AfterSuite
	public void generateTestReport() {
		System.out.println("generate Test Report");
		
	}
}
