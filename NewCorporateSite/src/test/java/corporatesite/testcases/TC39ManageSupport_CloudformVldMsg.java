package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.ManagedSupport;





public class TC39ManageSupport_CloudformVldMsg extends Browser{
	@Test(priority = 39)


	public void verifyCloudformVldMsg_TC33() throws Exception
	{
	
		
		
		ManagedSupport.verifyManagesuport_Cloud_FormvalidationOnBlank();
		
	}
}