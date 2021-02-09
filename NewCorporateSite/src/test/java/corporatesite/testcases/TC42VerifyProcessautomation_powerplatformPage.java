package corporatesite.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.Processautomation;

public class TC42VerifyProcessautomation_powerplatformPage extends Browser{
	
	
	

	
	@Test(priority = 44)
	
	
		public void verifyProcessautomation_powerplatformPage_TC39() throws Exception
		{
		
			
		System.out.println("nintext");
		
		

		

		try{
			
			Thread.sleep(5000);

			driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span")).click();
			System.out.println("Clicked on Navigatin menu");

			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='menu-item-1948']/span")).click();
			System.out.println("Clicked services arrow ");
			
			Thread.sleep(2000);
			
			
			WebElement Managesupportarrow =	driver.findElement(By.xpath("//*[@id='menu-item-1962']//*[@class='swm-mini-menu-arrow']"));
			
			Managesupportarrow.click();
			
			System.out.println("Clicked Process automation arrow ");
			Thread.sleep(2000);

		}
		
		catch (Exception e)
		{
			
		}
		Thread.sleep(2000);

			Processautomation.VerifyProcessautomation_PowerplatformPage();

			

//			Processautomation.VerifyProcessautomation_PowerPlatformverifyFieldVldMsg();
			//Processautomation.VerifyProcessautomation_powerplatform_FormvalidationOnBlank();

//			Processautomation.VerifyProcessautomation_powerplatform_Form();

		}


}
