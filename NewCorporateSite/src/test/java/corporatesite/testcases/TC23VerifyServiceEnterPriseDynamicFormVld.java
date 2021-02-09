package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.ServicePage;


public class TC23VerifyServiceEnterPriseDynamicFormVld extends Browser
{
	@Test(priority = 23)
	public void verifyServiceEnterPriseDynamicFormVld_TC23() throws Exception
	{
		ServicePage.verifyServiceEnterPriseDynamicFormVld();
	}
}
