package ForScreenshotListner;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base 
{
	public static WebDriver driver;
	public void initialization()
	{
      System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\Chromedriver.exe");
	    
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
		
	}
	public void Failed(String testMethodName)
	{
        //String Random = RandomString.make(5);
		
		//String Filename = "google";
		
		File SourceFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try 
		{
			
			//FileUtils.copyFile(SourceFile ,new File("F:\\ECLIPSE_PROJECTS\\PageObjectModelDemo\\Screenshot\\"+Filename+Random+".jpg"));
			FileUtils.copyFile(SourceFile ,new File("F:\\ECLIPSE_PROJECTS\\PageObjectModelDemo\\Screenshot\\"+"Failshot_"+testMethodName+"_"+".jpg"));
		} 
		catch (IOException e)                                                                                //filshot is random name and testmethod is method connstructor
		{
			// TODO Auto-generated catch block                                          
			e.printStackTrace();
		}
	}

}
