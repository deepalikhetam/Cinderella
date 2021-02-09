package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.ApplicationDevelopement;
import corporatesite.Browser;

public class TC47ApplicationDevelopementMigrationPage extends Browser
{
	
	
	@Test(priority = 46)
	public void verifyMigrationPage_TC01() throws Exception
	{
		ApplicationDevelopement.SPMigrationtpage();
	
	}
}
