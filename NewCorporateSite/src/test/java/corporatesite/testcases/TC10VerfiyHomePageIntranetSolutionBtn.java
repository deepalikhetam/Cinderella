package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.HomePage;

public class TC10VerfiyHomePageIntranetSolutionBtn extends Browser
{
	@Test(priority = 10)
	public void verfiyHomePageIntranetSolutionBtn_TC10() throws Exception
	{
		HomePage.verifyHomePageIntranetSolutions();
	}
}
