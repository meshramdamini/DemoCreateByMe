package Listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerClass implements ITestListener 
{
 
	//ItestListener class k sare method ko addressd krna maindatory hai
	public void onStart(ITestContext Result)
	{
		System.out.println("onStart method invoke..");
	}
	public void onFinish(ITestContext Result)
	{
		System.out.println("onFinish method invoke..");
	}
	public void onTestFailuer(ITestResult Result)
	{
		System.out.println("name of test method failed:"+Result.getName());
	}
	
	public void OnTestKipped(ITestResult Result)
	{
		System.out.println("name of test method skipped:"+Result.getName());
	}
	
	public void onTestStart(ITestResult  Result)
	{
		System.out.println("name of test method started: "+Result.getName());
	}
	
	public void onTestSuccess(ITestResult Result)
	{
		System.out.println("neme of test method successfully executed:"+Result.getName());
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) 
	{
		
	}
	
}
