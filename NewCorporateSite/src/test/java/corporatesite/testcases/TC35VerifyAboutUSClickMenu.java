package corporatesite.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import corporatesite.AboutUs;
import corporatesite.Browser;


public class TC35VerifyAboutUSClickMenu extends Browser
{
	@Test(priority = 35)


	public void verifyboutUSClickMenu_TC20() throws Exception
	{
		
		try{
			driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span")).click();
			System.out.println("Clicked on Navigatin menu");

			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='menu-item-1944']/span")).click();
			System.out.println("Clicked on About Us arrow ");
			//AboutUs.verifyAboutUsPage();
		}
		
		catch(Exception e)
		{
			
		}
		
		
		AboutUs.verifyAboutUsPage();


	}
}
