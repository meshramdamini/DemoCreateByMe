package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HardAssertion 
{
	@Test
	public void testMethod()
	{
		System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
		 driver.get("https://testautomationpractice.blogspot.com/");
		 
		 System.out.println("verifying title...");
		 String expectedTitle = "Automation Testing Practice1";//1 testing only title ,icon&button are not executed 
		 String actualTitle= driver.getTitle();
		 Assert.assertEquals(expectedTitle,actualTitle,"Title verification");
	
	  
		 System.out.println("verifiying presence of wikipedia-icon");
	     WebElement icon = driver.findElement(By.xpath("//img[@class=\"wikipedia-icon\"]"));
        Assert.assertTrue(icon.isDisplayed());
        
        System.out.println("verifiying presence of wikipedia-search-button");
        WebElement searchbtn  = driver.findElement(By.xpath("//input[@class=\"wikipedia-search-button\"]"));
        Assert.assertTrue(searchbtn.isDisplayed());
        
        driver.close();	
	
	}

}
