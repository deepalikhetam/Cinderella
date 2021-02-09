package corporatesite.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.Resource;


public class TC48VerifyResource_WhitepaperPageClickDownload extends Browser{
	@Test(priority = 48)


	public void verifyWhitepageClickDownload_TC48() throws Exception
	{
	
		System.out.println("tc start");

		Thread.sleep(5000);
		
		Resource.VerifyResource_WhitepaperClickonDownloadPaper();
	
		try{
			
			
			Thread.sleep(4000);
			WebElement header = driver.findElement(By.xpath("//*[@id='swm-outer-wrap']/div[1]/div/div/div/div[1]/div[2]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", header);

			System.out.println("scroll to header");

			

		}
		
		catch(Exception e)
		{
			
		}
	
	
	
	}
}
