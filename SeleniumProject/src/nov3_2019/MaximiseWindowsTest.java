package nov3_2019;

import org.openqa.selenium.chrome.ChromeDriver;

public class MaximiseWindowsTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.ebay.ca/");
		driver.manage().window().maximize();

	}

}
