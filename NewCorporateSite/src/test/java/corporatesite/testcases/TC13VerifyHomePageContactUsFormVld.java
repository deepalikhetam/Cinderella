package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.HomePage;

public class TC13VerifyHomePageContactUsFormVld extends Browser
{
	@Test(priority = 13)
	public void verifyHomePageContactUsFormVld_TC13() throws Exception
	{
		HomePage.verifyHomePageContactUsFormVldMsg();
	}
}
