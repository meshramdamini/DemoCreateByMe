package Extentsreports;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class BasicExtentReport implements ITestListener
{
	//object create of variable
	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest Test;



	@BeforeTest
	public void startreport()
	{
		//initialize objects
		htmlReporter = new ExtentSparkReporter("ExtentReporterDemo.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);

		//add environment details
		reports.setSystemInfo("machine","testpc1");
		reports.setSystemInfo("OS","windows 11");
		reports.setSystemInfo("user","damini");
		reports.setSystemInfo("Browser","Chrome");

		//configuration to change look and feel

		htmlReporter.config().setDocumentTitle("Extent report Demo");
		htmlReporter.config().setReportName("Test Report");
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTimeStampFormat("EEEE,MMMM dd,yyyy, hh:mm a '('zzz')'");


	}
	@Test
	public void LaunchBrowser()
	{
		Test=reports.createTest("launch browser and open URL");
		Assert.assertTrue(true);
	}

	@Test
	public void verifyTitle()
	{
		Test = reports.createTest("VerifyTitle");
		Assert.assertTrue(false);
	}

	@Test
	public void verifyLogo()
	{
		Test = reports.createTest("Verify logo");
		Assert.assertTrue(true);
	}

	@Test
	public void verifyEmail()
	{
		Test = reports.createTest("Verify Email");
		throw new SkipException("Skipping this test case with exception..");
	}
	
	@Test
	public void verifyuserName()
	{
		Test = reports.createTest("Verify Username");
		Assert.assertTrue(true);
	}

	
	@Test
	public void TC002_checkd()
	{
		Test = reports.createTest("Verify Username");
		Assert.assertTrue(true);
	}
	@AfterMethod
	public void getTestResult(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Test.log(Status.FAIL,MarkupHelper.createLabel(result.getName()+ "FAILED" , ExtentColor.RED));
			Test.fail(result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			Test.log(Status.PASS,MarkupHelper.createLabel(result.getName()+ "PASSED" , ExtentColor.GREEN));
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			Test.log(Status.SKIP,MarkupHelper.createLabel(result.getName()+ "SKIPPED" , ExtentColor.ORANGE));
		}
	}
	
	@AfterTest
	public void teardDown()
	{
		reports.flush();
	}
}
