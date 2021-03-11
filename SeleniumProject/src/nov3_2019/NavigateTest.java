package nov3_2019;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTest {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//driver.get("https://www.ebay.ca/");
		driver.navigate().to("https://www.ebay.ca/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
