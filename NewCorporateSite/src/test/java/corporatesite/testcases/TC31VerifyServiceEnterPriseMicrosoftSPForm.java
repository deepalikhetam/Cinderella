package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.ServicePage;

public class TC31VerifyServiceEnterPriseMicrosoftSPForm extends Browser
{
	@Test(priority = 31)
	public void verifyServiceEnterPriseMicrosoftSPForm_TC31() throws Exception
	{
		ServicePage.verifyServiceEnterPriseMicrosoftSPForm();
	}
}
