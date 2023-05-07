package POMwithoutPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage2Encapsulation 
{
	 private WebDriver driver;
	 
	 //1. Data member should be declared globally with access level private 
	private By username = By.id("user-name");
	private By password= By.id("password");
	private By loginbtn = By.id("login-button");
	 
	 
	//Initialize within a constructor with access level public using pagefactory 
	 //constructor
	public LoginPage2Encapsulation(WebDriver d)
	 {
		this.driver=d;
			 
	 }

     
	//Utilize within a method with access level public.
	public By getUsername()
	{
		return username;
	}


	public void setUsername(By username) 
	{
		this.username = username;
	}


	public By getPassword()
	{
		return password;
	}


	public void setPassword(By password) 
	{
		this.password = password;
	}


	public By getLoginbtn() 
	{
		return loginbtn;
	}


	public void setLoginbtn(By loginbtn) 
	{
		this.loginbtn = loginbtn;
	}
	
	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
		LoginPage2Encapsulation LP = new LoginPage2Encapsulation (driver);
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(LP.getUsername()).sendKeys("standard_user");
		
		driver.findElement(LP.getPassword()).sendKeys("secret_sauce");
	
		driver.findElement(LP.getLoginbtn()).click();
	}
	
	
	
}
