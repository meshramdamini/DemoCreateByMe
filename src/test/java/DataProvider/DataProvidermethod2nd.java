package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvidermethod2nd 
{
	//test case
	@Test(dataProvider ="SearchDataSet",dataProviderClass = DataProviderMethod1st.class )
	public void GoogleSearch(String country,String monument)
	{
         System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\chromedriver.exe");
	    
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.google.com/");
		 
		WebElement Searchbox= driver.findElement(By.xpath("//input[@name=\"q\"]"));
		
		Searchbox.sendKeys(country + " " + monument);
		
		driver.findElement(By.xpath("//input[@name=\"btnK\"]")).submit();
		
	}

}
