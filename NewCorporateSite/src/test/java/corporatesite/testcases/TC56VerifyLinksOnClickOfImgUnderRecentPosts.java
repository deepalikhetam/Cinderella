package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.HeaderFooter;

public class TC56VerifyLinksOnClickOfImgUnderRecentPosts extends Browser {
	@Test(priority = 56)

  public void VerifyLinksOnClickOfImgUnderRecentPosts() throws Exception
  {
	  HeaderFooter.ImageClick();
  }
}
