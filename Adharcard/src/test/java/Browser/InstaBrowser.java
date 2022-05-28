package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaBrowser 
{
	
	public static WebDriver InstaBrowser() throws InterruptedException
	{
		
		
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Browser\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.instagram.com/accounts/login/?hl=en");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		return driver;
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
