package TestNgKeywords;

import org.testng.annotations.Test;

public class DependsOnMethods 
{
   //in  depends on method attribute Perticular test case is depensd on another test method
	//by using depends on method we can execute method whatever we want first
	
	@Test  
	public void LoginPage()
	{
		System.out.println("this is login page");
	}

    @Test
    public void RegistrationPage()
	{
		System.out.println("this is Registation  page");
	}
    
   @Test
   public void HomePage()
	{
		System.out.println("this is home page");
	}
   
   @Test (dependsOnMethods = {"LoginPage"})
   public void LogOut()
	{
		System.out.println("this is logout page");
	}


}


