package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTestTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.linkText("About")).click();
		
		Thread.sleep(3000);
		
		String expectedUrl = "https://about.google/?fg=1&utm_source=google-CA&utm_medium=referral&utm_campaign=hp-header";
		String actualUrl = driver.getCurrentUrl();

		String expectedTitle ="About - Google";
		String actualTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedTitle) && expectedUrl.equals(actualUrl)) {
			System.out.println("Test Passed");
		}
		else {
			System.out.print("Failed");
		}
	}

}
