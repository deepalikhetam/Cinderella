package corporatesite.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import corporatesite.Browser;

public class TC45ApplicationDevelopementPageFieldVld  extends Browser {
	
	
	

	@Test(priority = 45)
	public void verifyApplicationDevelopementfieldVldTC45() throws Exception
	{
	//	ApplicationDevelopement.verifyApplicationDevelopemenVldMsg();

		


		try{
				
				
				Thread.sleep(4000);
				WebElement header = driver.findElement(By.xpath("//*[@id='swm-outer-wrap']/div[1]/div/div/div/div[1]/div[2]"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", header);

				System.out.println("scroll to header");

				
		}
			
			catch(Exception e)
			{
				
			}
	}

}
