package corporatesite.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.Businessintelligence;

public class TC36VerifybusinessintelligencePage  extends Browser{
	
	
	 @Test(priority = 36)
		public void verifybusinessintelligencePage_TC36() throws Exception
		{
		 
		 

			try{
				driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span")).click();
				System.out.println("Clicked on Navigatin menu");

				
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@id='menu-item-1948']/span")).click();
				System.out.println("Clicked services arrow ");
			}
			
			catch(Exception e)
			{
				
			}
		 
		 Businessintelligence.VerifybusinessintelligencePage();
//		 Businessintelligence.verifybusinessintelligenceFormvalidationOnBlank();
//		 Businessintelligence.verfiybusinessintelligenceForm();;
//		 Businessintelligence. businessintelligenceverifyFieldVldMsg();

		}
	 
	 
	 

}
