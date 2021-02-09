package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.HomePage;

public class TC09VerifyHomePageServices extends Browser
{
	@Test(priority = 9)
	public void verifyHomePageBestServices_TC09() throws Exception
	{
		HomePage.verifyHomePageBestServices();
	}
}
