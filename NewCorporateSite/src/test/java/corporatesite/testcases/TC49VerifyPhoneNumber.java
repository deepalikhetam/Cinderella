package corporatesite.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.HeaderFooter;

public class TC49VerifyPhoneNumber extends Browser {
	@Test(priority = 49)

  public void VerifyPhoneNumber() throws Exception {
	
		
		WebElement Navigation=driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span"));

		if(!Navigation.isDisplayed())
			
		{
			HeaderFooter.verifyPhoneNumber();
		}
		else{
		System.out.println("tc is not applied for the mobile");
		}
  }
}
