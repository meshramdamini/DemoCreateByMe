package POMwithDDFandTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page 
{
	//page factory
	//Declaration
	@FindBy(xpath="//input[@id='userid']") private WebElement un;
	@FindBy(xpath="//input[@id='password']") private WebElement pwd;
	@FindBy(xpath="//button[text()='Login ']") private WebElement login;
	
	//Initialization
	public KiteLogin1Page(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	//Usage
	public void setKiteLogin1PageUsername(String username)
	{
	un.sendKeys(username);
	}
	public void setKiteLogin1PagePassword(String password)
	{
	pwd.sendKeys(password);
	}
	public void clickKiteLogin1PageLoginBtn()
	{
	login.click();
	}

}
