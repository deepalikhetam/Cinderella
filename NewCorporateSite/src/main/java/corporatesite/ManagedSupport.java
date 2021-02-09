package corporatesite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class ManagedSupport extends Browser
{
	static WebDriverWait wait = new WebDriverWait(driver, 50);

	
	public static void VerifyManagesupportPage() throws Exception {
		Thread.sleep(3000);

		WebElement Servicearrow=driver.findElement(By.xpath("//*[@id='menu-item-1948']/span"));
		if(!Servicearrow.isDisplayed())
			
		{
			// add to try for mobile
			System.out.println("Service arrow button does not displayed");
			System.out.println("In web/landscape ");
			wait.until(ExpectedConditions.elementToBeClickable(driver
					.findElement(By.id("menu-item-1948"))));
			// driver.findElement(By.id("menu-item-3389")).click();
			System.out.println("wait");

			WebElement item = driver.findElement(By.id("menu-item-1948"));
			System.out.println("item");
			Thread.sleep(3000);

			item.click();
			System.out.println("Clicked on  service ");
			
//			Actions action = new Actions(driver);
//			action.moveToElement(item).perform();
//			System.out.println("perform");
			Thread.sleep(3000);

			driver.findElement(
					By.xpath("//*[@id='menu-item-3375']/span/a/span")).click();
			System.out.println("Clicked on Manage support Page");

			String actualtile = driver.getTitle();
			System.out.println("Pagetitle: " + actualtile);

		}

	
		else {
			System.out.println("In mobile ");

			WebElement Bipage = driver.findElement(By
					.xpath("//*[@id='menu-item-3375']/span/a/span"));
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].click();", Bipage);
			System.out.println("Clicked on Manage support in mobile ");

			String actualtile = driver.getTitle();
			System.out.println("Pagetitle: " + actualtile);

		}

	

	}

	public  static void VerifyManagesupport_ShareppointPage() throws Exception
	{
		WebElement Servicearrow=driver.findElement(By.xpath("//*[@id='menu-item-1948']/span"));
		if(!Servicearrow.isDisplayed())
			
		{
			System.out.println("Service arrow button does not displayed");
			System.out.println("In web/landscape ");

		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("menu-item-1948"))));
			//	driver.findElement(By.id("menu-item-3389")).click();
		System.out.println("wait");

		WebElement item =driver.findElement(By.id("menu-item-1948"));
		System.out.println("item");
		Thread.sleep(2000);
		item.click();
		System.out.println("Clicked on  service ");

		
//		Actions action =new Actions(driver);
//		action.moveToElement(item).perform();
//		System.out.println("perform");
		Thread.sleep(2000);

		driver.findElement(By.id("menu-item-3376")).click();
		System.out.println("Clicked on Manage support sharepoint Page");
		
		String actualtile = driver.getTitle();
		System.out.println("Pagetitle: "+actualtile);
		}
		
	
		
		else {
			
			System.out.println("Service arrow button does  displayed");

			System.out.println("In mobile ");

			WebElement Databasepagemobile = driver.findElement(By
					.xpath("//*[@id='menu-item-3376']/a/span"));
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].click();", Databasepagemobile);
			System.out.println("Clicked on Manage support sharepoint in mobile ");

			String actualtile = driver.getTitle();
			System.out.println("Pagetitle: " + actualtile);
///a/span
		}

	

		
	}

	
	public  static void VerifyManagesupport_Cloudpage() throws Exception
	{
		WebElement Servicearrow=driver.findElement(By.xpath("//*[@id='menu-item-1948']/span"));
		if(!Servicearrow.isDisplayed())
			
		{
			System.out.println("Service arrow button does not displayed");
			System.out.println("In web/landscape ");

		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("menu-item-1948"))));
			//	driver.findElement(By.id("menu-item-3389")).click();
		System.out.println("wait");

		WebElement item =driver.findElement(By.id("menu-item-1948"));
	
		System.out.println("item");
		item.click();
		System.out.println("Clicked on Service ");

