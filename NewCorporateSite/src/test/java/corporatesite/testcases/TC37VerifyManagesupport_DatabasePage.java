package corporatesite.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.ManagedSupport;

public class TC37VerifyManagesupport_DatabasePage extends Browser {
	
	
	
	@Test(priority = 37)


	public void verifyManagesupport_DatabasePage_TC37() throws Exception
	{
		
		
		
	System.out.println("databse");
		

	try{
		
	
		driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span")).click();
		System.out.println("Clicked on Navigatin menu");

		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='menu-item-1948']/span")).click();
		System.out.println("Clicked services arrow ");
	}
	
	catch(Exception e)
	{
		
	}
	
	ManagedSupport.VerifyManagesupport_Databasepage();
		
//	ManagedSupport.verifyManagesuport_Database_FormvalidationOnBlank();
//	ManagedSupport.verfiyMnagesupport_DatabaseForm();
//	ManagedSupport.ManageSupport_DatabasetverifyFieldVldMsg();

	}

}
