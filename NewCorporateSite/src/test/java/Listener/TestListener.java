package Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import corporatesite.utility.ExtentManager;
import corporatesite.utility.ExtentTestManager;
import corporatesite.utility.Library;

public class TestListener implements ITestListener
{
	public void onStart(ITestContext context) 
	{
		System.out.println("***Test Suite "+context.getName()+" Started ***");
	}
	public void onFinish(ITestContext context) 
	{
		System.out.println(("*** Test Suite " + context.getName() + " ending ***"));
		ExtentTestManager.endTest();
		ExtentManager.getReporter().flush();
	}
	public void onTestStart(ITestResult result) 
	{
		System.out.println("TestCases Started: "+result.getName());
		ExtentTestManager.startTest(result.getMethod().getMethodName());
	}
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("**TestCases Execution Completed & Passed: "+result.getName()+"\n");
		ExtentTestManager.getTest().log(Status.PASS, "Test passed");
	}
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("**TestCases Execution Completed & Failed: "+result.getName());	
        String screenShot = Library.captureScreenshot();
        try 
        {
        	ExtentTestManager.getTest().addScreenCaptureFromPath(screenShot);
			ExtentTestManager.getTest().fail("Test Case Failed: "+result.getName(), MediaEntityBuilder.createScreenCaptureFromPath(screenShot).build());
		} 
        catch (Exception e) 
        {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("**Test Cases Skipped: "+result.getName());
		ExtentTestManager.getTest().log(Status.SKIP, "Test Skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		System.out.println("*** Test failed but within percentage % " + result.getMethod().getMethodName());
	}
}
