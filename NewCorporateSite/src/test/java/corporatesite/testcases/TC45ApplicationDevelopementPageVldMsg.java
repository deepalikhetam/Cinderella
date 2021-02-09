package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.ApplicationDevelopement;
import corporatesite.Browser;

public class TC45ApplicationDevelopementPageVldMsg  extends Browser{
	
	
	
	@Test(priority = 45)
	public void verifyverifyApplicationDevelopementfieldVldMsg45() throws Exception
	{
		ApplicationDevelopement.verifyApplicationDevelopemenVldMsg();

	}

}
