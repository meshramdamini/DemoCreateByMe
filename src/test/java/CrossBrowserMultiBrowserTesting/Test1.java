package CrossBrowserMultiBrowserTesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Test1 
{  
	WebDriver driver;
	

	@BeforeMethod
	@Parameters("browser")
	public void launchBrowser(String browser) 
	{
		switch(browser.toLowerCase())
		{
		case "chrome":
        System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		break;
		
		case "firefox":
	        System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		    driver = new FirefoxDriver();
			break;
			
		default:
		driver=null;
		break;
			
		
	}
}

	@Test
	public void verifyTitle()
	{
		//launch browser
       //System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\chromedriver.exe");
	    
	   //driver = new ChromeDriver();
	    
	    driver.get("https://www.google.com/");
	    
	    String expectedTitle = "Google";
	   String actualTitle =driver.getTitle();
	   
	   Assert.assertEquals(expectedTitle, actualTitle);
	    
		
	}
	
	@AfterMethod
	public void quit()throws InterruptedException
	{
		driver.quit();
	}
}
