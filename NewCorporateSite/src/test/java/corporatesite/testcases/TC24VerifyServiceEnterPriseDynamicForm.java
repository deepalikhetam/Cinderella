package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.ServicePage;


public class TC24VerifyServiceEnterPriseDynamicForm extends Browser
{
	@Test(priority = 24)
	public void verifyServiceEnterPriseDynamicForm_TC24() throws Exception
	{
		ServicePage.verifyServiceEnterPriseDynamicForm();
	}
}
