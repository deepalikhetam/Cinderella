package corporatesite.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.SolutionPage;


public class TC20VerifySolutionPageIntranetSolution extends Browser
{
	@Test(priority = 20)
	public void verifySolutionPageIntranetSolution_TC20() throws Exception
	{
		
		
		
	System.out.println("Solution");
	
	

	try{
		
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span")).click();
		System.out.println("Clicked on Navigatin menu");

		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='menu-item-3381']/span")).click();
		System.out.println("Clicked Solution arrow ");
		
		Thread.sleep(2000);
		
		//*[@class="sub-menu megamenu-item-inited open"]//*[@id="menu-item-1949"]
//		WebElement ProcessautomationArrow =	driver.findElement(By.xpath("//*[@id='menu-item-1962']//*[@class='swm-mini-menu-arrow']"));
//		
//		ProcessautomationArrow.click();
//		
//		System.out.println("Clicked Process automation arrow ");
//		Thread.sleep(2000);

	}
	
	catch(Exception e)
	{
		
	}

		SolutionPage.verifySolutionPageIntranetSolution();
	}
}
