package corporatesite.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.CloudComputingPage;

public class TC63VerifyAmazonWebServicesContactUs extends Browser {
	@Test(priority = 63)

  public void VerifyAmazonWebServicesContactUs() throws Exception
  {
		 System.out.println("AmazonWebServices");

		
		try{
			
			Thread.sleep(5000);

			driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span")).click();
			System.out.println("Clicked on Navigatin menu");

			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='menu-item-1948']/span")).click();
			System.out.println("Clicked services arrow ");
			
			Thread.sleep(2000);
			
			
			
			WebElement Cloudcomputingarroww =driver.findElement(By.xpath("//*[@class='sub-menu megamenu-item-inited open']/li[1]//*[@class='swm-mini-menu-arrow']"));
			
			Cloudcomputingarroww.click();
			
			System.out.println("Clicked Cloud computing  arrow ");
			Thread.sleep(2000);
		}
		
		catch(Exception e)
		{
			
		
		
		}
	  CloudComputingPage.VerifyAmazonWebServicesPage();
//	  CloudComputingPage.VerifyAmazonWebServices_FormvalidationOnBlank();
//	  CloudComputingPage.verifyAmazonWebServices_Form();
	  CloudComputingPage.VerifyAmazonWebServices_VldMsg();
  }
}
