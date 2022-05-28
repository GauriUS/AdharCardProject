package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Instgramlogin {
	
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement UserName;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement Password;
	
	@FindBy(xpath="//div[text()='Log In']")
	private WebElement LoginButton;
	
	
	public  Instgramlogin(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void UserName()
	{
		UserName.sendKeys("Gauri");
	}
	
	public void Password()
	{
		Password.sendKeys("gauri1234");
	}
	
	public void LoginButton()
	{
		LoginButton.click();
	}
	
	
	
	
	
	
	
	
	
	

}
