package corporatesite.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.HeaderFooter;

public class TC50VerifyEmailPopup extends Browser {
	@Test(priority = 50)

  public void VerifyEmailPopup() throws Exception {
	  
	
		
		
		WebElement Navigation=driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span"));

		if(!Navigation.isDisplayed())
			
		{
			  HeaderFooter.verifyEmail();
		}
		else{
		System.out.println("tc is not applied for the mobile");
		}
		
  }
}
