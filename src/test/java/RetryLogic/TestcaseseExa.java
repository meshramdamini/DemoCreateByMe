package RetryLogic;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestcaseseExa 
{
	@Test //(retryAnalyzer = RetryAnalyser.class)
	public void testCase1()
	{
		Assert.assertTrue(false);
	}
	
	@Test //(retryAnalyzer = RetryAnalyser.class)
	public void TestCase2()
	{
		Assert.assertTrue(false);
	}
	
	@Test //(retryAnalyzer = RetryAnalyser.class)
	public void TestCase3()
	{
		Assert.assertTrue(true);
	}

}
