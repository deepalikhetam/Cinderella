package corporatesite.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.ContactUsPage;
//import corporatesite.pages.BaseClass;

public class TC01VerifyContactUsPage extends Browser
{
	@Test(priority = 1)
	public void verifyContactUs_TC01() throws Exception
	{
	try{
			
			Thread.sleep(2000);

			driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span")).click();
			System.out.println("Clicked on Navigatin menu");

			
			Thread.sleep(2000);
		}
	
	catch(Exception e)
		{
			
		}
	
	ContactUsPage.verifyContactUsPage();
			
			


	}
}
