package corporatesite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CareerPage extends Browser
{
	static WebDriverWait wait = new WebDriverWait(driver, 50);
	public static void verifyCareerPage() throws Exception
	{
		
		Thread.sleep(5000);
		WebElement Navigation=driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span"));

		if(!Navigation.isDisplayed())
			{
			System.out.println("Navigation menu  does not displayed ");
			System.out.println("In web/Landsacpe ");
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id='menu-item-3388']")).click();
			System.out.println("Clicked on Career Menu");
			
			Thread.sleep(5000);
			String actualtile = driver.getTitle();
			System.out.println("Pagetitle: "+actualtile);
			}
		else
		{
			System.out.println("Navigation menu  does  displayed ");
			System.out.println("In mobile ");
			Thread.sleep(3000);
			WebElement careerpage = driver.findElement(By.xpath("//*[@id='menu-item-3388']/a/span"));
		
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", careerpage);

			
			System.out.println("Clicked on Career Menu");
			
			Thread.sleep(5000);
			String actualtile = driver.getTitle();
			System.out.println("Pagetitle: "+actualtile);
		}

	}
	public static void verifyCareerPageTechnicalPositions() throws Exception
	{
		Thread.sleep(5000);
		WebElement Navigation=driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span"));

		if(!Navigation.isDisplayed())
		{
		System.out.println("Navigation menu  does not displayed ");
		System.out.println("In web/Landsacpe ");
		Thread.sleep(10000);
		WebElement techpositions = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div[1]/div[1]/div/div[1]/div/div/section/div/div/div/div/div/div[3]/div/div/div[1]/div[1]/div/div/div[3]/h6/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",techpositions);
		
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.moveToElement(techpositions);
		
		Thread.sleep(10000);
		action.click().build().perform();
		System.out.println("Clicked on Technical Positions");
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='menu-item-3388']")).click();
		System.out.println("Clicked on Career Menu");
		}
		else
		{
			System.out.println("Navigation menu  does not displayed ");
			System.out.println("In web/Landsacpe ");
			Thread.sleep(10000);
			WebElement techpositions = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div[1]/div[1]/div/div[1]/div/div/section/div/div/div/div/div/div[3]/div/div/div[1]/div[1]/div/div/div[3]/h6/a"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",techpositions);
			
			Thread.sleep(5000);
			Actions action = new Actions(driver);
			action.moveToElement(techpositions);
			
			Thread.sleep(10000);
			action.click().build().perform();
			System.out.println("Clicked on Technical Positions");
			
			Thread.sleep(10000);
			driver.navigate().back();
			System.out.println("Clicked on back");
			
		}
	}
	public static void verifyCareerPageSalesMarketing() throws Exception
	{
		Thread.sleep(5000);
		WebElement Navigation=driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span"));

		if(!Navigation.isDisplayed())
		{
		Thread.sleep(10000);
		WebElement salesmarketing = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div[1]/div[1]/div/div[1]/div/div/section/div/div/div/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[3]/h6/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",salesmarketing);
		
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.moveToElement(salesmarketing);
		
		Thread.sleep(10000);
		action.click().build().perform();
		System.out.println("Clicked on Sales Marketing");
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='menu-item-3388']")).click();
		System.out.println("Clicked on Career Menu");
		
		}
		else
		{
			System.out.println("Navigation menu  does not displayed ");
			System.out.println("In mobile ");
			Thread.sleep(10000);
			WebElement salesmarketing = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div[1]/div[1]/div/div[1]/div/div/section/div/div/div/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[3]/h6/a"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",salesmarketing);
			
			Thread.sleep(5000);
			Actions action = new Actions(driver);
			action.moveToElement(salesmarketing);
			
			Thread.sleep(10000);
			action.click().build().perform();
			System.out.println("Clicked on  Sales Marketing");
			
			Thread.sleep(10000);
			driver.navigate().back();
			
		}
	}
	public static void verifyCareerPageAcctFinance() throws Exception
	{
		Thread.sleep(5000);
		WebElement Navigation=driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span"));

		if(!Navigation.isDisplayed())
		{
		Thread.sleep(10000);
		WebElement acctfinance = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div[1]/div[1]/div/div[1]/div/div/section/div/div/div/div/div/div[3]/div/div/div[1]/div[3]/div/div/div[3]/h6/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",acctfinance);
		
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.moveToElement(acctfinance);
		
		Thread.sleep(10000);
		action.click().build().perform();
		System.out.println("Clicked on Account Finance");
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='menu-item-3388']")).click();
		System.out.println("Clicked on Career Menu");
		}
		
		else
		{
			System.out.println("Navigation menu  does not displayed ");
			System.out.println("In mobile ");
			Thread.sleep(10000);
			WebElement acctfinance = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div[1]/div[1]/div/div[1]/div/div/section/div/div/div/div/div/div[3]/div/div/div[1]/div[3]/div/div/div[3]/h6/a"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",acctfinance);
			
			Thread.sleep(5000);
			Actions action = new Actions(driver);
			action.moveToElement(acctfinance);
			
			Thread.sleep(10000);
			action.click().build().perform();
			System.out.println("Clicked on  Sales Marketing");
			
			Thread.sleep(10000);
			driver.navigate().back();
			
		}
	}
	public static void verifyCareerPageHumanResource() throws Exception
	{
		Thread.sleep(10000);
		WebElement humanresource = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div[1]/div[1]/div/div[1]/div/div/section/div/div/div/div/div/div[3]/div/div/div[1]/div[4]/div/div/div[3]/h6/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",humanresource);
		
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.moveToElement(humanresource);
		
		Thread.sleep(10000);
		action.click().build().perform();
		System.out.println("Clicked on Human Finance");
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='menu-item-3388']")).click();
		System.out.println("Clicked on Career Menu");
	}
}
