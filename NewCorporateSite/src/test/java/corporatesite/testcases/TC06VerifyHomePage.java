package corporatesite.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.HomePage;

public class TC06VerifyHomePage extends Browser
{
	@Test(priority = 6)
	public void verifyHomePage_TC06() throws Exception
	{
		
	try{
			
			Thread.sleep(2000);

			driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span")).click();
			System.out.println("Clicked on Navigatin menu");

			
			Thread.sleep(2000);
		}
	
	catch(Exception e)
		{
			
		}
		HomePage.verifyHomePage();
	}
}
