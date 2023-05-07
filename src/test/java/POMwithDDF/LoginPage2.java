package POMwithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 
{
	//Step1: Declaration
	@FindBy(xpath="//input[@id='pin']")
	private WebElement Pin;
	
	@FindBy(xpath="//button[text()='Continue ']") 
	private WebElement Continue;
	
	
	//Step2: Initialization
	public LoginPage2(WebDriver driver)
	{
	  PageFactory.initElements(driver, this);
	}
	
	
	//Step3: usage
	public void setKiteLogin2PagePin(String pinvalue)
	{ 
		Pin.sendKeys(pinvalue);
	}
	public void clickKiteLogin2PageContinueButton()
	{
	Continue.click();
	}


 
	
		

	

}
