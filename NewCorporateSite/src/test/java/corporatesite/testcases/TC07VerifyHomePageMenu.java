package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.HomePage;

public class TC07VerifyHomePageMenu extends Browser
{
	@Test(priority = 7)
	public void verifyHomePageMenu_TC07() throws Exception
	{
		HomePage.verfiyMenus();
	}
}
