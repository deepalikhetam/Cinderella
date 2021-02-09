package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.ServicePage;

public class TC27VerifyServiceEnterPriseBCFormVld extends Browser
{
	@Test(priority = 27)
	public void verifyServiceEnterPriseBCFormVld_TC27() throws Exception
	{
		ServicePage.verifyServiceEnterPriseBCFormVld();
	}
}