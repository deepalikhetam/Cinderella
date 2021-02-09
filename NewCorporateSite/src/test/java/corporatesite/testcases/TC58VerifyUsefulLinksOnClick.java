package corporatesite.testcases;

import org.testng.annotations.Test;

import corporatesite.Browser;
import corporatesite.HeaderFooter;

public class TC58VerifyUsefulLinksOnClick extends Browser {
	@Test(priority = 58)

  public void VerifyUsefulLinksOnClick() throws Exception 
  {
	  HeaderFooter.UsefulLinksOnclick();
  }
}
