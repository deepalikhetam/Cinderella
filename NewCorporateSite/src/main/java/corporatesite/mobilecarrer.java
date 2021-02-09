package corporatesite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class mobilecarrer  extends Browser{

	
	

	static WebDriverWait wait = new WebDriverWait(driver, 50);
	public static void verifyCareerPage() throws Exception
	{
		
//		try{
		Thread.sleep(3000);
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(
	//			(By.id("//*[@id='menu-item-3388']/a/span"))));
	
		Thread.sleep(3000);
		WebElement careerpage = driver.findElement(By.xpath("//*[@id='menu-item-3388']/a/span"));
	
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", careerpage);

		
		System.out.println("Clicked on Career Menu");
		
		Thread.sleep(5000);
		String actualtile = driver.getTitle();
		System.out.println("Pagetitle: "+actualtile);
	
	

//		}
		
//		catch (Exception e){
//		}
//		
//		try{
//			WebElement careerpage = driver.findElement(By.xpath("//*[@id='menu-item-3388']"));
//
//			((JavascriptExecutor) driver).executeScript("arguments[0].click();", careerpage);
//
//			
//		}
//
//		
//		catch (Exception e){
//	}
	}
	
	public static void verifyCareerPageTechnicalPositions() throws Exception
	{
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

		//*[@id='swm-wrap']/div[4]/div[1]/div[1]/div[1]/div/div[1]/div/div/section[1]/div/div/div[2]/div/div/div/div/p/a
		
		
		driver.navigate().back();
		System.out.println("back");

		
	}
	public static void verifyCareerPageSalesMarketing() throws Exception
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
		
		Thread.sleep(3000);
		
		
		driver.navigate().back();

		//*[@id='swm-wrap']/div[4]/div[1]/div[1]/div[1]/div/div[1]/div/div/section[1]/div/div/div[2]/div/div/div/div/p/a
//		WebElement Backtopage=driver.findElement(By.xpath("	//*[@id='swm-wrap']/div[4]/div[1]/div[1]/div[1]/div/div[1]/div/div/section[1]/div/div/div[2]/div/div/div/div/p/a"));
//		if(Backtopage.isDisplayed()) 
//		{
//			System.out.println("Clicked on Backtopage");
//
//			Backtopage.click();
//			Thread.sleep(3000);
//		}
//		else{
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//*[@id='menu-item-3388']")).click();
//		System.out.println("Clicked on Career Menu");
//		}
	}
	public static void verifyCareerPageAcctFinance() throws Exception
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
		
	
		
		
		Thread.sleep(8000);

		//*[@id='swm-wrap']/div[4]/div[1]/div[1]/div[1]/div/div[1]/div/div/section[1]/div/div/div[2]/div/div/div/div/p/a
		WebElement Backtopage=driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span"));
		if(Backtopage.isDisplayed()) 
		{
			driver.navigate().back();
			System.out.println("Clicked on Backtopage");

		}
		else{
		Thread.sleep(10000);
		System.out.println("else");

		driver.findElement(By.xpath("//*[@id='menu-item-3388']")).click();
		System.out.println("Clicked on Career Menu");
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
