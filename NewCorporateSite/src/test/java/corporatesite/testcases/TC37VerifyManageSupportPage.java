package corporatesite.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.ManagedSupport;

public class TC37VerifyManageSupportPage extends Browser {
	
	@Test(priority = 37)


	public void verifyManagesupportPage_TC01() throws Exception
	{
		
		
		
		
		
		System.out.println("Manage support");

		

		try{
			
		
			driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span")).click();
			System.out.println("Clicked on Navigatin menu");

			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='menu-item-1948']/span")).click();
			System.out.println("Clicked services arrow ");
		}
		
		catch(Exception e)
		{
			
		}
		
		
		
		
		

		
		ManagedSupport.VerifyManagesupportPage();
		
		
		
		
		try{
			Thread.sleep(2000);

			driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span")).click();
			System.out.println("Clicked on Navigatin menu");

			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='menu-item-1948']/span")).click();
			System.out.println("Clicked services arrow ");
			
			Thread.sleep(5000);
			
			
			WebElement Managesupportarrow =	driver.findElement(By.xpath("//*[@id='menu-item-3375']//*[@class='swm-mini-menu-arrow']"));
			
			Managesupportarrow.click();
			
		//	driver.findElement(By.xpath("//*[@id='menu-item-3375']//*[@class='swm-mini-menu-arrow']")).click();
			//System.out.println("Clicked  arrow ");
			//((JavascriptExecutor) driver).executeScript("arguments[0].click();", Managesupportarrow);

		}
		
		catch(Exception e)
		{
			
		}
	
	}

}
