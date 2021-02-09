package corporatesite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SolutionPage extends Browser
{
	static WebDriverWait wait = new WebDriverWait(driver, 50);
	public static void verifySolutionPageIntranetSolution() throws Exception
	{
		WebElement solutionArrow=driver.findElement(By.xpath("//*[@id='menu-item-3381']/span"));

		if(!solutionArrow.isDisplayed())
			
		{
			System.out.println("Solution arrow does  not displayed");
			System.out.println("In web/Portrait ");
			Thread.sleep(10000);
			WebElement solution = driver.findElement(By.xpath("//*[@id='menu-item-3381']/a/span"));
			Actions action = new Actions(driver);
			action.moveToElement(solution);
			System.out.println("Moved the Menu Solutions");
			
			Thread.sleep(10000);
			WebElement intranetSolutions = driver.findElement(By.xpath("//*[@id='menu-item-3382']/a/span"));
			action.moveToElement(intranetSolutions);
			action.click().build().perform();
			System.out.println("Clicked on Intranet Solutions");
			
			Thread.sleep(5000);
			String actualtile = driver.getTitle();
			System.out.println("Pagetitle: "+actualtile);
			String expectedTitle = "SharePoint Intranet solution - 365appz";
			Assert.assertEquals(actualtile, expectedTitle);
			Thread.sleep(10000);
			
			driver.navigate().to("https://nsi.ngenioussolutions.com/");
		}
		
		else
		{
				System.out.println("Solution arrow does  displayed");

				System.out.println("In mobile ");

				WebElement Databasepagemobile = driver.findElement(By
						.xpath("//*[@id='menu-item-3382']/a/span"));
				((JavascriptExecutor) driver).executeScript(
						"arguments[0].click();", Databasepagemobile);
			
				System.out.println("Clicked on Intranet Solutions in the mobile");

				Thread.sleep(5000);
				String actualtile = driver.getTitle();
				System.out.println("Pagetitle: "+actualtile);
				String expectedTitle = "SharePoint Intranet solution - 365appz";
				Assert.assertEquals(actualtile, expectedTitle);
				Thread.sleep(10000);
				
				driver.navigate().to("https://nsi.ngenioussolutions.com/");
				
				
				
	

		}
	}
}
