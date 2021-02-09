package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.CareerPage;

public class TC18VerifyCareerPageAccountFinance extends Browser
{
	@Test(priority = 18)
	public void verifyCareerPageAccountFinance_TC18() throws Exception
	{
		CareerPage.verifyCareerPageAcctFinance();
	}
}
