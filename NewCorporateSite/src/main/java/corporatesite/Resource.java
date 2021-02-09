package corporatesite;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Resource extends Browser {
	
	static WebDriverWait wait = new WebDriverWait(driver, 50);
	
	
	
	public static void VerifyResource_BlogPage() throws Exception {
		
		WebElement Resourcearrow=driver.findElement(By.xpath("//*[@id='menu-item-3383']/span"));
		if(!Resourcearrow.isDisplayed())
		{
			Thread.sleep(3000);
			System.out.println("In web/ladsacpe ");

			wait.until(ExpectedConditions.elementToBeClickable(driver
					.findElement(By.xpath("//*[@id='menu-item-3383']/a/span"))));

			// driver.findElement(By.xpath("//*[@id='menu-item-3383']/a/span")).click();
			System.out.println("wait");

			WebElement item = driver.findElement(By
					.xpath("//*[@id='menu-item-3383']/a/span"));
			System.out.println("item");
			Actions action = new Actions(driver);
			action.moveToElement(item).perform();
			System.out.println("perform");
			Thread.sleep(7000);

			driver.findElement(By.id("menu-item-3384")).click();
			System.out.println("Clicked on Blog Page");

			String actualtile = driver.getTitle();
			System.out.println("Pagetitle: " + actualtile);

		}


	else {
			System.out.println("In mobile ");
			Thread.sleep(5000);

			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By
					.xpath("//*[@class='sub-menu open']//*[@id='menu-item-3385']"))));

			WebElement blog = driver
					.findElement(By
							.xpath("//*[@class='sub-menu open']//*[@id='menu-item-3384']"));
			Thread.sleep(3000);

			blog.click();

			// ((JavascriptExecutor)
			// driver).executeScript("arguments[0].click();", Bipage);
			System.out.println("Clicked on blog page in the mobile ");

			String actualtile = driver.getTitle();
			System.out.println("Pagetitle: " + actualtile);

		}

		
	}

	public  static void VerifyResource_WhitePagePage() throws Exception
	{
	
		WebElement Resourcearrow=driver.findElement(By.xpath("//*[@id='menu-item-3383']/span"));
		if(!Resourcearrow.isDisplayed())
		{
			Thread.sleep(3000);
			System.out.println("In web/ladsacpe ");

			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='menu-item-3383']/a/span"))));
			System.out.println("wait");
	
			WebElement item =driver.findElement(By.xpath("//*[@id='menu-item-3383']/a/span"));
			System.out.println("item");
			Thread.sleep(3000);

			item.click();
//			Actions action =new Actions(driver);
//			action.moveToElement(item).perform();
//			System.out.println("perform");
			Thread.sleep(4000);
	
			driver.findElement(By.id("menu-item-3386")).click();
			System.out.println("Clicked on White Paper Page");
			
			String actualtile = driver.getTitle();
			System.out.println("Pagetitle: "+actualtile);
		}
		
		

		else {
			System.out.println("In mobile ");
			Thread.sleep(5000);

			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@class='sub-menu open']//*[@id='menu-item-3386']"))));


			WebElement whitepage = driver.findElement(By.xpath("//*[@class='sub-menu open']//*[@id='menu-item-3386']"));
			//WebElement Bipage = driver.findElement(By.id("menu-item-3386"));

			Thread.sleep(3000);

			whitepage.click();
			
			//((JavascriptExecutor) driver).executeScript("arguments[0].click();", Bipage);
			System.out.println("Clicked on white page in the mobile ");

			String actualtile = driver.getTitle();
			System.out.println("Pagetitle: " + actualtile);

		}

		
	}
	
	public  static void VerifyResource_NewsRoomPage() throws Exception
	{
		
	
		WebElement Resourcearrow=driver.findElement(By.xpath("//*[@id='menu-item-3383']/span"));
		if(!Resourcearrow.isDisplayed())
			{
				System.out.println("resource arrow button does not  displayed");

				System.out.println("In web/ladsacpe ");

				driver.navigate().refresh();
				Thread.sleep(6000);
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='menu-item-3383']"))));

		
		//	driver.findElement(By.xpath("//*[@id='menu-item-3383']/a/span")).click();
				System.out.println("wait");

				WebElement item =driver.findElement(By.xpath("//*[@id='menu-item-3383']/a/span"));
				Thread.sleep(2000);

				item.click();
//				System.out.println("item");
//				Actions action =new Actions(driver);
//				action.moveToElement(item).perform();
//				System.out.println("perform");
				Thread.sleep(2000);
		
				
			//	Actions action =new Actions(driver);
//				action.moveToElement(item).perform();
//				System.out.println("perform");
				//*[@id="menu-item-3383"]/a/span/text()
				driver.findElement(By.id("menu-item-3385")).click();
				System.out.println("Clicked on News Room Page");
				
				String actualtile = driver.getTitle();
				System.out.println("Pagetitle: "+actualtile);
			}

		
		
		
			else {
				
				System.out.println("resource arrow button does   displayed");

				System.out.println("In mobile ");
				Thread.sleep(5000);
	
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@class='sub-menu open']//*[@id='menu-item-3385']"))));
	
	
				WebElement NewsPage = driver.findElement(By.xpath("//*[@class='sub-menu open']//*[@id='menu-item-3385']"));
				Thread.sleep(3000);
	
				NewsPage.click();
				
				//((JavascriptExecutor) driver).executeScript("arguments[0].click();", Bipage);
				System.out.println("Clicked on News room in the mobile ");
	
				String actualtile = driver.getTitle();
				System.out.println("Pagetitle: " + actualtile);

	
		
			}
		
	}

	
	
	public  static void VerifyResource_CaseStudyPage() throws Exception
	{
		
		
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='menu-item-3383']/a/span"))));

		
		//	driver.findElement(By.xpath("//*[@id='menu-item-3383']/a/span")).click();
		System.out.println("wait");

		WebElement item =driver.findElement(By.xpath("//*[@id='menu-item-3383']/a/span"));
		System.out.println("item");
		Actions action =new Actions(driver);
		action.moveToElement(item).perform();
		System.out.println("perform");
		Thread.sleep(5000);

		driver.findElement(By.id("menu-item-3448")).click();
		System.out.println("Clicked on case study Page");
		
		String actualtile = driver.getTitle();
		System.out.println("Pagetitle: "+actualtile);
	}
	
	
	
	public  static void VerifyResource_ClickLink() throws Exception
	{
	
		Thread.sleep(5000);
		WebElement Categary = driver.findElement(By.xpath("//*[@id='categories-3']/div/div/ul/li[21]/a"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Categary);
		Thread.sleep(3000);
	//	Categary.click();//n
		Thread.sleep(5000);
	//	driver.navigate().back();

		System.out.println("scroll to categary link");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='swm-item-entries']/article[3]/div/div[1]/div/div[2]/div/div[2]/div[1]/h2/a"))));

															//*[@id="swm-item-entries"]/article[3]/div/div[1]/div/div[2]/div/div[2]/div[1]/h2/a
		WebElement link = driver.findElement(By.xpath("//*[@id='swm-item-entries']/article[3]/div/div[1]/div/div[2]/div/div[2]/div[1]/h2/a"));
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link);
		Thread.sleep(3000);
