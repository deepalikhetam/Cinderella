package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.ServicePage;


public class TC22VerifyServiceEnterPriseDynamicVideo extends Browser
{
	@Test(priority = 22)
	public void verifyServiceEnterPriseDynamicVideo_TC22() throws Exception
	{
		ServicePage.verifyServiceEnterPriseDynamicvideo();
	}
}
