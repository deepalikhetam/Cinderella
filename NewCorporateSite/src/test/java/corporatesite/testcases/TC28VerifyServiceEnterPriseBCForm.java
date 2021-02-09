package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.ServicePage;

public class TC28VerifyServiceEnterPriseBCForm extends Browser
{
	@Test(priority = 28)
	public void verifyServiceEnterPriseBCForm_TC28() throws Exception
	{
		ServicePage.verifyServiceEnterPriseBCForm();
	}
}
