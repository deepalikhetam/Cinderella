package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.ContactUsPage;

public class TC05VerifyContactUsFieldVld extends Browser
{
	@Test(priority = 5)
	public void verifyContactUsFieldVld_TC05() throws Exception
	{
		ContactUsPage.verifyFieldVldMsg();
	}
}
