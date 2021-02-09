package corporatesite.utility;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import corporatesite.utility.ExtentManager;

public class ExtentTestManager 
{
	static Map<Integer, ExtentTest> extentTestMap = new HashMap<Integer, ExtentTest>();
	public static ExtentReports extent= ExtentManager.getReporter();
	
	public static synchronized ExtentTest getTest()
	{
		return extentTestMap.get((int) (Thread.currentThread().getId()));
	}
	public static synchronized void endTest()
	{
		extent.flush();
	}
	public static synchronized ExtentTest startTest(String testName)
	{
		ExtentTest test=extent.createTest(testName);
		extentTestMap.put((int) (Thread.currentThread().getId()),test);
		return test;
	}
	public static ITestContext setContext(ITestContext iTestContext, WebDriver driver)
	{
        iTestContext.setAttribute("driver", driver);
        return iTestContext;
    }
}
