package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	@FindBy(xpath="//input[@name='txtUsername']")
	private WebElement UserName;
	
	@FindBy(xpath="//input[@name='txtPassword']")
	private WebElement Password;
	
	@FindBy(xpath="//input[@name='Submit']")
	private WebElement SubmitButton;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	
	public void sendUserName(String g)
	{
		 UserName.sendKeys(g);
	}
	
	public void sendPassword(String g)
	{
		 Password.sendKeys(g);
		
	}
	
	public void sendSubmitButton()
	{
		SubmitButton.click();
	}
	
	
}
