package corporatesite.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.ManagedSupport;

public class TC39VerifyManagesupport_CloudPage extends Browser{
	@Test(priority = 39)


	public void verifyCloudpage_TC33() throws Exception
	{
	
		System.out.println("Cloud");

		try{
			
		
			driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span")).click();
			System.out.println("Clicked on Navigatin menu");

			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='menu-item-1948']/span")).click();
			System.out.println("Clicked services arrow ");
			
			Thread.sleep(2000);
			
			
			WebElement Managesupportarrow =	driver.findElement(By.xpath("//*[@id='menu-item-3375']//*[@class='swm-mini-menu-arrow']"));
			
			Managesupportarrow.click();
		}
		
		catch(Exception e)
		{
			
		}
		
		
		ManagedSupport.VerifyManagesupport_Cloudpage();	
//		ManagedSupport.verifyManagesuport_Cloud_FormvalidationOnBlank();
//		ManagedSupport.verfiyMnagesupport_CloudForm();
//		ManagedSupport.ManageSupport_CloudtverifyFieldVldMsg();


	}
}
