package PomORPagefactoryWithDDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM3
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver(); 
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			//To fetch data from excel
			String Path="F:\\excel files\\9 julymorning.xlsx";
			Thread.sleep(3000);
			FileInputStream file =new FileInputStream(Path);
			
			Sheet Sh =WorkbookFactory.create(file).getSheet("Sheet1");
		
			//1. Create obj of classs
			
			OrangeHRM1 OHP =new OrangeHRM1(driver);
			//Fetch username from excel sheet
		    String USerID =Sh.getRow(1).getCell(0).getStringCellValue();		    
			OHP.userID1(USerID);
			
			//2. //Fetch password from excel sheet
			  String Pass =Sh.getRow(1).getCell(1).getStringCellValue();
			  OHP.Pass(Pass);
			  OHP.Login();
			  
			  OrangeHRM2 OHP2 =new OrangeHRM2(driver);
			String Name =Sh.getRow(1).getCell(2).getStringCellValue();
			OHP2.name(Name);
			
			OHP2.Time();
						
			driver.quit();
		
	}

}



