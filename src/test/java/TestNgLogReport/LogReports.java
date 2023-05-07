package TestNgLogReport;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LogReports
{ 
	@Test
	public void testMethod1()
	{
		System.out.println("this is test method1");
		Reporter.log("this is test method1");
	}
	@Test
	public void testMethod2() 
	{
		System.out.println("this is test method2");
		Reporter.log("this is test method2");
	}
	@Test
	public void testMethod3()
	{
		System.out.println("this is test method3");
		Reporter.log("this is test method3");
	}
	@Test
	public void testMethod4()
	{
		System.out.println("this is test method4");
		Reporter.log("this is test method4");
	}

}

