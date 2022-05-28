package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailBrowser {
	
	
	
	public static WebDriver GmailBrowser() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Browser\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://accounts.google.com/signin/v2/identifier?sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		return driver;
		
		
	}
	

}
