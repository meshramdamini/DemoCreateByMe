package POMwithoutPageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage2
{
	//without using Page factory //it is simple POM
	WebDriver driver;
	
	//constructor
	LoginPage2(WebDriver d)
	{
		driver =d;
	}
	//identification
	By username = By.id("user-name");
	By password = By.id("password");
	By loginbtn = By.id("login-button");
	
	//we create method for each web elements
	public void enterUsername(String uname)
	{
		driver.findElement(username).sendKeys(uname);
	}
	public void enterpassword(String pswrd)
	{
		driver.findElement(password).sendKeys(pswrd);
	}
	public void clickonlogin()
	{
		driver.findElement(loginbtn).click();
	}
}