//		Actions action =new Actions(driver);
//		action.moveToElement(item).perform();
//		System.out.println("perform");
		Thread.sleep(3000);

		driver.findElement(By.id("menu-item-3377")).click();
		System.out.println("Clicked on Manage support cloud Page");
		
		String actualtile = driver.getTitle();
		System.out.println("Pagetitle: "+actualtile);
		}
		
		
		
		
		else {
			System.out.println("In mobile ");

			WebElement Databasepagemobile = driver.findElement(By
					.xpath("//*[@id='menu-item-3377']/a/span"));
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].click();", Databasepagemobile);
			System.out.println("Clicked on Manage support Database in mobile ");

			String actualtile = driver.getTitle();
			System.out.println("Pagetitle: " + actualtile);

		}

	
	}

	
	public static void VerifyManagesupport_Databasepage() throws Exception 
	{

		WebElement Servicearrow=driver.findElement(By.xpath("//*[@id='menu-item-1948']/span"));
		if(!Servicearrow.isDisplayed())
			
		{
			System.out.println("Service arrow button does not displayed");
			System.out.println("In web/landscape ");

			wait.until(ExpectedConditions.elementToBeClickable(driver
					.findElement(By.id("menu-item-1948"))));
			// driver.findElement(By.id("menu-item-3389")).click();
			System.out.println("wait");

			WebElement item = driver.findElement(By.id("menu-item-1948"));
			System.out.println("item");
			item.click();
			System.out.println("Clicked on Service");

			
//			Actions action = new Actions(driver);
//			action.moveToElement(item).perform();
//			System.out.println("perform");
			Thread.sleep(3000);

			driver.findElement(By.id("menu-item-3378")).click();
			System.out.println("Clicked on Manage support database Page");

			String actualtile = driver.getTitle();
			System.out.println("Pagetitle: " + actualtile);

		}

		

		else 
		{
			System.out.println("In mobile ");

			WebElement Databasepagemobile = driver.findElement(By
					.xpath("//*[@id='menu-item-3378']/a/span"));
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].click();", Databasepagemobile);
			System.out.println("Clicked on Manage support Database in mobile ");

			String actualtile = driver.getTitle();
			System.out.println("Pagetitle: " + actualtile);

		}

	
	}


