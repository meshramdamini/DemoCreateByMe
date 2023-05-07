package POMwithDDFandTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	//Declaration
	//find dynamic xpath profile name change every user
	@FindBy(xpath="//div[@class='avatar']/span") private WebElement pn;
	//Initialization
	public KiteHomePage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	//Usage
	public void verifyKiteHomePagePN(String expPN)
	{
	String actPN = pn.getText();
	if(expPN.equals(actPN))
	{
	System.out.println("pass");
	}
	else
	{
	System.out.println("fail");
	}
	}
	public void clickKiteHomePagePN()
	{
	pn.click();
	
	}

}
