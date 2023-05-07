package TestNgKeywords;

import org.testng.annotations.Test;


//Timeout is the time which is the maximum time given to  a test case to complete in testNG
//it is the time limit given to the test case for complete execution
//If the test case takes more than the specified time to finish them testNG will abort it and marked it as failed
public class TimeOut 
{
	@Test (timeOut = 1000)
	public void LoginPage()
	{
		System.out.println("this is login page");
	}

    @Test(timeOut = 2000)
    public void RegistrationPage()
	{
		System.out.println("this is Registation  page");
	}
    
   @Test
   public void HomePage()
	{
		System.out.println("this is home page");
	}
   
   @Test 
   public void LogOut()
	{
		System.out.println("this is logout page");
	}

}
