package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.HomePage;

public class TC08VerfiyHomePageAboutCompanyReadMoreBtnOnClick extends Browser
{
	@Test(priority = 8)
	public void verfiyHomePageAboutCompanyReadMoreBtnOnClick_TC08() throws Exception
	{
		HomePage.verifyHomePageAbtCompyReadMorebtn();
	}
}
