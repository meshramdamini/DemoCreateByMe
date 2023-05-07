package Paralleltesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;




public class parallelTest1 
{

		WebDriver driver;
		
		@Test
		public void verifyTitle() 
		{
			//launch browser
			
			 System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\Chromedriver.exe");
		    
			 driver = new ChromeDriver();
			
			driver.get("https://www.saucedemo.com/");
			
			Assert.assertEquals(driver.getTitle(),"Swag Labs");
			driver.quit();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) 
			{
				
				e.printStackTrace();
			}
		
		
		}
		
		@Test
		public void verifyLogo()
		{
			//launch browser
			
			 System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\Chromedriver.exe");
		    
			 driver = new ChromeDriver();
			
			driver.get("https://www.saucedemo.com/");
			
			//Assert.assertEquals(driver.getTitle(),"Swag Labs");
			
		WebElement	logo =driver.findElement(By.xpath("//div[@class=\"login_logo\"]"));
		
		Assert.assertTrue(logo.isDisplayed());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
			
		
		driver.quit();
		
		
		}

}
