package interviewQueSiemens;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args)throws InterruptedException
	{
       System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\Chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.siemens.com/global/en.html");
        
        //driver.manage().deleteAllCookies();
       // Set<Cookie> cookiesListNew =  driver.manage().getCookies();
       // cookiesListNew.size();
        //System.out.println("The size is "+cookiesListNew);
 
       
		driver.findElement(By.xpath("Accept All Cookies[2]")).click();
	
				//Xpath=//*[contains(text(),'here')]
		
		//driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		//driver.findElement(By.cssSelector("button[class=\"sc-eDvSVe cTBEww\"]")).click();
		
		//JavascriptExecutor Js =(JavascriptExecutor)driver;
		
		//WebElement element = (WebElement)Js.executeScript("return document.querySelector(\"#usercentrics-root\").shadowRoot.querySelector(\"#uc-center-container>div.sc-cCjUDiG>div>div>div>button:nth-child(2)\")");
		//element.click();
		
		
		
		
	} 

}