//	public static void BusinessigencentelliPage() throws Exception 
//	{
//		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id="menu-item-1966"]/span/a/span"))));
//		driver.findElement(By.id("//*[@id='menu-item-1966']/span/a/span")).click();
//		System.out.println("Clicked on Contact Us Page");
//		
//		Thread.sleep(3000);
//		String actualtile = driver.getTitle();
//		System.out.println("Pagetitle: "+actualtile);
//		
//		String expectedtitle = "NGenious Solutions Contact details USA , New York, New Jersey , INDIA, MUMBAI | SharePoint Consultants | Office 365 consultants | SharePoint Experts - NGenious Solutions";
//		Assert.assertEquals(actualtile, expectedtitle);
//		Thread.sleep(3000);
//	}
	public static void verifyManagesuport_Sharepoint_FormvalidationOnBlank() throws Exception
	{
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		WebElement name = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3563-o1']/form/div[2]/div[1]/div/div/span/span/input"));
		
																			//*[@id="wpcf7-f3861-p3563-o1"]/form/div[2]/div[1]/div/div/span/span/input
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);
		
		
		
		WebElement emailString = driver.findElement(By.xpath("//*[@id='work-email-id']"));
		WebElement number = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3563-o1']/form/div[2]/div[3]/div/div/span/span[2]/input"));
		WebElement company = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3563-o1']/form/div[2]/div[4]/div/div/span/span/input"));
	//	WebElement interestat = driver.findElement(By.xpath("//*[@id='Interested']"));
		
		WebElement comment = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3563-o1']/form/div[2]/div[5]/div/div/span/span/textarea"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comment);
		
		if(name.isDisplayed() && emailString.isDisplayed() && number.isDisplayed() && company.isDisplayed()  && comment.isDisplayed())
		{
			WebElement submit = driver.findElement(By.xpath("//*[@id='btnSubmit']"));
			Thread.sleep(3000);
			submit.click();
			System.out.println("Submit Clicked");
			
			Thread.sleep(5000);
			name = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3563-o1']/form/div[2]/div[1]/div/div/span/span/input"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);
			
			Thread.sleep(4000);
			String actualVldMsgName = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3563-o1']/form/div[2]/div[1]/div/div/span/span/span/span")).getText();
			System.out.println("NameActualMessage: "+actualVldMsgName);
			String expectedVldMsgName = "The field is required.";
			Assert.assertEquals(actualVldMsgName, expectedVldMsgName);
			System.out.println("verified validation for name ");
			
			Thread.sleep(3000);
			String actualVldMsgEmail = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3563-o1']/form/div[2]/div[2]/div/div/span[1]/span/span/span")).getText();
			System.out.println("emailActualMessage: "+actualVldMsgName);
			String expectedVldMsgEmail = "The field is required.";
			Assert.assertEquals(actualVldMsgEmail, expectedVldMsgEmail);
			System.out.println("verified validation for email ");
			
			Thread.sleep(3000);
			String actualVldMsgNumber = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3563-o1']/form/div[2]/div[3]/div/div/span/span[2]/span/span")).getText();
			System.out.println("NumberActualMessage: "+actualVldMsgName);
			String expectedVldMsgNumber = "The field is required.";
			Assert.assertEquals(actualVldMsgNumber, expectedVldMsgNumber);
			System.out.println("verified validation for number ");
			
			
			Thread.sleep(3000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comment);
			String actualVldMsgComments = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3563-o1']/form/div[2]/div[5]/div/div/span/span/span/span")).getText();
			System.out.println("commentsActualMessage: "+actualVldMsgName);
			String expectedVldMsgComments = "The field is required.";
			Assert.assertEquals(actualVldMsgComments, expectedVldMsgComments);
			System.out.println("verified validation for comments ");
//			
			Thread.sleep(3000);
			String actualVldMsgInterest = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3563-o1']/form/div[2]/div[4]/div/div/span/span/span/span")).getText();
			System.out.println("CompanytActualMessage: "+actualVldMsgName);
			String expectedVldMsgInterest = "The field is required.";
			Assert.assertEquals(actualVldMsgInterest, expectedVldMsgInterest);
			System.out.println("verified validation for company ");
//			
			
//			
//			Thread.sleep(3000);
//			String actualVldMsg = driver.findElement(By.xpath("//*[@id='wpcf7-f3627-p433-o1']/form/div[9]")).getText();
//			System.out.println("Name: "+actualVldMsgName);
//			String expectedVldMsg = "One or more fields have an error. Please check and try again.";
//			Assert.assertEquals(actualVldMsg, expectedVldMsg);
//			System.out.println("verified validation for overall ");
//			
//			driver.navigate().refresh();
//			System.out.println("Refreshed the contact US page");
		}
		else
		{
			System.out.println("If loop not entered");
		}
	}
	public static void verfiyMnagesupport_SharepointForm() throws Exception
	{
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		WebElement name = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3563-o1']/form/div[2]/div[1]/div/div/span/span/input"));		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);
		Thread.sleep(2000);
		name.sendKeys("Test One demo");
		
		WebElement emailString = driver.findElement(By.xpath("//*[@id='work-email-id']"));
		Thread.sleep(2000);
		emailString.sendKeys("test01@ngenioussolutions.com");
		
		WebElement number = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3563-o1']/form/div[2]/div[3]/div/div/span/span[2]/input"));		Thread.sleep(2000);
		number.sendKeys("987456320");
		
		WebElement company = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3563-o1']/form/div[2]/div[4]/div/div/span/span/input"));
		Thread.sleep(2000);
		company.sendKeys("NSPL Pvt. Ltd.");
		
//		WebElement interestat = driver.findElement(By.xpath("//*[@id='Interested']"));
//		Thread.sleep(2000);
//		Select s =new Select(interestat);
//		s.selectByIndex(1);

		

		WebElement comment = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3563-o1']/form/div[2]/div[5]/div/div/span/span/textarea"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comment);
		Thread.sleep(2000);
		comment.sendKeys("Values entered in comments Values entered in comments");
		
	/*	driver.switchTo().frame(0);
		System.out.println("Switched to Iframe");
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='recaptcha-anchor']/div[1]"))).click();
		System.out.println("checkbox checked");
		
		driver.switchTo().defaultContent();
		System.out.println("Sustem switch back to default content");  
		
		Thread.sleep(20000);  */
		//*[@id="wpcf7-f3861-p3275-o1"]/form/div[3]
		//*[@id="wpcf7-f3861-p3275-o1"]/form/div[3]
		WebElement submit = driver.findElement(By.xpath("//*[@id='btnSubmit']"));
		Thread.sleep(3000);
		
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", submit);
		System.out.println("Submit Clicked");
		
		
		Thread.sleep(20000);
		
		String actualsucessmsg = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3563-o1']/form/div[3]")).getText();
		//*[@id="wpcf7-f3861-p3563-o1"]/form/div[3]
		//String actualsucessmsg = driver.findElement(By.xpath("//*[@id='wpcf7-f3627-p433-o1']/form/div[9]")).getText();
		System.out.println("Success Msg: "+actualsucessmsg);
		String expectedsuccessmsg = "Thank you for your message. It has been sent.";
		Assert.assertEquals(actualsucessmsg, expectedsuccessmsg);
		System.out.println("Verified the success msg");
	}

	
	public static void ManageSupport_SharepointverifyFieldVldMsg() throws Exception
	{Thread.sleep(2000);
	driver.navigate().refresh();

	Thread.sleep(5000);
	//WebElement name = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3563-o1']/form/div[2]/div[1]/div/div/span/span/input"));		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);

	WebElement name = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3563-o1']/form/div[2]/div[1]/div/div/span/span/input"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);
	Thread.sleep(2000);
	name.sendKeys("Google will check the clicking position on the checkbox Bots click exactly on the center of the checkbox");

	WebElement emailString = driver.findElement(By.xpath("//*[@id='work-email-id']"));
	Thread.sleep(2000);
	emailString.sendKeys("Google will check the clicking position on the checkbox Bots click exactly on the center of the checkbox");

	Thread.sleep(4000);

	//*[@id="wpcf7-f3861-p3563-o1"]/form/div[2]/div[3]/div/div/span/span[2]/input
	WebElement number = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3563-o1']/form/div[2]/div[3]/div/div/span/span[2]/input"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", number);
	Thread.sleep(2000);
	number.sendKeys("9874563210987456");
	//*[@id="wpcf7-f3861-p3563-o1"]/form/div[2]/div[4]/div/div/span/span/input
	WebElement company = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3563-o1']/form/div[2]/div[4]/div/div/span/span/input"));
	Thread.sleep(2000);
	company.sendKeys("ASDFghjkl");

	WebElement comment = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3563-o1']/form/div[2]/div[5]/div/div/span/span/textarea"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comment);
	Thread.sleep(2000);
	comment.sendKeys("Google will check the clicking position on the checkbox. Bots click exactly on the center of the checkbox while humans click somewhere on the box. This will help to decide Google whether the user is a human or bot.Google will check the clicking position on the checkbox. Bots click exactly on the center of the checkbox while humans click somewhere on the box. This will help to decide Google whether the user is a human or bot. This will help to decide Google whether the user is a human or bot.This will");

	Thread.sleep(4000);
	WebElement submit = driver.findElement(By.xpath("//*[@id='btnSubmit']"));
	Thread.sleep(3000);

	((JavascriptExecutor) driver).executeScript("arguments[0].click();", submit);
	System.out.println("Submit Clicked");


	Thread.sleep(15000);
	 name = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3563-o1']/form/div[2]/div[1]/div/div/span/span/input"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);
	System.out.println("name");

	Thread.sleep(3000);

																//*[@id="wpcf7-f3861-p3563-o1"]/form/div[2]/div[2]/div/div/span[1]/span/span/span
	String actualemailVld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3563-o1']/form/div[2]/div[2]/div/div/span[1]/span/span/span")).getText();
															//*[@id="wpcf7-f3861-p3275-o1"]/form/div[2]/div[2]/div/div/span[1]/span/span
															//*[@id="wpcf7-f3861-p3275-o1"]/form/div[2]/div[2]/div/div/span[1]/span/span/span
															//*[@id="wpcf7-f3861-p3275-o1"]/form/div[2]/div[2]/div/div/span[1]/span/span[2]/span

	String expectedemailVld = "The e-mail address entered is invalid.";
	Assert.assertEquals(actualemailVld, expectedemailVld);
	System.out.println("validated the Email validation msg");
	//
	Thread.sleep(4000);

	//*[@id="wpcf7-f3861-p3563-o1"]/form/div[2]/div[3]/div/div/span/span[2]/span/span
	String actualNumberVld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3563-o1']/form/div[2]/div[3]/div/div/span/span[2]/span/span")).getText();


														//*[@id="wpcf7-f3861-p3275-o1"]/form/div[2]/div[3]/div/div/span/span[2]/span/span
	String expectedNumberVld = "The number is larger than the maximum allowed.";
	Assert.assertEquals(actualNumberVld,expectedNumberVld);
	System.out.println("validated the Number validation msg");

	Thread.sleep(5000);
		
		Thread.sleep(5000);
//		String actualCompanyVld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3563-o1']/form/div[2]/div[4]/div/div/span/span/span/span")).getText();
//	
//																//*[@id="wpcf7-f3861-p3275-o1"]/form/div[2]/div[4]/div/div/span/span/span/span
//		String expectedCompanyVld = "The field is too short.";
//		Assert.assertEquals(actualCompanyVld,expectedCompanyVld);
	}

	
	//////----------------Cloud--------------//////////
	public static void verifyManagesuport_Cloud_FormvalidationOnBlank() throws Exception
	{

		Thread.sleep(2000);
		driver.navigate().refresh();
		WebElement name = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3621-o1']/form/div[2]/div[1]/div/div/span/span/input"));
		
																			//*[@id="wpcf7-f3861-p3563-o1"]/form/div[2]/div[1]/div/div/span/span/input
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);
		
		
		
		WebElement emailString = driver.findElement(By.xpath("//*[@id='work-email-id']"));
		WebElement number = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3621-o1']/form/div[2]/div[3]/div/div/span/span[2]/input"));
		WebElement company = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3621-o1']/form/div[2]/div[4]/div/div/span/span/input"));
	//	WebElement interestat = driver.findElement(By.xpath("//*[@id='Interested']"));
		
		WebElement comment = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3621-o1']/form/div[2]/div[5]/div/div/span/span/textarea"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comment);
		
		if(name.isDisplayed() && emailString.isDisplayed() && number.isDisplayed() && company.isDisplayed()  && comment.isDisplayed())
		{
			WebElement submit = driver.findElement(By.xpath("//*[@id='btnSubmit']"));
			Thread.sleep(3000);
			submit.click();
			System.out.println("Submit Clicked");
			
			Thread.sleep(5000);
			name = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3621-o1']/form/div[2]/div[1]/div/div/span/span/input"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);
			
			Thread.sleep(4000);
			String actualVldMsgName = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3621-o1']/form/div[2]/div[1]/div/div/span/span/span/span")).getText();
			System.out.println("NameActualMessage: "+actualVldMsgName);
			String expectedVldMsgName = "The field is required.";
			Assert.assertEquals(actualVldMsgName, expectedVldMsgName);
			System.out.println("verified validation for name ");
			
			Thread.sleep(3000);
			String actualVldMsgEmail = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3621-o1']/form/div[2]/div[2]/div/div/span[1]/span/span/span")).getText();
			System.out.println("emailActualMessage: "+actualVldMsgName);
			String expectedVldMsgEmail = "The field is required.";
			Assert.assertEquals(actualVldMsgEmail, expectedVldMsgEmail);
			System.out.println("verified validation for email ");
			
			Thread.sleep(3000);
			String actualVldMsgNumber = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3621-o1']/form/div[2]/div[3]/div/div/span/span[2]/span/span")).getText();
			System.out.println("NumberActualMessage: "+actualVldMsgName);
			String expectedVldMsgNumber = "The field is required.";
			Assert.assertEquals(actualVldMsgNumber, expectedVldMsgNumber);
			System.out.println("verified validation for number ");
			
			
			Thread.sleep(3000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comment);
			String actualVldMsgComments = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3621-o1']/form/div[2]/div[5]/div/div/span/span/span/span")).getText();
			System.out.println("commentsActualMessage: "+actualVldMsgName);
			String expectedVldMsgComments = "The field is required.";
			Assert.assertEquals(actualVldMsgComments, expectedVldMsgComments);
			System.out.println("verified validation for comments ");
//			
			Thread.sleep(3000);
			String actualVldMsgInterest = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3621-o1']/form/div[2]/div[4]/div/div/span/span/span/span")).getText();
			System.out.println("CompanytActualMessage: "+actualVldMsgName);
			String expectedVldMsgInterest = "The field is required.";
			Assert.assertEquals(actualVldMsgInterest, expectedVldMsgInterest);
			System.out.println("verified validation for company ");
//			
			
//			
//			Thread.sleep(3000);
//			String actualVldMsg = driver.findElement(By.xpath("//*[@id='wpcf7-f3627-p433-o1']/form/div[9]")).getText();
//			System.out.println("Name: "+actualVldMsgName);
//			String expectedVldMsg = "One or more fields have an error. Please check and try again.";
//			Assert.assertEquals(actualVldMsg, expectedVldMsg);
//			System.out.println("verified validation for overall ");
//			
//			driver.navigate().refresh();
//			System.out.println("Refreshed the contact US page");
		}
		else
		{
			System.out.println("If loop not entered");
		}
	}
	public static void verfiyMnagesupport_CloudForm() throws Exception
	{
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		WebElement name = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3621-o1']/form/div[2]/div[1]/div/div/span/span/input"));		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);
		Thread.sleep(2000);
		name.sendKeys("Test One demo");
		
		WebElement emailString = driver.findElement(By.xpath("//*[@id='work-email-id']"));
		Thread.sleep(2000);
		emailString.sendKeys("test01@ngenioussolutions.com");
		
		WebElement number = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3621-o1']/form/div[2]/div[3]/div/div/span/span[2]/input"));		Thread.sleep(2000);
		number.sendKeys("987456320");
		
		WebElement company = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3621-o1']/form/div[2]/div[4]/div/div/span/span/input"));
		Thread.sleep(2000);
		company.sendKeys("NSPL Pvt. Ltd.");
		
//		WebElement interestat = driver.findElement(By.xpath("//*[@id='Interested']"));
//		Thread.sleep(2000);
//		Select s =new Select(interestat);
//		s.selectByIndex(1);

		

		WebElement comment = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3621-o1']/form/div[2]/div[5]/div/div/span/span/textarea"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comment);
		Thread.sleep(2000);
		comment.sendKeys("Values entered in comments Values entered in comments");
		
	/*	driver.switchTo().frame(0);
		System.out.println("Switched to Iframe");
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='recaptcha-anchor']/div[1]"))).click();
		System.out.println("checkbox checked");
		
		driver.switchTo().defaultContent();
		System.out.println("Sustem switch back to default content");  
		
		Thread.sleep(20000);  */
		//*[@id="wpcf7-f3861-p3275-o1"]/form/div[3]
		//*[@id="wpcf7-f3861-p3275-o1"]/form/div[3]
		WebElement submit = driver.findElement(By.xpath("//*[@id='btnSubmit']"));
		Thread.sleep(3000);
		submit.click();
		System.out.println("Submit Clicked");
		
		Thread.sleep(20000);
		
		String actualsucessmsg = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3621-o1']/form/div[3]")).getText();
		//*[@id="wpcf7-f3861-p3621-o1"]/form/div[3]
		//String actualsucessmsg = driver.findElement(By.xpath("//*[@id='wpcf7-f3627-p433-o1']/form/div[9]")).getText();
		System.out.println("Success Msg: "+actualsucessmsg);
		String expectedsuccessmsg = "Thank you for your message. It has been sent.";
		Assert.assertEquals(actualsucessmsg, expectedsuccessmsg);
		System.out.println("Verified the success msg");
	}

	
	public static void ManageSupport_CloudtverifyFieldVldMsg() throws Exception
	{
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		WebElement name = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3621-o1']/form/div[2]/div[1]/div/div/span/span/input"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);
		Thread.sleep(2000);
		name.sendKeys("Google will check the clicking position on the checkbox Bots click exactly on the center of the checkbox");
		
		WebElement emailString = driver.findElement(By.xpath("//*[@id='work-email-id']"));
		Thread.sleep(2000);
		emailString.sendKeys("Google will check the clicking position on the checkbox Bots click exactly on the center of the checkbox");
		
		Thread.sleep(4000);
		WebElement number = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3621-o1']/form/div[2]/div[3]/div/div/span/span[2]/input"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", number);
		Thread.sleep(2000);
		number.sendKeys("9874563210987456");
		
		WebElement company = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3621-o1']/form/div[2]/div[4]/div/div/span/span/input"));
		Thread.sleep(2000);
		company.sendKeys("ASDFghjkl");
		
		WebElement comment = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3621-o1']/form/div[2]/div[5]/div/div/span/span/textarea"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comment);
		Thread.sleep(2000);
		comment.sendKeys("Google will check the clicking position on the checkbox. Bots click exactly on the center of the checkbox while humans click somewhere on the box. This will help to decide Google whether the user is a human or bot.Google will check the clicking position on the checkbox. Bots click exactly on the center of the checkbox while humans click somewhere on the box. This will help to decide Google whether the user is a human or bot. This will help to decide Google whether the user is a human or bot.This will");
		
		Thread.sleep(4000);
		WebElement submit = driver.findElement(By.xpath("//*[@id='btnSubmit']"));
		Thread.sleep(3000);
		submit.click();
		System.out.println("Submit Clicked");
		
		Thread.sleep(15000);
		name = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3621-o1']/form/div[2]/div[1]/div/div/span/span/input"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);
		System.out.println("name");

		Thread.sleep(3000);
		String actualemailVld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3621-o1']/form/div[2]/div[2]/div/div/span[1]/span/span")).getText();
																//*[@id="wpcf7-f3861-p3275-o1"]/form/div[2]/div[2]/div/div/span[1]/span/span
																//*[@id="wpcf7-f3861-p3275-o1"]/form/div[2]/div[2]/div/div/span[1]/span/span/span
																//*[@id="wpcf7-f3861-p3275-o1"]/form/div[2]/div[2]/div/div/span[1]/span/span[2]/span
		
		String expectedemailVld = "The e-mail address entered is invalid.";
		Assert.assertEquals(actualemailVld, expectedemailVld);
		System.out.println("validated the Email validation msg");
//		
		Thread.sleep(4000);
		String actualNumberVld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3621-o1']/form/div[2]/div[3]/div/div/span/span[2]/span/span")).getText();
		
		
															//*[@id="wpcf7-f3861-p3275-o1"]/form/div[2]/div[3]/div/div/span/span[2]/span/span
		String expectedNumberVld = "The number is larger than the maximum allowed.";
		Assert.assertEquals(actualNumberVld,expectedNumberVld);
		System.out.println("validated the Number validation msg");
		
		Thread.sleep(5000);
		String actualCompanyVld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3621-o1']/form/div[2]/div[4]/div/div/span/span/span/span")).getText();
	
																//*[@id="wpcf7-f3861-p3275-o1"]/form/div[2]/div[4]/div/div/span/span/span/span
		String expectedCompanyVld = "The field is too short.";
		Assert.assertEquals(actualCompanyVld,expectedCompanyVld);
		System.out.println("validated the Company validation msg");
		
	}

	
	
	///////////////---------------Database---------------////////
	
	public static void verifyManagesuport_Database_FormvalidationOnBlank() throws Exception
	{

		Thread.sleep(5000);
		driver.navigate().refresh();
		
		WebElement name = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3443-o1']/form/div[2]/div[1]/div/div/span/span/input"));
		
																			//*[@id="wpcf7-f3861-p3563-o1"]/form/div[2]/div[1]/div/div/span/span/input
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);
		
		
		
		WebElement emailString = driver.findElement(By.xpath("//*[@id='work-email-id']"));
		WebElement number = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3443-o1']/form/div[2]/div[3]/div/div/span/span[2]/input"));
		WebElement company = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3443-o1']/form/div[2]/div[4]/div/div/span/span/input"));
	//	WebElement interestat = driver.findElement(By.xpath("//*[@id='Interested']"));
		
		WebElement comment = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3443-o1']/form/div[2]/div[5]/div/div/span/span/textarea"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comment);
		
		if(name.isDisplayed() && emailString.isDisplayed() && number.isDisplayed() && company.isDisplayed()  && comment.isDisplayed())
		{
			WebElement submit = driver.findElement(By.xpath("//*[@id='btnSubmit']"));
			Thread.sleep(3000);
			submit.click();
			System.out.println("Submit Clicked");
			
			Thread.sleep(5000);
			name = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3443-o1']/form/div[2]/div[1]/div/div/span/span/input"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);
			
			Thread.sleep(4000);
			String actualVldMsgName = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3443-o1']/form/div[2]/div[1]/div/div/span/span/span/span")).getText();
			System.out.println("NameActualMessage: "+actualVldMsgName);
			String expectedVldMsgName = "The field is required.";
			Assert.assertEquals(actualVldMsgName, expectedVldMsgName);
			System.out.println("verified validation for name ");
			
			Thread.sleep(3000);
			String actualVldMsgEmail = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3443-o1']/form/div[2]/div[2]/div/div/span[1]/span/span/span")).getText();
			System.out.println("emailActualMessage: "+actualVldMsgName);
			String expectedVldMsgEmail = "The field is required.";
			Assert.assertEquals(actualVldMsgEmail, expectedVldMsgEmail);
			System.out.println("verified validation for email ");
			
			Thread.sleep(3000);
			String actualVldMsgNumber = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3443-o1']/form/div[2]/div[3]/div/div/span/span[2]/span/span")).getText();
			System.out.println("NumberActualMessage: "+actualVldMsgName);
			String expectedVldMsgNumber = "The field is required.";
			Assert.assertEquals(actualVldMsgNumber, expectedVldMsgNumber);
			System.out.println("verified validation for number ");
			
			
			Thread.sleep(3000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comment);
			String actualVldMsgComments = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3443-o1']/form/div[2]/div[5]/div/div/span/span/span/span")).getText();
			System.out.println("commentsActualMessage: "+actualVldMsgName);
			String expectedVldMsgComments = "The field is required.";
			Assert.assertEquals(actualVldMsgComments, expectedVldMsgComments);
			System.out.println("verified validation for comments ");
//			
			Thread.sleep(3000);
			String actualVldMsgInterest = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3443-o1']/form/div[2]/div[4]/div/div/span/span/span/span")).getText();
			System.out.println("CompanytActualMessage: "+actualVldMsgName);
			String expectedVldMsgInterest = "The field is required.";
			Assert.assertEquals(actualVldMsgInterest, expectedVldMsgInterest);
			System.out.println("verified validation for company ");
//			
			
//			
//			Thread.sleep(3000);
//			String actualVldMsg = driver.findElement(By.xpath("//*[@id='wpcf7-f3627-p433-o1']/form/div[9]")).getText();
//			System.out.println("Name: "+actualVldMsgName);
//			String expectedVldMsg = "One or more fields have an error. Please check and try again.";
//			Assert.assertEquals(actualVldMsg, expectedVldMsg);
//			System.out.println("verified validation for overall ");
//			
//			driver.navigate().refresh();
//			System.out.println("Refreshed the contact US page");
		}
		else
		{
			System.out.println("If loop not entered");
		}
	}
	public static void verfiyMnagesupport_DatabaseForm() throws Exception
	{
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		WebElement name = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3443-o1']/form/div[2]/div[1]/div/div/span/span/input"));		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);
		Thread.sleep(2000);
		name.sendKeys("Test One demo");
		
		WebElement emailString = driver.findElement(By.xpath("//*[@id='work-email-id']"));
		Thread.sleep(2000);
		emailString.sendKeys("test01@ngenioussolutions.com");
		
		WebElement number = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3443-o1']/form/div[2]/div[3]/div/div/span/span[2]/input"));		Thread.sleep(2000);
		number.sendKeys("987456320");
		
		WebElement company = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3443-o1']/form/div[2]/div[4]/div/div/span/span/input"));
		Thread.sleep(2000);
		company.sendKeys("NSPL Pvt. Ltd.");
		
//		WebElement interestat = driver.findElement(By.xpath("//*[@id='Interested']"));
//		Thread.sleep(2000);
//		Select s =new Select(interestat);
//		s.selectByIndex(1);

		

		WebElement comment = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3443-o1']/form/div[2]/div[5]/div/div/span/span/textarea"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comment);
		Thread.sleep(2000);
		comment.sendKeys("Values entered in comments Values entered in comments");
		
	/*	driver.switchTo().frame(0);
		System.out.println("Switched to Iframe");
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='recaptcha-anchor']/div[1]"))).click();
		System.out.println("checkbox checked");
		
		driver.switchTo().defaultContent();
		System.out.println("Sustem switch back to default content");  
		
		Thread.sleep(20000);  */
		//*[@id="wpcf7-f3861-p3275-o1"]/form/div[3]
		//*[@id="wpcf7-f3861-p3275-o1"]/form/div[3]
		WebElement submit = driver.findElement(By.xpath("//*[@id='btnSubmit']"));
		Thread.sleep(3000);
		submit.click();
		System.out.println("Submit Clicked");
		
		Thread.sleep(20000);
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3443-o1']/form/div[3]"))));
																						//*[@id="wpcf7-f3861-p3443-o1"]/form/div[3]
		String actualsucessmsg = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3443-o1']/form/div[3]")).getText();
		//*[@id="wpcf7-f3861-p3563-o1"]/form/div[3]
		//String actualsucessmsg = driver.findElement(By.xpath("//*[@id='wpcf7-f3627-p433-o1']/form/div[9]")).getText();
		System.out.println("Success Msg: "+actualsucessmsg);
		String expectedsuccessmsg = "Thank you for your message. It has been sent.";
		Assert.assertEquals(actualsucessmsg, expectedsuccessmsg);
		System.out.println("Verified the success msg");
	}

	
	public static void ManageSupport_DatabasetverifyFieldVldMsg() throws Exception
	{
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		WebElement name = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3443-o1']/form/div[2]/div[1]/div/div/span/span/input"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);
		Thread.sleep(2000);
		name.sendKeys("Google will check the clicking position on the checkbox Bots click exactly on the center of the checkbox");
		
		WebElement emailString = driver.findElement(By.xpath("//*[@id='work-email-id']"));
		Thread.sleep(2000);
		emailString.sendKeys("Google will check the clicking position on the checkbox Bots click exactly on the center of the checkbox");
		
		Thread.sleep(4000);
		WebElement number = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3443-o1']/form/div[2]/div[3]/div/div/span/span[2]/input"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", number);
		Thread.sleep(2000);
		number.sendKeys("9874563210987456");
		
		WebElement company = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3443-o1']/form/div[2]/div[4]/div/div/span/span/input"));
		Thread.sleep(2000);
		company.sendKeys("ASDFghjkl");
		
		WebElement comment = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3443-o1']/form/div[2]/div[5]/div/div/span/span/textarea"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comment);
		Thread.sleep(2000);
		comment.sendKeys("Google will check the clicking position on the checkbox. Bots click exactly on the center of the checkbox while humans click somewhere on the box. This will help to decide Google whether the user is a human or bot.Google will check the clicking position on the checkbox. Bots click exactly on the center of the checkbox while humans click somewhere on the box. This will help to decide Google whether the user is a human or bot. This will help to decide Google whether the user is a human or bot.This will");
		
		Thread.sleep(4000);
		WebElement submit = driver.findElement(By.xpath("//*[@id='btnSubmit']"));
		Thread.sleep(3000);
		submit.click();
		System.out.println("Submit Clicked");
		
		Thread.sleep(15000);
		name = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3443-o1']/form/div[2]/div[1]/div/div/span/span/input"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);
		System.out.println("name");

		Thread.sleep(3000);
		String actualemailVld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3443-o1']/form/div[2]/div[2]/div/div/span[1]/span/span")).getText();
																//*[@id="wpcf7-f3861-p3275-o1"]/form/div[2]/div[2]/div/div/span[1]/span/span
																//*[@id="wpcf7-f3861-p3275-o1"]/form/div[2]/div[2]/div/div/span[1]/span/span/span
																//*[@id="wpcf7-f3861-p3275-o1"]/form/div[2]/div[2]/div/div/span[1]/span/span[2]/span
		
		String expectedemailVld = "The e-mail address entered is invalid.";
		Assert.assertEquals(actualemailVld, expectedemailVld);
		System.out.println("validated the Email validation msg");
//		
		Thread.sleep(4000);
		String actualNumberVld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3443-o1']/form/div[2]/div[3]/div/div/span/span[2]/span/span")).getText();
		
		
															//*[@id="wpcf7-f3861-p3275-o1"]/form/div[2]/div[3]/div/div/span/span[2]/span/span
		String expectedNumberVld = "The number is larger than the maximum allowed.";
		Assert.assertEquals(actualNumberVld,expectedNumberVld);
		System.out.println("validated the Number validation msg");
		
		Thread.sleep(5000);
		String actualCompanyVld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3443-o1']/form/div[2]/div[4]/div/div/span/span/span/span")).getText();
	
																//*[@id="wpcf7-f3861-p3275-o1"]/form/div[2]/div[4]/div/div/span/span/span/span
		String expectedCompanyVld = "The field is too short.";
		Assert.assertEquals(actualCompanyVld,expectedCompanyVld);
		System.out.println("validated the Company validation msg");
		
	}


}
