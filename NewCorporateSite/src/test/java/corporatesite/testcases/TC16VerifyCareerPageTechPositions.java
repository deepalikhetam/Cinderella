package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.CareerPage;

public class TC16VerifyCareerPageTechPositions extends Browser
{
	@Test(priority = 16)
	public void verifyCareerPageTechPositions_TC16() throws Exception
	{
		CareerPage.verifyCareerPageTechnicalPositions();
	}
}
