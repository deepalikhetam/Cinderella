package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.ServicePage;

public class TC33VerifyServiceEnterPriseServiceNowFormVld extends Browser
{
	@Test(priority = 33)
	public void verifyServiceEnterPriseServiceNowFormVld_TC33() throws Exception
	{
		ServicePage.verifyServiceEnterPriseServiceNowFormVld();
	}
}
