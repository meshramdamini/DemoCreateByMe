package TestNgLogReport;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGREporter 
{
	@Test

	public void googleSeach() 
	{
		//lounch browser
		
		System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 Reporter.log("chrome browser open");
		 driver.manage().window().maximize(); 
		
		driver.get(" https://www.google.com/");
		Reporter.log("google url open");
		
		
		 WebElement seachbox = driver.findElement(By.xpath("//input[@name=\"q\"]"));
		 seachbox.sendKeys("india gate");
		 Reporter.log("india gate keyword enterd");
		 
		 seachbox.sendKeys(Keys.ENTER);
		 Reporter.log("enter key pressed");
		 
		 Reporter.log("closing browser");
		 driver.quit();
		 
	
		
	}


}
