package POMwithpageFacrory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage2 
{
	//using pageFactory
	
		WebDriver driver;
		
		//constructor
		Loginpage2(WebDriver d)
		{
		    driver = d;
		    
		    // this statement initialize the page element so that you can work directy on the element without getting null pointer exception
		    
		    PageFactory.initElements(driver, this);
	    }
		
		//@FindBy annotaion is used to declare and initialize web elements variables using desire web lacators in selenium.
		//Syntax:
		//@FindBy(locator Type ="locator value/exression")
		//private WebElement D.M. ;
		@FindBy(id="user-name")
		WebElement username;
		
		@FindBy(id="password")
		WebElement password;
		
		@FindBy(id="login-button")
		WebElement loginbtn;
		
		public void enterUsername(String uname)
		{
			username.sendKeys(uname);
		}
		public void enterpassword(String pswrd)
		{
			password.sendKeys(pswrd);
		}
		public void clickonlogin()
		{
			loginbtn.click();
		}
	 
		

	}



