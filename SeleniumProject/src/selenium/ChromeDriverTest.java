package selenium;
//to demonstrate how to write the customized xpath if the numbers are changing 
//aim to enter fb last name email and password and after hitting click look for message What’s your name? 
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeDriverTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		 
		driver.get("https://www.facebook.com");
		
	
		driver.findElement(By.name("lastname")).sendKeys("popopopopo");
		
		driver.findElement(By.name("reg_email__")).sendKeys("32525454");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("password");
		
		driver.findElement(By.name("websubmit")).click();
		
		Thread.sleep(3000);
		
		String msg = driver.findElement(By.xpath("//div[@class='uiContextualLayer uiContextualLayerLeft']/div/div")).getText();
		System.out.println(msg);
		
		String emsg = "What’s your name?";
		
		
		if (msg.equals(emsg)) {
			System.out.println("its correct");
			
		}
		else {
		System.out.println("you selected wrong locator");	
		}
		
			}
	}


