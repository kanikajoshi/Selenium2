package SelfStudy2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.ca/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test(priority = 2 , groups = "Title")
	public void googleTitleTest() {
		String Title = driver.getTitle();
		System.out.println(Title);
	}
	
	@Test(priority = 1 , groups = "LinkTest")
	public void googleLogoTest() {
	boolean b = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
	System.out.println(b);
	}
	
	@Test(priority = 3 , groups = "LinkTest")
	public void mailLinkTest() {
		boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println(b);
	}
	@Test(priority = 3 , groups = "LinkTest")
	public void googleT() {
		System.out.println("Google Test case 2");
		
	}
	
	@Test(priority = 3 , groups = "LinkTest")
	public void google3() {
		System.out.println("Google Test case 3");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
