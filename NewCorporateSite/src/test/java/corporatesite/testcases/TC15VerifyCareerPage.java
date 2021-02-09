package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.CareerPage;

public class TC15VerifyCareerPage extends Browser
{
	@Test(priority = 15)
	public void verifyCareerPage_TC15() throws Exception
	{
		CareerPage.verifyCareerPage();
	}
}
