package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.ServicePage;

public class TC26VerifyServiceEnterPriseBCVideo extends Browser
{
	@Test(priority = 26)
	public void verifyServiceEnterPriseBCVideo_TC26() throws Exception
	{
		ServicePage.verifyServiceEnterPriseBusinessCentralvideo();
	}
}
