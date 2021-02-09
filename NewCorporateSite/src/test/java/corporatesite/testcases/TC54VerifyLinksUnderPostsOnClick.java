package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.HeaderFooter;

public class TC54VerifyLinksUnderPostsOnClick extends Browser {
	@Test(priority = 54)

  public void VerifyLinksUnderPostsOnClick() throws Exception
  {
	  HeaderFooter.LinksClick();
	  
  }
}
