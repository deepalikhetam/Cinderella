package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.ServicePage;

public class TC38VerifyServiceEnterPriseBCFormVld extends Browser
{
	@Test(priority = 38)
	public void verifyServiceEnterPriseBCFormVld_TC27() throws Exception
	{
		ServicePage.verifyServiceEnterPriseBCFormVld();
	}
}
