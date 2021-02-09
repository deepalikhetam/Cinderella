package corporatesite.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.Businessintelligence;

public class TC36VerifybusinessintelligencVldMsg extends Browser {
	
	
	 
	 @Test(priority = 36)
		public void verifyVerifybusinessintelligencmVldMsg__TC24() throws Exception
		{
		 Businessintelligence. businessintelligenceverifyFieldVldMsg();
	
		
		
		try{
				
				
				Thread.sleep(4000);
				WebElement header = driver.findElement(By.xpath("//*[@id='swm-outer-wrap']/div[1]/div/div/div/div[1]/div[2]"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", header);
//				Thread.sleep(4000);
//				driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span")).click();
//				System.out.println("Clicked on Navigatin menu");
//
//				
//				Thread.sleep(5000);
//				driver.findElement(By.xpath("//*[@id='menu-item-1948']/span")).click();
//				System.out.println("Clicked services arrow ");
			}
			
			catch(Exception e)
			{
				
			}
		 
		
		}
	 

}
