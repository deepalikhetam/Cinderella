package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.ServicePage;

public class TC32VerfiyServiceEnterPriseServiceNow extends Browser
{
	@Test(priority = 32)
	public void verfiyServiceEnterPriseServiceNow_TC32() throws Exception
	{
		ServicePage.verifyServiceEnterPriseServiceNow();
	}
}
