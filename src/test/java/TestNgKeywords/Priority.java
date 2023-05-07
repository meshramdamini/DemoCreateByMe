package TestNgKeywords;

import org.testng.annotations.Test;

public class Priority 
{
	public class Enabled 
	{
		@Test (priority = 1)
		public void LoginPage()
		{
			System.out.println("this is login page");
		}

	    @Test(priority = 2)
	    public void RegistrationPage()
		{
			System.out.println("this is Registation  page");
		}
	    
	   @Test(priority = 3)
	   public void HomePage()
		{
			System.out.println("this is home page");
		}
	   
	   @Test (priority = 4)
	   public void LogOut()
		{
			System.out.println("this is logout page");
		}



	}
}
