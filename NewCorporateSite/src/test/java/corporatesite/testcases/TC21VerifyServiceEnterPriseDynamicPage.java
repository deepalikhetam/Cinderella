package corporatesite.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.ServicePage;


public class TC21VerifyServiceEnterPriseDynamicPage extends Browser
{
	@Test(priority = 21)
	public void verifyServiceEnterPriseDynamicPage_TC21() throws Exception
	{
		
		try{
			
			Thread.sleep(5000);

			driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span")).click();
			System.out.println("Clicked on Navigatin menu");

			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='menu-item-1948']/span")).click();
			System.out.println("Clicked services arrow ");
			
			Thread.sleep(2000);
			
			//*[@class="sub-menu megamenu-item-inited open"]//*[@id="menu-item-1949"]
			WebElement Enterprisesolutionarrow =	driver.findElement(By.xpath("//*[@class='sub-menu megamenu-item-inited open']/li[2]//*[@class='swm-mini-menu-arrow']"));
			
			Enterprisesolutionarrow.click();
			
			System.out.println("Clicked Enterprisesolutionarrow  ");
			Thread.sleep(2000);

		}
		
		catch(Exception e)
		{
			
		}
		ServicePage.verifyServiceEnterPriseDynamic();
	}
}
