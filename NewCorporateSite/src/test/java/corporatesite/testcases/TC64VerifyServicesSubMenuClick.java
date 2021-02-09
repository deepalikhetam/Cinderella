package corporatesite.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import corporatesite.ApplicationDevelopement;
import corporatesite.Browser;
import corporatesite.Businessintelligence;
import corporatesite.CloudComputingPage;
import corporatesite.ManagedSupport;
import corporatesite.Processautomation;
import corporatesite.ServicePage;

public class TC64VerifyServicesSubMenuClick extends Browser {
@Test(priority = 64)

  public void VerifyServicesSubMenuClick() throws Exception
  {
	System.out.println("Microsoft365Page ");

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
	
	
		CloudComputingPage.VerifyMicrosoft365Page();
//		
//	
//		System.out.println("MicrosoftAzurePage ");
//
//		try{
//			
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span")).click();
//			System.out.println("Clicked on Navigatin menu");
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//*[@id='menu-item-1948']/span")).click();
//			System.out.println("Clicked services arrow ");
//			Thread.sleep(2000);
//			WebElement Cloudcomputingarroww =driver.findElement(By.xpath("//*[@class='sub-menu megamenu-item-inited open']/li[1]//*[@class='swm-mini-menu-arrow']"));
//			Cloudcomputingarroww.click();
//			System.out.println("Clicked Cloud computing  arrow ");
//			Thread.sleep(2000);;
//
//		}
//		
//		catch(Exception e)
//		{
//			
//		
//		
//		}
//		
//		
//	  CloudComputingPage.VerifyMicrosoftAzurePage();
//	  
//	  
//	  
//		System.out.println("AmazonWebServicesPage ");
//
//		try{
//			
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span")).click();
//			System.out.println("Clicked on Navigatin menu");
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//*[@id='menu-item-1948']/span")).click();
//			System.out.println("Clicked services arrow ");
//			Thread.sleep(2000);
//			WebElement Cloudcomputingarroww =driver.findElement(By.xpath("//*[@class='sub-menu megamenu-item-inited open']/li[1]//*[@class='swm-mini-menu-arrow']"));
//			Cloudcomputingarroww.click();
//			System.out.println("Clicked Cloud computing  arrow ");
//			Thread.sleep(2000);
//
//		}
//		
//		catch(Exception e)
//		{
//			
//		
//		
//		}
//	  CloudComputingPage.VerifyAmazonWebServicesPage();
//	  ServicePage.verifyServiceEnterPriseDynamic();
//	  ServicePage.verifyServiceEnterPriseBusinessCentral();
//	  ServicePage.verifyServiceEnterPriseMicrosoftSP();
//	  ServicePage.verifyServiceEnterPriseServiceNow();
	  
	  
	  System.out.println("nintext");
		
		

		try{
			
			Thread.sleep(5000);

			driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span")).click();
			System.out.println("Clicked on Navigatin menu");

			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='menu-item-1948']/span")).click();
			System.out.println("Clicked services arrow ");
			Thread.sleep(2000);
			WebElement ProcessautomationArrow =	driver.findElement(By.xpath("//*[@id='menu-item-1962']//*[@class='swm-mini-menu-arrow']"));
			ProcessautomationArrow.click();
			System.out.println("Clicked Process automation arrow ");
			Thread.sleep(2000);
		

			
		}
		
		catch(Exception e)
		{
			
		}
	  Processautomation.VerifyProcessautomation_nintexautomationpage();
	//  Processautomation.VerifyProcessautomation_SharepointworkflowsPage();
	
	  System.out.println("infopath");
		
	try{
			
			Thread.sleep(5000);

			driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span")).click();
			System.out.println("Clicked on Navigatin menu");

			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='menu-item-1948']/span")).click();
			System.out.println("Clicked services arrow ");
			Thread.sleep(2000);
			WebElement ProcessautomationArrow =	driver.findElement(By.xpath("//*[@id='menu-item-1962']//*[@class='swm-mini-menu-arrow']"));
			ProcessautomationArrow.click();
			System.out.println("Clicked Process automation arrow ");
			Thread.sleep(2000);
		

			
		}
		
		catch(Exception e)
		{
			
		}
	  Processautomation.VerifyProcessautomation_infopathPage();
	  System.out.println("Power platfrom");
		
		

			try{
				
				Thread.sleep(5000);

				driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span")).click();
				System.out.println("Clicked on Navigatin menu");

				
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id='menu-item-1948']/span")).click();
				System.out.println("Clicked services arrow ");
				Thread.sleep(2000);
				WebElement ProcessautomationArrow =	driver.findElement(By.xpath("//*[@id='menu-item-1962']//*[@class='swm-mini-menu-arrow']"));
				ProcessautomationArrow.click();
				System.out.println("Clicked Process automation arrow ");
				Thread.sleep(2000);
			

				
			}
			
			catch(Exception e)
			{
				
			}
			
	  Processautomation.VerifyProcessautomation_PowerplatformPage();
	  System.out.println("RPA");
		
		

			try{
				
				Thread.sleep(5000);

				driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span")).click();
				System.out.println("Clicked on Navigatin menu");

				
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id='menu-item-1948']/span")).click();
				System.out.println("Clicked services arrow ");
				Thread.sleep(2000);
				WebElement ProcessautomationArrow =	driver.findElement(By.xpath("//*[@id='menu-item-1962']//*[@class='swm-mini-menu-arrow']"));
				ProcessautomationArrow.click();
				System.out.println("Clicked Process automation arrow ");
				Thread.sleep(2000);
			

				
			}
			
			catch(Exception e)
			{
				
			}
			
			
	  Processautomation.VerifyProcessautomation_RPAPage();
	  
	  
	  System.out.println("Power platfrom");
		
		

			try{
				
				Thread.sleep(5000);

				driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span")).click();
				System.out.println("Clicked on Navigatin menu");

				
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id='menu-item-1948']/span")).click();
				System.out.println("Clicked services arrow ");
				Thread.sleep(2000);
				

				
			}
			
			catch(Exception e)
			{
				
			}
	  Businessintelligence.VerifybusinessintelligencePage();
	  ManagedSupport.VerifyManagesupportPage();
	  ManagedSupport.VerifyManagesupport_ShareppointPage();
	  ManagedSupport.VerifyManagesupport_Cloudpage();
	  ManagedSupport.VerifyManagesupport_Databasepage();
	  ApplicationDevelopement.VerifyApplicationDevelopementpage();
	  
  }
}
