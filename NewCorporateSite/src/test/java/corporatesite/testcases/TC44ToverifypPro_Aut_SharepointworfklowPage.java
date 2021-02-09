package corporatesite.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.Processautomation;

public class TC44ToverifypPro_Aut_SharepointworfklowPage extends Browser {
	
	
	@Test(priority = 41)
	public void verifysharepointwfPage_TC39() throws Exception {

		
		

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
		
		catch(Exception e)
		{
			
		}

		
		Processautomation.VerifyProcessautomation_SharepointworkflowsPage();
	}
//pend

}
