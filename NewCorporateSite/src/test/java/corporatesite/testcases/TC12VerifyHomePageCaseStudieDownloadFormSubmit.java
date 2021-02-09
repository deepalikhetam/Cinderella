package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.HomePage;

public class TC12VerifyHomePageCaseStudieDownloadFormSubmit extends Browser
{
	@Test(priority = 12)
	public void verifyHomePageCaseStudieDownloadFormSubmit_TC12() throws Exception
	{
		HomePage.verfiyhomepageCaseStudieDownload();
	}
}
