package propertiesFile;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        //create object of read conf file 
        ReadConfigFile configeFile = new ReadConfigFile();
        
        
        driver.get(configeFile.getURL());
       // Thread.sleep(20000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        
         // driver.get(configeFile.getUsername());
        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(configeFile.getUsername());
        
        
        //driver.get(configeFile.getPassword());
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(configeFile.getPassword());
        
        driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
		
	}

}
