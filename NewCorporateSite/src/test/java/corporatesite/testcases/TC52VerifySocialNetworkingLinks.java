package corporatesite.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.HeaderFooter;

public class TC52VerifySocialNetworkingLinks extends Browser {
	@Test(priority = 52)

  public void VerifySocialNetworkingLinks() throws Exception {
	  

		WebElement Navigation=driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span"));

		if(!Navigation.isDisplayed())
			
		{
			HeaderFooter.SocialLinks();

		}
		else{
		System.out.println("tc is not applied for the mobile");
		}
		
  }
}
