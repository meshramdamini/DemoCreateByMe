package POMwithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage3 
{
	//Step1: Declaration
	@FindBy(xpath="//span[text()='KV']") 
	private WebElement PN;
	
	//Step2: Initialization
	public LoginPage3(WebDriver driver)
	{
	 PageFactory.initElements(driver, this);
	}
	
	//Step3: usage
	public void verifyKiteHomePageProfileName(String expPN)
	{
	String actPN = PN.getText();
	if(expPN.equals(actPN))
	{
	System.out.println("pass");
	}
	else
	{
	System.out.println("fail");
	}
	}
	public void clickKiteHomePageProfileName()
	{
	PN.click();
	}
	}
		

	


