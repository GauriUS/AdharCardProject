package TestPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Browser.Pojo;

import POM.LoginPage;
import utility.UtilitClass;
import POM.Home;


public class TestA extends Pojo
{

	LoginPage login;
	WebDriver driver;
	Home home;
	
	
	@BeforeClass
	public void beforeClass() throws InterruptedException, IOException 
	{
		  
		 driver=openChromeBrowser();
		 UtilitClass.CaptureScreenshot(driver);
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		
	  System.out.println("beforeMethod");
	    
	}
	
	@Test
	public void testA() throws IOException
	{
		
		
		login = new LoginPage(driver);
		
		login.sendUserName(UtilitClass.XLdata(1,0));
		login.sendPassword(UtilitClass.XLdata(1,1));
		login.sendSubmitButton();
		 UtilitClass.CaptureScreenshot(driver);
		// UtilitClass.XLdata();
//		String ActualUrL=driver.getCurrentUrl();
//		System.out.println(ActualUrL);
//		String Expected="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
//		Assert.assertEquals(ActualUrL, Expected);
//		//Assert.assertNotEquals(ActualUrL, Expected);
//		
//		System.out.println("END OF TEST A");

	}
	
	


	@Test(priority=1)
	public void testb() throws InterruptedException, IOException 
	{
		home= new Home(driver);
		home.desh();
		home.lea();
		home.tim();
		home.requre();
		home.MyInfo();
		home.perform();
		
		
		 UtilitClass.CaptureScreenshot(driver);
//		Thread.sleep(1000);
//		
//		SoftAssert soft= new SoftAssert();
//		String ActualURL=driver.getCurrentUrl();
//		System.out.println(ActualURL);
//		String Expected="https://opensource-demo.orangehrmlive.com/index.php/recruitment/viewCandidates";
//		soft.assertEquals(ActualURL, Expected);
//		//soft.assertNotEquals(ActualURL, Expected);  //Actual result & expected result is not equal
//		
//		
//		System.out.println("END OF TEST B");
//		
//		soft.assertAll();

	}
	
	
	@AfterMethod
	public void afterMethod() throws EncryptedDocumentException, IOException
	{
		home= new Home(driver);
		home.desh();
		
		
	}
	
	@AfterClass
	public void afterClass()
	{
		driver.quit();
	}
	
	
	

	
}
