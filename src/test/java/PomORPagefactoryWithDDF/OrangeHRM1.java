package PomORPagefactoryWithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM1
{
	//1.page factory
	
		//@FindBy(name = "username")
		//WebElement Username;
	//@FindBy annotaion is used to declare and initialize web elements variables using desire web lacators in selenium.
	    @FindBy(xpath = "//input[@name=\"username\"]") 
		  public WebElement Username;
		
		  @FindBy(xpath = "//input[@name=\"password\"]")
		  public WebElement Password;
		    
		  @FindBy(xpath = "//button[@type=\"submit\"]")
		  private WebElement LoginButton;
		  
		//initi within aa con with access level public using pagefactory
		  
		
		 // constructor
		  public OrangeHRM1(WebDriver driver) 
		{
  // this statement initialize the page element so that you can work directy on the element without getting null pointer exception
			PageFactory.initElements(driver, this);
		}
		
		
		public void userID1(String UserID) 
		{
			
		Username.sendKeys(UserID);	
			
		}
		
		public void Pass(String Passwor) 
		{
			Password.sendKeys(Passwor);
		}
		
		public void Login() 
		{
			LoginButton.click();
		}
		  

}
