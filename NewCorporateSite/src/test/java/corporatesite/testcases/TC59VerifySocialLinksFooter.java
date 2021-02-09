package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.HeaderFooter;

public class TC59VerifySocialLinksFooter extends Browser {
	@Test(priority = 59)

  public void VerifySocialLinksFooter() throws Exception 
  {
	  HeaderFooter.SocialLinksFooter();
  }
}
