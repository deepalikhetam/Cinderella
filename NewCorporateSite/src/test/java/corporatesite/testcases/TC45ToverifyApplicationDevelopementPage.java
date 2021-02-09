package corporatesite.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import corporatesite.ApplicationDevelopement;
import corporatesite.Browser;

public class TC45ToverifyApplicationDevelopementPage extends Browser {
	
	@Test(priority = 45)
	public static void verifyApplicationDevelopementPage_TC45() throws Exception
	{
		
		

		try{
			
			Thread.sleep(5000);

			driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span")).click();
			System.out.println("Clicked on Navigatin menu");

			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='menu-item-1948']/span")).click();
			System.out.println("Clicked services arrow ");
			
			
		}
		
		catch(Exception e)
			{
				
			}
		ApplicationDevelopement.VerifyApplicationDevelopementpage();
	}
}
