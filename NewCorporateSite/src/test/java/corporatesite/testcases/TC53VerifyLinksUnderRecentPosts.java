package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.HeaderFooter;

public class TC53VerifyLinksUnderRecentPosts extends Browser {
	@Test(priority = 53)

  public void VerifyLinksUnderRecentPosts() throws Exception
  {
	  HeaderFooter.RecentPostLinks();
  }
}
