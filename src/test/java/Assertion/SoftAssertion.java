package Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class SoftAssertion 
 {
	@Test
	public void testmethod2()
	{
	System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 
	 SoftAssert softAs = new SoftAssert();
	 driver.get("https://testautomationpractice.blogspot.com/");
	 
	 System.out.println("verifying title...");
	 String expectedTitle = "Automation Testing Practice1";//1 fail but continue
	 String actualTitle= driver.getTitle();
	 softAs.assertEquals(expectedTitle,actualTitle,"Title verification");

 
	 System.out.println("verifiying presence of wikipedia-icon");
    WebElement icon = driver.findElement(By.xpath("//img[@class=\"wikipedia-icon\"]"));
    softAs.assertTrue(icon.isDisplayed());
   
   System.out.println("verifiying presence of wikipedia-search-button");
   WebElement searchbtn  = driver.findElement(By.xpath("//input[@class=\"wikipedia-search-button\"]"));
   softAs.assertTrue(searchbtn.isDisplayed());
   
   driver.close();
   
   //report all failuer report
   softAs.assertAll();

}


}

