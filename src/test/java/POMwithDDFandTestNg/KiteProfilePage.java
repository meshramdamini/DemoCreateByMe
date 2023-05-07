package POMwithDDFandTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteProfilePage 
{
	//Declaration
	@FindBy(xpath="//a[text()=' Logout']") private WebElement logout;
	//Initialization
	public KiteProfilePage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	//Usage
	public void clickKiteProfilePageLogoutBtn()
	{
	logout.click();
	}

	

}
