package RetryLogic;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class RetryListner implements IAnnotationTransformer
{
	

	public void transform(ITestAnnotation testAnnotation ,Class testClass, Constructor testConstructor, Method testMethod)
	{
		testAnnotation.setRetryAnalyzer(RetryAnalyser.class);
		
	}


}