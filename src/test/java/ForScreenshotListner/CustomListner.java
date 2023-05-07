package ForScreenshotListner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListner extends Base implements ITestListener
{
	@Override
	public void onTestStart(ITestResult result)  
	{
		
		
	}
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		
		
	}
	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Failed Test");
		Failed(result.getMethod().getMethodName());
		
		
	}
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		
		
	}
	@Override
	public void onFinish(ITestContext context) 
	{
		
		
	}

    
}
