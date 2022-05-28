package TestPackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Browser.GmailBrowser;
import POM.Gmail;




public class TestC  extends GmailBrowser
{

	 Gmail gmail;
	WebDriver driver;
	
	
	@BeforeClass
	public void beforeClass() throws InterruptedException 
	{
       
		driver=GmailBrowser();
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		
	  System.out.println("TestC_beforeMethod");
	    
	}
	@Test
	public void testC() 
	{
		 gmail=new Gmail(driver);
		// gmail.Account();
		gmail.Email();
		gmail.next();
		 
		
	
	}

	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("aftermethod");
	}
	
	@AfterClass
	public void afterClass()
	{
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
