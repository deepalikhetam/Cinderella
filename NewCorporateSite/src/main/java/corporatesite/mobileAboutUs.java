package corporatesite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mobileAboutUs extends Browser {
	
	
	static WebDriverWait wait = new WebDriverWait(driver, 50);
	
	
	
	
	public static void MobileverifyAboutUsPage() throws Exception
	{

		Thread.sleep(5000);
	

		Thread.sleep(5000);
		//*[@id='menu-item-1944']/a/span
		WebElement Aboutusmenu = driver.findElement(By.xpath("//*[@id='menu-item-1945']/a/span"));

		((JavascriptExecutor) driver).executeScript("arguments[0].click();", Aboutusmenu);


		

		Thread.sleep(5000);


		String actualtile = driver.getTitle();
		System.out.println("Pagetitle: "+actualtile);
		
		Thread.sleep(10000);
		System.out.println("Clicked on About Us Menu");


	}
	
	
	public  static void ClickOnMobileContact() throws Exception
	{
		Thread.sleep(10000);
		

		
		

		WebElement Contactus = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[1]/div[2]/div/div/div/div/section[2]/div/div/div/div/div/div[5]/div/div/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", Contactus);
		
		
	//	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",Contactus);


		System.out.println("Clicked on Contact US ");
		
		String actualtile = driver.getTitle();
		System.out.println("Pagetitle: "+actualtile);
		
		Thread.sleep(5000);

	}
	
	

	public  static void ClickOnMobileAboutCompany() throws Exception
	{
	
	//	driver.navigate().refresh();
		Thread.sleep(5000);
		
		

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='menu-item-1944']/a/span"))));
			//	driver.findElement(By.id("menu-item-3389")).click();
		System.out.println("wait");

		WebElement item = driver.findElement(By.xpath("//*[@id='menu-item-1944']/a/span"));
		System.out.println("item");
		Actions action =new Actions(driver);
		action.moveToElement(item).perform();
		System.out.println("perform");
		
		//ff 
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='menu-item-1945']/a")).click();
		System.out.println("Clicked on About Company SubMenu");
		
		String actualtile = driver.getTitle();
		System.out.println("Pagetitle: "+actualtile);

	}
	
	
	public  static void ClickMobileOnAboutCompany() throws Exception
	{
		Thread.sleep(3000);
		
	//	driver.navigate().refresh();
		Thread.sleep(5000);

		

		try{
			System.out.println("web");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='menu-item-1944']/a/span"))));
			//	driver.findElement(By.id("menu-item-3389")).click();
		System.out.println("wait");

		WebElement item = driver.findElement(By.xpath("//*[@id='menu-item-1944']/a/span"));
		System.out.println("item");
		Actions action =new Actions(driver);
		action.moveToElement(item).perform();
		System.out.println("perform");
		
		//ff 
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='menu-item-1945']/a")).click();
		System.out.println("Clicked on About Company SubMenu");
		
		String actualtile = driver.getTitle();
		System.out.println("Pagetitle: "+actualtile);
		System.out.println("Clicked on About Company SubMenu in web ");

		
		
		}
		catch(Exception e)
		{
			
		}
	
		
		
		try{
			System.out.println("In mobile ");

			WebElement AboutCompanySubMenu = driver.findElement(By.xpath("//*[@id='menu-item-1945']/a"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", AboutCompanySubMenu);
			System.out.println("Clicked on Navigatin menu");
			String actualtile = driver.getTitle();
			System.out.println("Pagetitle: "+actualtile);
			System.out.println("Clicked on About Company SubMenu in mobile ");

			
		}
		
		catch(Exception e)
		{
			
		}
		
		
		System.out.println("Clicked on About Company SubMenu in mobile ");

		
		
	}
	public  static void ClickOnCoreTeam() throws Exception
	{
	Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='menu-item-1944']/a/span"))));
			//	driver.findElement(By.id("menu-item-3389")).click();
		System.out.println("wait");

		WebElement item = driver.findElement(By.xpath("//*[@id='menu-item-1944']/a/span"));
		System.out.println("item");
		Actions action =new Actions(driver);
		action.moveToElement(item).perform();
		System.out.println("perform");
		
		//ff 
		
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='menu-item-1946']/a")).click();
		System.out.println("Clicked on Core Team  SubMenu");
		String actualtile = driver.getTitle();
		System.out.println("Pagetitle: "+actualtile);
	

	}
	

}
