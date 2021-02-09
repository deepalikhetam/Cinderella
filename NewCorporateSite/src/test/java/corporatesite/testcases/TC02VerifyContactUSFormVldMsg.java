package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.ContactUsPage;
//import corporatesite.pages.BaseClass;

public class TC02VerifyContactUSFormVldMsg extends Browser
{
	@Test(priority = 2)
	public void verifyContactUSFormVldMsg_TC02() throws Exception
	{
		ContactUsPage.verifyContactUsFormvalidationOnBlank();
	}
}
