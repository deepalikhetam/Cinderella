package corporatesite.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.Resource;

public class TC48VerifyResourceBlogPage extends Browser 
{
	
	@Test(priority = 48)
	public void verifyverifyResourceBlogPage() throws Exception
	{
		
		try {

			Thread.sleep(2000);

			driver.findElement(
					By.xpath("//*[@id='swm-mobi-nav-btn']/span/span")).click();
			System.out.println("Clicked on Navigatin menu");

			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='menu-item-3383']/span"))
					.click();
			System.out.println("Clicked resource arrow ");

			Thread.sleep(2000);

		}

		catch (Exception e) {

		}
//		
				Resource.VerifyResource_BlogPage();
//				Resource.VerifyResource_pagination();
//
//				
//				Resource.VerifyResource_BlogClickreadmore();
//				Resource.VerifyResource_Blogsearch();
//				Resource.VerifyResource_ClickLink();
//			
//	}

	//	mobilecarrer.verifyCareerPage();
	
	}

}