//
		link.click();
	
		Thread.sleep(8000);

	}
	
	

	
	

	
	public  static void VerifyResource_WhitepaperClickonDownloadPaper() throws Exception
	{
		
		System.out.println("in side mthod");

	String root = driver.getWindowHandle();
	Thread.sleep(7000);
	
	System.out.println("root"+root);

	WebElement Downloadlink = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div[1]/div[1]/div/div[1]/div/div/section/div/div/div[1]/div/div/div[2]/div/div/a/span/span[2]"));
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", Downloadlink);
	//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Downloadlink);
	Thread.sleep(3000);
	Downloadlink.click();
	
	
	System.out.println("clicked ondown");

	Thread.sleep(3000);

	
	//driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[1]/div/div/div/div/div/section/div/div/div[2]/div/div/div[4]/div/div/div/p/a")).click();
	System.out.println("Downloadlink Opened");
	Thread.sleep(3000);
	Set<String> allwindows =driver.getWindowHandles();
	int counttab = allwindows.size();
	System.out.println("Total window: "+counttab);
	
	for(String child:allwindows)
	{
		if(!root.equalsIgnoreCase(child))
		{
			driver.switchTo().window(child);
			String childurl = driver.getCurrentUrl();
			System.out.println("Current URl: "+childurl);
			
			Thread.sleep(2000);
			driver.close();
		}
	}
	Thread.sleep(3000);
	driver.switchTo().window(root);
	String rooturl = driver.getCurrentUrl();
	System.out.println("Root URL: "+rooturl);
	System.out.println("Verfied root URL");

}
	
	
	
	
	public  static void VerifyResource_ClickOnNews() throws Exception
	{
		
	Thread.sleep(2000);

	String root = driver.getWindowHandle();
	Thread.sleep(5000);
	WebElement News = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div[1]/div[1]/div/div[1]/div/div/section/div/div/div/div/div/div[1]/div/div/div/h4/a"));
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", News);
	//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Downloadlink);
	Thread.sleep(3000);
	//News.click();
	Thread.sleep(3000);

	
	//driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[1]/div/div/div/div/div/section/div/div/div[2]/div/div/div[4]/div/div/div/p/a")).click();
	System.out.println("News Opened");
	Thread.sleep(3000);
	Set<String> allwindows =driver.getWindowHandles();
	int counttab = allwindows.size();
	System.out.println("Total window: "+counttab);
	
	for(String child:allwindows)
	{
		if(!root.equalsIgnoreCase(child))
		{
			driver.switchTo().window(child);
			String childurl = driver.getCurrentUrl();
			System.out.println("Current URl: "+childurl);
			
			Thread.sleep(2000);
			driver.close();
		}
	}
	Thread.sleep(3000);
	driver.switchTo().window(root);
	String rooturl = driver.getCurrentUrl();
	System.out.println("Root URL: "+rooturl);
	System.out.println("Verfied root URL");

}

	
	

	public  static void VerifyResource_ClickOnNewsImage() throws Exception
	{
		
	Thread.sleep(2000);

	String root = driver.getWindowHandle();
	Thread.sleep(5000);
	WebElement Newsimage = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div[1]/div[1]/div/div[1]/div/div/section/div/div/div/div/div/div[1]/div/div/figure/a/img"));
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", Newsimage);
	//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Downloadlink);
	Thread.sleep(3000);
	Newsimage.click();
	Thread.sleep(3000);

	
	//driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[1]/div/div/div/div/div/section/div/div/div[2]/div/div/div[4]/div/div/div/p/a")).click();
	System.out.println("News Opened");
	Thread.sleep(3000);
	Set<String> allwindows =driver.getWindowHandles();
	int counttab = allwindows.size();
	System.out.println("Total window: "+counttab);
	
	for(String child:allwindows)
	{
		if(!root.equalsIgnoreCase(child))
		{
			driver.switchTo().window(child);
			String childurl = driver.getCurrentUrl();
			System.out.println("Current URl: "+childurl);
			
			Thread.sleep(2000);
			driver.close();
		}
	}
	Thread.sleep(3000);
	driver.switchTo().window(root);
	String rooturl = driver.getCurrentUrl();
	System.out.println("Root URL: "+rooturl);
	System.out.println("Verfied root URL");

}
	
	public  static void VerifyResource_CaseStudyClickFinance() throws Exception
	{
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='Industry']/li[2]/a"))));

		
		//	driver.findElement(By.xpath("//*[@id='menu-item-3383']/a/span")).click();
		System.out.println("wait");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='Industry']/li[2]/a")).click();
		System.out.println("Clicked on case study Page");
		
		String actualtile = driver.getTitle();
		System.out.println("Pagetitle: "+actualtile);
	}
	public static void verfiyhomepageCaseStudieDownload() throws Exception
	{

		Thread.sleep(5000);
		WebElement casestudieDownload = driver.findElement(By.xpath("//*[@id='hrefUrl']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",casestudieDownload );
		//((JavascriptExecutor) driver).executeScript("arguments[0].click();", casestudieDownload);
		Thread.sleep(2000);

		WebElement finance = driver.findElement(By.xpath("//*[@id='CaseStudies']/div[1]/h3"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",finance );
		//((JavascriptExecutor) driver).executeScript("arguments[0].click();", casestudieDownload);

		wait.until(ExpectedConditions.elementToBeClickable(casestudieDownload));
		Thread.sleep(3000);
		casestudieDownload.click();
		Thread.sleep(2000);
		casestudieDownload.click();

		Thread.sleep(5000);
		WebElement  name = driver.findElement(By.xpath("//*[@id='your-name']"));
		name.sendKeys("Kalpesh");
		System.out.println("Name Entered");
		
		Thread.sleep(5000);
		WebElement email = driver.findElement(By.xpath("//*[@id='work-email-id']"));
		email.sendKeys("test01@ngenioussolutions.com");
		System.out.println("Email Entered");
		
		Thread.sleep(5000);
		WebElement number = driver.findElement(By.xpath("//*[@id='number']"));
		number.sendKeys("987456321");
		System.out.println("Number Entered");
		
		Thread.sleep(5000);
	//	alert.accept();
		System.out.println("Submit button clicked");
		
	}
	public static void verfiyhomepageCaseStudieDownloadVldMsg() throws Exception
	{
		Thread.sleep(5000);
		WebElement casestudieDownload = driver.findElement(By.xpath("//*[@id='hrefUrl']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",casestudieDownload );
		//((JavascriptExecutor) driver).executeScript("arguments[0].click();", casestudieDownload);
		Thread.sleep(2000);

		WebElement finance = driver.findElement(By.xpath("//*[@id='CaseStudies']/div[1]/h3"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",finance );
		//((JavascriptExecutor) driver).executeScript("arguments[0].click();", casestudieDownload);

		wait.until(ExpectedConditions.elementToBeClickable(casestudieDownload));
		Thread.sleep(3000);
		casestudieDownload.click();
		Thread.sleep(2000);
		casestudieDownload.click();

		Thread.sleep(5000);
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(5000);
//		alert.accept();
//		
		//driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div/div/div/section/div/div/div/div/div/div/div/div[2]/div/a")).click();;
		Thread.sleep(2000);

		WebElement Submit=driver.findElement(By.xpath("//*[@id='submitform']"));;
		Submit.click();
		System.out.println("Click on submit button");

		//*[@id="submitform"]
		Thread.sleep(5000);
		String  nameVldFld = driver.findElement(By.xpath("//*[@id='wpcf7-f4368-p162-o1']/form/div[2]/div/div/span/span/span")).getText();
														//*[@id="wpcf7-f4368-p162-o1"]/form/div[2]/div/div/span/span/span		
		System.out.println("Name field validation: "+nameVldFld);
		String expectednameVldFld = "The field is required.";
		Assert.assertEquals(nameVldFld, expectednameVldFld);
		System.out.println("Validated Name field");
		
		String emailIDVldFld = driver.findElement(By.xpath("//*[@id='wpcf7-f4368-p162-o1']/form/div[3]/div/div/span[1]/span/span")).getText();
		System.out.println("Email Field validation: "+emailIDVldFld);
		String expectedemailIDVldFld = "The field is required.";
		Assert.assertEquals(emailIDVldFld, expectedemailIDVldFld);
		System.out.println("Validated Email field");
		
		Thread.sleep(5000);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",Submit );

		String numberVldFld = driver.findElement(By.xpath("	//*[@id='wpcf7-f4368-p162-o1']/form/div[4]/div/div/span/span[2]")).getText();
		//*[@id="wpcf7-f4368-p162-o1"]/form/div[4]/div/div/span/span[2]
	//	String numberVldFld = driver.findElement(By.xpath("//*[@id='wpcf7-f4368-p162-o1']/form/div[4]/div/div/span/span[1]")).getText();

		System.out.println("Number Field validation: "+numberVldFld);
		String expectednumberIDVldFld = "The field is required.";
		Assert.assertEquals(numberVldFld, expectednumberIDVldFld);
		System.out.println("Validated Number field");
		
		//alert.dismiss();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		
	}
	public  static void VerifyResource_Postcomment() throws InterruptedException
	
	{
		Thread.sleep(5000);

		WebElement comment = driver.findElement(By.xpath("//*[@id='comment']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comment);
		WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
		email.sendKeys("test@ab.com4");
		
		
		WebElement author = driver.findElement(By.xpath("//*[@id='author']"));
		author.sendKeys("Testuser4");
		
		
		
		comment.sendKeys("test commen4");
		
		
		WebElement submit = driver.findElement(By.xpath("//*[@id='submit']"));
		submit.click();
		Thread.sleep(10000);

		//*[@id="submit"]
		WebElement Success = driver.findElement(By.xpath("//*[@class='comment-text']/p[2]"));
		Success.getText();
		System.out.println("Success"+Success.getText());

		//*[@id="comment-1518"]/div[1]/div/div[1]/div[2]/div[2]/p[2]/em
		Assert.assertEquals(Success.getText(), "Your comment is awaiting moderation.");

		
		
	}
	
	

public  static void VerifyResource_pagination() throws InterruptedException

{
	Thread.sleep(5000);
	
	//*[@id='swm-item-entries']/article[10]/div/div[1]/div/div[2]/div/div[2]/div[2]/a
	//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='menu-item-3383']/a/span"))));

	WebElement page1 = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div[1]/div[3]/div/a[1]"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",page1);
	
	Thread.sleep(5000);

	
	
	//*[@id="swm-item-entries"]/article[10]/div/div[1]/div/div[2]/div/div[2]/div[2]/a
//	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div[1]/div[3]/div/span[1]"))));

	WebElement Readmore = driver.findElement(By.xpath("//*[@id='swm-item-entries']/article[10]/div/div[1]/div/div[2]/div/div[2]/div[2]/a"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",Readmore);
	
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div[1]/div[3]/div/span[1]"))));

	
	System.out.println("Clicked page1 ");
	Thread.sleep(5000);
	page1.click();
	
	Thread.sleep(5000);
driver.navigate().back();
	
}
	
	public static void VerifyResource_BlogClickreadmore() throws InterruptedException
	{

		WebElement readmore = driver.findElement(By.xpath("//*[@id='swm-item-entries']/article[1]/div/div[1]/div/div[2]/div/div[2]/div[2]/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", readmore);
		Thread.sleep(5000);
		

		
		

		WebElement img = driver.findElement(By.xpath("//*[@id='swm-item-entries']/article[1]/div/div[1]/div/div[1]/div/figure/a/img"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", img);
		Thread.sleep(5000);
		
		
		
		readmore.click();

	
		System.out.println("Clicked raad more");
		Thread.sleep(8000);

		driver.navigate().back();
		
		System.out.println("Clicked back");

	
		Thread.sleep(10000);
	//	driver.findElement(By.xpath("//*[@id='search-3']/div/div/form/div/button/i"));
		//*[@id="search-3"]/div/div/form/div/button/i
	//	WebElement search =driver.findElement(By.xpath("//*[@id='search-3']/div/div/form/div/button/i"));
//		wait.until(ExpectedConditions.elementToBeClickable(img));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='swm-item-entries']/article[1]/div/div[1]/div/div[1]/div/figure/a/img"))));

		WebElement img1 = driver.findElement(By.xpath("//*[@id='swm-item-entries']/article[1]/div/div[1]/div/div[1]/div/figure/a/img"));

		Thread.sleep(5000);

		img1.click();
		System.out.println("Clicked image ");
		
		driver.navigate().back();
		
		System.out.println("Clicked back");


//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", search);
//		Thread.sleep(6000);
//		wait.until(ExpectedConditions.elementToBeClickable(img));
//
//		
//		img.click();
//		
//		img.click();
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", readmore);
//		Thread.sleep(5000);
//															//*[@id="swm-item-entries"]/article[3]/div/div[1]/div/div[2]/div/div[2]/div[1]/h2/a


	
	

	}
	
	
//	public void testValidation() {
//		
//		//  click("input[type='submit']")
//
//		WebElement comment = driver.findElement(By.xpath("//*[@id='comment']"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comment);
//	
//		WebElement submit = driver.findElement(By.xpath("//*[@id='submit']"));
//		submit.click();
//		((Object) submit).validateTextPresent("Fields are required")
//		  .setText("input[type='first_name']", "first name")
//		  .click("input[type='submit']")
//		  .validateTextPresent("Fields are required") ;// still can't continue
//		  // ... (do that for every field)
//		}
	
	
	public static void VerifyResource_Blogsearch() throws InterruptedException
	
	{
		Thread.sleep(6000);
			
		//*[@id='search-3']/div/div/form/div/input
		//*[@id="swm-sub-header"]/div/div/div[1]/h1/span
		WebElement imgblg =driver.findElement(By.xpath("//*[@id='swm-sub-header']/div/div/div[1]/h1/span"));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", imgblg);
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", img);
		Thread.sleep(6000);
	
		
		
		WebElement seacrhbox =driver.findElement(By.xpath("	//*[@id='search-3']/div/div/form/div/input"));

		
		seacrhbox.sendKeys("microsoft");
		
		Thread.sleep(6000);

		WebElement clicksearch =driver.findElement(By.xpath("//*[@id='search-3']/div/div/form/div/button/i"));
		clicksearch.click();
		Thread.sleep(6000);

		driver.navigate().back();

	}
	

}