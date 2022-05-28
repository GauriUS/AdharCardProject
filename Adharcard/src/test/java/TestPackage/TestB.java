package TestPackage;

//import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Browser.InstaBrowser;
import Browser.Pojo;
import POM.Home;
import POM.Instgramlogin;



public class TestB extends InstaBrowser
{
	Instgramlogin insta;
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass() throws InterruptedException 
	{

		driver=InstaBrowser();
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		
	  System.out.println("TestB_beforeMethod");
	    
	}
	@Test
	public void testB() {
		
		 insta=new Instgramlogin(driver);
		 insta.UserName();
		 insta.Password();
		 insta.LoginButton();
		
		
	
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
