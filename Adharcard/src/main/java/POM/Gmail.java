package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail {
	
	WebDriver driver;
	
//	@FindBy(xpath="//div[@class='WBW9sf']")
//	private WebElement Account;
	
	@FindBy(xpath="//input[@name='identifier']")
	private WebElement Email;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement next;
	
	
	public Gmail(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//	public void Account()
//	{
//		Account.click();
//	}
	
	public void Email()
	{
		Email.sendKeys("gaurisalunkhe4@gmail.com");
	}

	
	public void next()
	{
		next.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
