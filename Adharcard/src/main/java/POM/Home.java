package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	@FindBy(xpath="//b[text()='Dashboard']")
	 private WebElement dash;

	@FindBy(xpath="//b[text()='Leave']")
	private WebElement leav;

	@FindBy(xpath ="//b[text()='Time']" )
	private WebElement time;
	
	@FindBy(xpath="//b[text()='Recruitment']")
	private WebElement requi;
	
	@FindBy(xpath="//b[text()='My Info']")
	private WebElement MyInfo;
	
	@FindBy(xpath="//b[text()='Performance']")
	private WebElement perform ;
	
	


	public Home(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public void desh() {
		dash.click();
	}

	public void lea() {
		leav.click();
	}
	public void tim() {
		time.click();
	}
	public void requre() {
		requi.click();
	}
	public void MyInfo() {
		MyInfo.click();
	}
	public void  perform(){
		perform.click();
	}


		




}