package POMwithDDFandTestNg;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLogOutTest 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
	//To load excel sheet
	FileInputStream file = new FileInputStream("F:\\excel files\\9 julymorning.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	//To open chrome browser
	
	System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	//To give implicitly wait
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//To maximize browser
	driver.manage().window().maximize();
	//To open / enter url of kite app
	driver.get("https://kite.zerodha.com/");
	//wait for 3sec after opening kite app
	Thread.sleep(3000);
	//To create object of pom class
	KiteLogin1Page login1 = new KiteLogin1Page(driver); login1.setKiteLogin1PageUsername(sh.getRow(0).getCell(0).getStringCellValue()); login1.setKiteLogin1PagePassword(sh.getRow(0).getCell(1).getStringCellValue());
	login1.clickKiteLogin1PageLoginBtn();
	KiteLogin2Page login2 = new KiteLogin2Page(driver); login2.setKiteLogin2PagePin(sh.getRow(1).getCell(0).getStringCellValue());
	login2.clickKiteLogin2PageCntBtn();
	KiteHomePage home = new KiteHomePage(driver); home.verifyKiteHomePagePN(sh.getRow(1).getCell(1).getStringCellValue());
	home.clickKiteHomePagePN();
	KiteProfilePage profile = new KiteProfilePage(driver);
	profile.clickKiteProfilePageLogoutBtn();
	}

	
	

}
