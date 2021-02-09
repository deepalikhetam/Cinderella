package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.ServicePage;

public class TC30VerifyServiceEnterPriseMicrosoftSPFormVld extends Browser
{
	@Test(priority = 30)
	public void verifyServiceEnterPriseMicrosoftSPFormVld_TC30() throws Exception
	{
		ServicePage.verifyServiceEnterPriseMicrosoftSPFormVld();
	}

}
