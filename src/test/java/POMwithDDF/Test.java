package POMwithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test 
    {

		//Step1: Declaration
		@FindBy(xpath="//a[text()=' Logout']") 
		private WebElement Logout;
		
		//Step2: Initialization
		public Test(WebDriver driver)
		{
		PageFactory.initElements(driver, this);
		}
		//Step3: usage
		public void clickKiteHomeLogoutLogoutButton()
		{
		  Logout.click();
		}
		
		

	}


