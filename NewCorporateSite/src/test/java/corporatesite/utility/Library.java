package corporatesite.utility;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import corporatesite.Browser;
//import corporatesite.pages.BaseClass;

public class Library extends Browser
{
	public static String captureScreenshot()
	{
		WebDriver driver = Browser.driver;
		TakesScreenshot ts =(TakesScreenshot)driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		String path= System.getProperty("user.dir")+"\\Screenshot\\"+System.currentTimeMillis()+".png";
		File dest = new File(path);
		try
		{
			FileHandler.copy(srcfile,dest);
			System.out.println("Screenshot Captured");
		}
		catch (Exception e) 
		{
			System.out.println("Exception Occured while Taking Screenshot"+e.getMessage());
		}
		return path;
	}
}
