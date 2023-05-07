package EnableDesableTestCases;

import org.testng.annotations.Test;

public class LoanDepartment 
{
	//using @annotation we can enable or disable test cases
	@Test(enabled = false)
	public void MobileLoginPersonalLoan()
	{
		System.out.println("Mobile login personal loan");
	}
   
	@Test (enabled = false)
	public void WebLoginPersonalLoan()
	{
		System.out.println("web login Automobile loan");
	}
	
	@Test (enabled = true)
	public void APILoginPersonalLoan()
	{
		System.out.println("API login personal loan");
	}
	
	@Test
	public void MobileLoginAutomobileLoan()
	{
		System.out.println("Mobile login Automobile loan");
	}
	
	@Test
	public void WebLoginAutomobileLoan() 
	{
		System.out.println("Web login Automobile loan");
	}
	
	@Test
	public void APILoginAutomobileLoan()
	{
		System.out.println("API login Automobile loan");
	}

}
