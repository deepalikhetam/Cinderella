package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.AboutUs;
import corporatesite.Browser;

public class TC35VerifyAboutUsClickContactUs extends Browser
{
	@Test(priority = 35)


	public void verifyContactUs_TC20() throws Exception
	{
		AboutUs.ClickOnContact();

	}
}