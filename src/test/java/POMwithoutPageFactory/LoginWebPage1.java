package POMwithoutPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWebPage1 
{
	public static void main(String[] args) 
	{
		 //without using page factory repository create kri hai
		//launch brouser
		System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        //open url
        driver.get("https://www.saucedemo.com/");
        
        //find element
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        
        driver.findElement(By.id("login-button")).click();
        
        
		
	}

}
