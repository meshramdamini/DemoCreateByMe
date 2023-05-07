package TestNgKeywords;

import org.testng.annotations.Test;

public class Enabled 
{
	@Test (enabled = false)
	public void LoginPage()
	{
		System.out.println("this is login page");
	}

    @Test(enabled = false)
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

