package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest1 
{   
	@DataProvider(name = "SearchDataSet")
	public Object[][]SearchData()
	{
		//index always start from 0 for row and column
		Object[][]searchKeyWord = new Object[3][2];
		
		searchKeyWord[0][0] =  "India"; 
		searchKeyWord[0][1]=  "Qutub minar"; 
		
		searchKeyWord[1][0] = "Agra";
		searchKeyWord[1][1]= "Tag mahal"; 
		
		searchKeyWord[2][0] = "Hyderabad";
		searchKeyWord[2][1]= "charminar"; 
		
		return searchKeyWord; 
	}
	
	
	@Test(dataProvider ="SearchDataSet" )
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
