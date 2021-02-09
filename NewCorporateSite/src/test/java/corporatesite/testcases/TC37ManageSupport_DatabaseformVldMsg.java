package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.ManagedSupport;

public class TC37ManageSupport_DatabaseformVldMsg {
	
	
	@Test(priority = 37)

	public void verifyManageSupport_DatabaseformVldMsg_TC37() throws Exception
	{
	
		
		
		ManagedSupport.verifyManagesuport_Database_FormvalidationOnBlank();
		
	}

}
