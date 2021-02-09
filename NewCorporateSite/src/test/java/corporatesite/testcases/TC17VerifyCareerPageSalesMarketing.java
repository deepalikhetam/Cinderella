package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.CareerPage;

public class TC17VerifyCareerPageSalesMarketing extends Browser
{
	@Test(priority = 17)
	public void verifyCareerPageSalesMarketing_TC17() throws Exception
	{
		CareerPage.verifyCareerPageSalesMarketing();
	}
}
