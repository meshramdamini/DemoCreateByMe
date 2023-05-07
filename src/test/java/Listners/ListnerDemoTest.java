package Listners;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//packagename.classname.class
//@Listeners(Listners.ListnerClass.class) no when xml file is generated
public class ListnerDemoTest 
{

	@Test
	public  void Login()
	{
	System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    
    driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
    
    
    driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
    
    driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
	
	Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	
	}
	@Test
	public void testFail() 
	{
		System.out.println("failed test case");
		Assert.assertTrue(false);
		
	}
	@Test
	public void testskipped() 
	{
		System.out.println("sckipped test case");
		throw new SkipException("skip exception thrown");
		
	}
}
