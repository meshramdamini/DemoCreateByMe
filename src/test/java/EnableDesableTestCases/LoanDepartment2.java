package EnableDesableTestCases;

import org.testng.annotations.Test;

public class LoanDepartment2 {
	//By using using include/exclude keyword we can enable or disable test cases
	//using xml-file
	@Test
	public void MobileLoginPersonalLoan()
	{
		System.out.println("Mobile login personal loan");
	}
   
	@Test 
	public void WebLoginPersonalLoan()
	{
		System.out.println("web login Automobile loan");
	}
	
	@Test 
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
	
	/*<?xml version="1.0" encoding="UTF-8"?>
	<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
	<suite name="Suite">
	  <test thread-count="5" name="Test">
	     
	     <classes>
	      <class name="EnableDesableTestCases.LoanDepartment2">
	   
	      <methods>
	      <exclude name="WebLoginPersonalLoan"></exclude>
	      </methods>
	     </class>
	    </classes>
	  </test> <!-- Test -->
	</suite> <!-- Suite -->*/



