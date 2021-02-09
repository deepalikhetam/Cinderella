package corporatesite.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;







import corporatesite.AboutUs;
import corporatesite.Browser;


public class TC35VerifyAboutUsClickSubmenu extends Browser
{
	@Test(priority = 35)


	public void verifyAboutUS_Submenus_TC20() throws Exception
	{
// add 
// there is for navigation to arrow button 
		try{
				driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span")).click();
				System.out.println("Clicked on Navigatin menu");

				
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@id='menu-item-1944']/span")).click();
				System.out.println("Clicked on About Us arrow ");
			}
			
			catch(Exception e)
			{
				
			}
		Thread.sleep(5000);

		AboutUs.ClickOnAboutCompany();
		try{
			driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span")).click();
			System.out.println("Clicked on Navigatin menu");

			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='menu-item-1944']/span")).click();
			System.out.println("Clicked on About Us arrow ");
		}
		
		catch(Exception e)
		{
			
		}
		
		AboutUs.ClickOnCoreTeam();
		
		try{
			driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span")).click();
			System.out.println("Clicked on Navigatin menu1");

			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='menu-item-1944']/span")).click();
			System.out.println("Clicked on About Us arrow1 ");
		}
		
		catch(Exception e)
		{
			
		}
	//	AboutUs.ClickOnOurPartner();
		
		//Businessintelligence.verifybusinessintelligenceFormvalidationOnBlank();

	

		
	}
}