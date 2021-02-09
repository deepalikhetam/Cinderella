package corporatesite.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.Processautomation;



public class TC40VerifyProAut_NintexAutoPage extends Browser {
	
	@Test(priority = 40)
	public void verifyProAut_NintexAutoPagE_TC39() throws Exception
	{
	
		
		
	System.out.println("nintext");
	
	

	try{
		
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span")).click();
		System.out.println("Clicked on Navigatin menu");

		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='menu-item-1948']/span")).click();
		System.out.println("Clicked services arrow ");
		
		Thread.sleep(2000);
		
		//*[@class="sub-menu megamenu-item-inited open"]//*[@id="menu-item-1949"]
		WebElement ProcessautomationArrow =	driver.findElement(By.xpath("//*[@id='menu-item-1962']//*[@class='swm-mini-menu-arrow']"));
		
		ProcessautomationArrow.click();
		
		System.out.println("Clicked Process automation arrow ");
		Thread.sleep(2000);

	}
	
	catch(Exception e)
	{
		
	}

	
//	
	Processautomation.VerifyProcessautomation_nintexautomationpage();


//	Processautomation.verifyProcessautomation_nintexautomation_FormvalidationOnBlank();
//	Processautomation.verifyProcessautomation_nintexautomationForm();
//	Processautomation.VerifyProcessautomation_nintexautomationVldMsg();


	}

}



