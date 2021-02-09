package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.Businessintelligence;

public class TC36VerifybusinessintelligenceFieldVld extends Browser {
	
	@Test(priority = 36)
	public void verifyVerifybusinessintelligencFieldVld_TC05() throws Exception
	{
		Businessintelligence.businessintelligenceverifyFieldVldMsg();
	}

}
