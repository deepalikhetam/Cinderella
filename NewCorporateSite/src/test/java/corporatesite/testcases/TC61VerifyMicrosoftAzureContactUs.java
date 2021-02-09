package corporatesite.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.CloudComputingPage;

public class TC61VerifyMicrosoftAzureContactUs extends Browser {
	@Test(priority = 61)

  public void VerifyMicrosoftAzureValidationMsg() throws Exception
  {
		System.out.println("Microsoft Azure");
		
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
		
		
		CloudComputingPage.VerifyMicrosoftAzurePage();
//		CloudComputingPage.VerifyMicrosoftAzurePage_FormvalidationOnBlank();
//		CloudComputingPage.verifyMicrosoftAzure_Form();
		CloudComputingPage.VerifyMicrosoftAzure_VldMsg();
  }
}

