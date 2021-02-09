package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.HomePage;

public class TC14VerifyHomePageContactUsFormOnSubmit extends Browser
{
	@Test(priority = 14)
	public void verifyHomePageContactUsFormOnSubmit_TC14() throws Exception
	{
		HomePage.verifyHomePageContactUsForm();
	}
}
