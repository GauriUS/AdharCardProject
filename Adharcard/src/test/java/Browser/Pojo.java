package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public   class Pojo 
{
	
	public static WebDriver openChromeBrowser() throws InterruptedException
	{
	
		
	System.setProperty("webdriver.chrome.driver","src\\test\\resources\\Browser\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();        
	
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	return driver;
	}
	

}
