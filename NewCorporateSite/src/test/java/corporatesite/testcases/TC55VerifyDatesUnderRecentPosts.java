package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.HeaderFooter;

public class TC55VerifyDatesUnderRecentPosts extends Browser {
	@Test(priority = 55)

  public void VerifyDatesUnderRecentPosts() throws Exception 
  {
	  HeaderFooter.Dates();
  }
}
