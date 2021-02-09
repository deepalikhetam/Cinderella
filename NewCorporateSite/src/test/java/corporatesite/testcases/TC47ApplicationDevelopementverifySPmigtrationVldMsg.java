package corporatesite.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import corporatesite.ApplicationDevelopement;
import corporatesite.Browser;

public class TC47ApplicationDevelopementverifySPmigtrationVldMsg extends Browser
{
	
	
	@Test(priority = 47)
	public void verifyApplicationDevelopementPage_TC47() throws Exception
	{
		
		
		
		

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
	//	TC45ToverifyApplicationDevelopementPage.verifyApplicationDevelopementPage_TC45();
	
	//	TC45ToverifyApplicationDevelopementPage.verifyApplicationDevelopementPage_TC45();
	ApplicationDevelopement.SPMigrationtpage();
		ApplicationDevelopement.verifygetfreequoteClick();

		ApplicationDevelopement.verifySPmigtrationVldMsg();
		driver.navigate().refresh();

		ApplicationDevelopement.verifygetfreequoteClick();
		Thread.sleep(5000);
		ApplicationDevelopement.verfiySPmigtrationVldForm();
	}

}
