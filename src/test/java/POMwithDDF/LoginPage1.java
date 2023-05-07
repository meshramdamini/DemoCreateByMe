package POMwithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1
{
	//Step1: Declaration
	@FindBy(xpath="//input[@id='userid']")
	private WebElement UN;
	@FindBy(xpath="//input[@id='password']") 
	private WebElement PWD;
	@FindBy(xpath="//button[text()='Login ']") 
	private WebElement Login;
	
	//Step2: Initialization
	public LoginPage1(WebDriver driver)
	{
	   PageFactory.initElements(driver, this);
	}
	//Step3: usage
	public void setKiteLoginTestUsername(String username)
	{
	    UN.sendKeys(username);
	}
	public void setKiteLogin1PagePassword(String password)
	{
	  PWD.sendKeys(password);
	}
	public void clickKiteLogin1PageLoginButton()
	{
	  Login.click();
	}
	}

	
		
		




