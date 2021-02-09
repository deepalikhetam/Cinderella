package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.HomePage;

public class TC11VerifyHomePageCaseStudieDownloadFormVldMsg extends Browser
{
	@Test(priority = 11)
	public void verifyHomePageCaseStudieDownloadFormVldMsg_TC11() throws Exception
	{
		HomePage.verfiyhomepageCaseStudieDownloadVldMsg();
	}
}
