package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.ContactUsPage;
//import corporatesite.pages.BaseClass;

public class TC03VerfiyContactUsForm extends Browser
{
	@Test(priority = 3)
	public void verifyContactUSForm_TC03() throws Exception
	{
		ContactUsPage.verfiyContactUsForm();
	}
}
