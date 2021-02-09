package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.HeaderFooter;

public class TC57VerifyLinkNamesUnderUsefulLinks extends Browser {
	@Test(priority = 57)

  public void VerifyLinkNamesUnderUsefulLinks () throws Exception
  {
	  HeaderFooter.UsefulLinks();
  }
}
