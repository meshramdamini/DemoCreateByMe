package POMwithoutPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) 
	{
		        //launch brouser
				System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\Chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		        
		        //create objec og login page
		        LoginPage2 LP = new LoginPage2(driver);
		        
		      //open url
		        driver.get("https://www.saucedemo.com/");
		        
		        LP.enterUsername("standard_user");
		        
		        LP.enterpassword("secret_sauce");
		        
		        LP.clickonlogin();
                 
		

	}

}
