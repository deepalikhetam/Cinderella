package corporatesite.testcases;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.Resource;


public class TC48VerifyResource_NewsRoomPage extends Browser{
	@Test(priority = 48)


	public void verifyNewsRoom_T48() throws Exception
	{
	

		try{
			
			Thread.sleep(2000);

			driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span")).click();
			System.out.println("Clicked on Navigatin menu");

			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='menu-item-3383']/span")).click();
			System.out.println("Clicked resource arrow ");
			
			Thread.sleep(2000);
			
			
			

		}
		
		catch(Exception e)
			{
				
			}
		
		Resource.VerifyResource_NewsRoomPage();
		
		

	}
	
}
