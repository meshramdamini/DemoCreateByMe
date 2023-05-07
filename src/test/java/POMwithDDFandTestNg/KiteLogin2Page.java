package POMwithDDFandTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page 
{
//Declaration
@FindBy(xpath="//input[@id='pin']") private WebElement pin;
@FindBy(xpath="//button[text()='Continue ']") private WebElement cntBtn;

//Initialization
public KiteLogin2Page(WebDriver driver)
{
PageFactory.initElements(driver, this);
}

//Usage
public void setKiteLogin2PagePin(String pinValue)
{
pin.sendKeys(pinValue);
}
public void clickKiteLogin2PageCntBtn()
{
cntBtn.click();
}
}