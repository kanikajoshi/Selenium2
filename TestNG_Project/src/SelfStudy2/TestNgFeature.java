package SelfStudy2;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNgFeature {
	
	WebElement driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		
		
	}
	

}
