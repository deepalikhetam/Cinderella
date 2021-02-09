package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.CareerPage;

public class TC19VerifyCareerPageHumanResource extends Browser
{
	@Test(priority = 19)
	public void verifyCareerPageHumanResource_TC19() throws Exception
	{
		CareerPage.verifyCareerPageHumanResource();
	}

}
