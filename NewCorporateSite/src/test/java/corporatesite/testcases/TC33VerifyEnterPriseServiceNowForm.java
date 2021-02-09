package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.ServicePage;

public class TC33VerifyEnterPriseServiceNowForm extends Browser
{
	@Test(priority = 32)
	public void verifyEnterPriseServiceNowForm_TC33() throws Exception
	{
		ServicePage.verifyServiceEnterPriseServiceNowForm();
	}
}
