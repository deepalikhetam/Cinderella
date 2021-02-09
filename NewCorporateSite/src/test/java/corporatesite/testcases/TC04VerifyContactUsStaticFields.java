package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.ContactUsPage;
//import corporatesite.pages.BaseClass;

public class TC04VerifyContactUsStaticFields extends Browser
{
	@Test(priority = 4)
	public void verifyContactUsStaticFields_TC04() throws Exception
	{
		ContactUsPage.verifyContactUsStaticFields();
	}
}
