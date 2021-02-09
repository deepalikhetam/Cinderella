package corporatesite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ServicePage extends Browser
{
	static WebDriverWait wait = new WebDriverWait(driver, 50);
	static Actions action = new Actions(driver);
	public static void verifyServiceEnterPriseDynamic() throws Exception
	{
		WebElement Servicearrow=driver.findElement(By.xpath("//*[@id='menu-item-1948']/span"));

	if(!Servicearrow.isDisplayed())
			
		{
			System.out.println("service arrow does not dislayed ");
			Thread.sleep(5000);

			System.out.println("In web/Portrait ");
		Thread.sleep(10000);
		WebElement serviceMenu = driver.findElement(By.xpath("//*[@id='menu-item-1948']/a/span"));
		action.moveToElement(serviceMenu);
		System.out.println("Moved to Services Menu");
		
		Thread.sleep(10000);
		WebElement dynamic = driver.findElement(By.xpath("//*[@id='menu-item-1957']/a/span"));
		action.moveToElement(dynamic);
		action.click().build().perform();
		System.out.println("Clicked on Dynamic365");
		
		Thread.sleep(10000);
		String actualtile = driver.getTitle();
		System.out.println("Pagetitle: "+actualtile);
		String expectedTitle = "CRM and ERP Applications | Microsoft Dynamics 365 | SharePoint Consultants | Office 365 consultants | SharePoint Experts - NGenious Solutions";
		Assert.assertEquals(actualtile, expectedTitle);
		System.out.println("Verified Dynamic 365 Page");
		
		}
	else
		
	{
		System.out.println("Service arrow does  displayed");

		System.out.println("In mobile ");

		WebElement nintexautomationpage = driver.findElement(By
				.xpath("//*[@id='menu-item-1957']/a/span"));
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].click();", nintexautomationpage);
	
		
		
		System.out.println("Clicked on Dynamic365  in mobile ");

		String actualtile = driver.getTitle();
		System.out.println("Pagetitle: " + actualtile);
		String expectedTitle = "CRM and ERP Applications | Microsoft Dynamics 365 | SharePoint Consultants | Office 365 consultants | SharePoint Experts - NGenious Solutions";
		Assert.assertEquals(actualtile, expectedTitle);
		System.out.println("Verified Dynamic 365 Page");
	}
	
/*		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='menu-item-1943']")).click();
		System.out.println("Clicked on Home Menu");*/
	}
	public static void verifyServiceEnterPriseDynamicvideo() throws Exception
	{
		Thread.sleep(5000);
		WebElement videoAboveContent = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div[1]/div[1]/div/div[1]/div/div/section[2]/div[2]/div/div/div/div/section/div/div/div/div/div/div/div/h5"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",videoAboveContent);
		System.out.println("Scrolled to video ");
		
		
		
	}
	public static void verifyServiceEnterPriseDynamicFormVld() throws Exception
	{
		Thread.sleep(5000);
		WebElement formTitle = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div[1]/div[1]/div/div[1]/div/div/section[5]/div/div/div/div/div/section/div/div/div[2]/div/div/div[1]/div/h4"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",formTitle);
		System.out.println("Scroll down to form");
		
		Thread.sleep(5000);
		WebElement submitBtn = driver.findElement(By.xpath("//*[@id='btnSubmit']"));
		submitBtn.click();
		System.out.println("Submit clicked");
		
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",formTitle);
		
		Thread.sleep(10000);
		String namevld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p2557-o1']/form/div[2]/div[1]/div/div/span/span/span/span")).getText();
		System.out.println("Name Validation: "+namevld);
		String expectednamevld = "The field is required.";
		Assert.assertEquals(namevld, expectednamevld);
		System.out.println("Verified validation for Name field");
		
		Thread.sleep(5000);
		String emailvld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p2557-o1']/form/div[2]/div[2]/div/div/span[1]/span/span/span")).getText();
		System.out.println("Email Validation: "+emailvld);
		String expectedemailvld = "The field is required.";
		Assert.assertEquals(emailvld, expectedemailvld);
		System.out.println("Verified validation for Email field");
		
		Thread.sleep(5000);
		String numbervld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p2557-o1']/form/div[2]/div[3]/div/div/span/span[2]/span/span")).getText();
		System.out.println("Number Validation: "+numbervld);
		String expectednumbervld = "The field is required.";
		Assert.assertEquals(numbervld, expectednumbervld);
		System.out.println("Verified validation for Number field");
		
		Thread.sleep(5000);
		String companyvld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p2557-o1']/form/div[2]/div[4]/div/div/span/span/span/span")).getText();
		System.out.println("Company Validation: "+companyvld);
		String expectedcompanyvld = "The field is required.";
		Assert.assertEquals(companyvld, expectedcompanyvld);
		System.out.println("Verified validation for Company field");
		
		Thread.sleep(5000);
		WebElement comment = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p2557-o1']/form/div[2]/div[5]/div/div/span/span/textarea"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",comment);
		System.out.println("Scrolled down to comment");
		
		Thread.sleep(5000);
		String commentvld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p2557-o1']/form/div[2]/div[5]/div/div/span/span/span/span")).getText();
		System.out.println("Comment Validation: "+commentvld);
		String expectedcommentvld = "The field is required.";
		Assert.assertEquals(commentvld, expectedcommentvld);
		System.out.println("Verified validation for Comment field");
		
		Thread.sleep(5000);
		String overallvld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p2557-o1']/form/div[3]")).getText();
		System.out.println("Over all Validation: "+overallvld);
		String expectedoverallvld = "One or more fields have an error. Please check and try again.";
		Assert.assertEquals(overallvld, expectedoverallvld);
		System.out.println("Verified validation for Over all field");
		
		Thread.sleep(5000);
		driver.navigate().refresh();
		System.out.println("Refreshed the Page");
		Thread.sleep(5000);
	}
	public static void verifyServiceEnterPriseDynamicForm() throws Exception
	{
		Thread.sleep(10000);
		WebElement formTitle = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div[1]/div[1]/div/div[1]/div/div/section[5]/div/div/div/div/div/section/div/div/div[2]/div/div/div[1]/div/h4"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",formTitle);
		System.out.println("Scroll down form");
		
		Thread.sleep(5000);
		WebElement name = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p2557-o1']/form/div[2]/div[1]/div/div/span/span/input"));
		name.sendKeys("Test Demo one");
		System.out.println("Values entered in name field");
		
		Thread.sleep(4000);
		WebElement email = driver.findElement(By.xpath("//*[@id='work-email-id']"));
		email.sendKeys("test01@ngenioussolutions.com");
		System.out.println("Values entered in email field");
		
		Thread.sleep(4000);
		WebElement number = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p2557-o1']/form/div[2]/div[3]/div/div/span/span[2]/input"));
		number.sendKeys("9874563210");
		System.out.println("Values entered in number field");
		
		Thread.sleep(4000);
		WebElement company = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p2557-o1']/form/div[2]/div[4]/div/div/span/span/input"));
		company.sendKeys("NSPL Pvt. Ltd.");
		System.out.println("Values entered in company field");
		
		Thread.sleep(4000);
		WebElement comment = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p2557-o1']/form/div[2]/div[5]/div/div/span/span/textarea"));
		comment.sendKeys("Values entered in comment field");
		System.out.println("Values entered in comment field");
		
		Thread.sleep(4000);
		WebElement submitBtn = driver.findElement(By.xpath("//*[@id='btnSubmit']"));
		submitBtn.click();
		System.out.println("Submit clicked");
		
		Thread.sleep(15000);
		String succesVld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p2557-o1']/form/div[3]")).getText();
		System.out.println("Success Msg: "+succesVld);
		String expectedsuccesVld = "Thank you for your message. It has been sent.";
		Assert.assertEquals(succesVld, expectedsuccesVld);
		System.out.println("Validated the form");
	}
	public static void verifyServiceEnterPriseBusinessCentral() throws Exception
	{

		WebElement Servicearrow=driver.findElement(By.xpath("//*[@id='menu-item-1948']/span"));

		if(!Servicearrow.isDisplayed())
			
		{
			System.out.println("service arrow does not dislayed ");
			Thread.sleep(5000);

		Thread.sleep(10000);
		WebElement serviceMenu = driver.findElement(By.xpath("//*[@id='menu-item-1948']/a/span"));
		Actions action = new Actions(driver);
		action.moveToElement(serviceMenu);
		System.out.println("Moved to Services Menu");
		
		Thread.sleep(5000);
		WebElement dynamic = driver.findElement(By.xpath("//*[@id='menu-item-1958']/a/span"));
		action.moveToElement(dynamic);
		System.out.println("Moved to Business Central");
		action.click().build().perform();

		System.out.println("Clicked on Business Central");



		
		Thread.sleep(10000);
		String actualtile = driver.getTitle();
		System.out.println("Pagetitle: "+actualtile);
		String expectedTitle = "Microsoft Dynamics 365 Business Central | SharePoint Consultants | Office 365 consultants | SharePoint Experts - NGenious Solutions";
		Assert.assertEquals(actualtile, expectedTitle);
		}
		
		else
			
		{
			System.out.println("Service arrow does  displayed");

			System.out.println("In mobile ");

			WebElement nintexautomationpage = driver.findElement(By
					.xpath("//*[@id='menu-item-1958']/a/span"));
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].click();", nintexautomationpage);
		
			
			
			System.out.println("Clicked on Business Central");

			String actualtile = driver.getTitle();
			System.out.println("Pagetitle: " + actualtile);
			String expectedTitle = "Microsoft Dynamics 365 Business Central | SharePoint Consultants | Office 365 consultants | SharePoint Experts - NGenious Solutions";
			Assert.assertEquals(actualtile, expectedTitle);
		}
		
	}
	public static void verifyServiceEnterPriseBusinessCentralvideo() throws Exception
	{
		Thread.sleep(5000);
		WebElement videoAboveContent = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div[1]/div[1]/div/div[1]/div/div/section[3]/div[2]/div/div/div/div/div[1]/div/h2"));				
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",videoAboveContent);
		System.out.println("Scrolled to video ");
		
	}
	public static void verifyServiceEnterPriseBCFormVld() throws Exception
	{
		Thread.sleep(10000);
		WebElement formTitle = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div[1]/div[1]/div/div[1]/div/div/section[5]/div/div/div/div/div/section/div/div/div[2]/div/div/div[1]/div/h4"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",formTitle);
		System.out.println("Scroll down to form");
		
		Thread.sleep(5000);
		WebElement submitBtn = driver.findElement(By.xpath("//*[@id='btnSubmit']"));
		submitBtn.click();
		System.out.println("Submit clicked");
		
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",formTitle);
		
		Thread.sleep(15000);
		String namevld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p2607-o1']/form/div[2]/div[1]/div/div/span/span/span/span")).getText();
		System.out.println("Name Validation: "+namevld);
		String expectednamevld = "The field is required.";
		Assert.assertEquals(namevld, expectednamevld);
		System.out.println("Verified validation for Name field");
		
		Thread.sleep(5000);
		String emailvld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p2607-o1']/form/div[2]/div[2]/div/div/span[1]/span/span/span")).getText();
		System.out.println("Email Validation: "+emailvld);
		String expectedemailvld = "The field is required.";
		Assert.assertEquals(emailvld, expectedemailvld);
		System.out.println("Verified validation for Email field");
		
		Thread.sleep(5000);
		String numbervld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p2607-o1']/form/div[2]/div[3]/div/div/span/span[2]/span/span")).getText();
		System.out.println("Number Validation: "+numbervld);
		String expectednumbervld = "The field is required.";
		Assert.assertEquals(numbervld, expectednumbervld);
		System.out.println("Verified validation for Number field");
		
		Thread.sleep(5000);
		String companyvld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p2607-o1']/form/div[2]/div[4]/div/div/span/span/span/span")).getText();
		System.out.println("Company Validation: "+companyvld);
		String expectedcompanyvld = "The field is required.";
		Assert.assertEquals(companyvld, expectedcompanyvld);
		System.out.println("Verified validation for Company field");
		
		Thread.sleep(5000);
		WebElement comment = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p2607-o1']/form/div[2]/div[5]/div/div/span/span/textarea"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",comment);
		System.out.println("Scrolled down to comment");
		
		Thread.sleep(5000);
		String commentvld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p2607-o1']/form/div[2]/div[5]/div/div/span/span/span/span")).getText();
		System.out.println("Comment Validation: "+commentvld);
		String expectedcommentvld = "The field is required.";
		Assert.assertEquals(commentvld, expectedcommentvld);
		System.out.println("Verified validation for Comment field");
		
		Thread.sleep(5000);
		String overallvld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p2607-o1']/form/div[3]")).getText();
		System.out.println("Over all Validation: "+overallvld);
		String expectedoverallvld = "One or more fields have an error. Please check and try again.";
		Assert.assertEquals(overallvld, expectedoverallvld);
		System.out.println("Verified validation for Over all field");
		
		Thread.sleep(5000);
		driver.navigate().refresh();
		System.out.println("Refreshed the Page");
		Thread.sleep(5000);
	}
	public static void verifyServiceEnterPriseBCForm() throws Exception
	{
		Thread.sleep(10000);
		WebElement formTitle = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div[1]/div[1]/div/div[1]/div/div/section[5]/div/div/div/div/div/section/div/div/div[2]/div/div/div[1]/div/h4"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",formTitle);
		System.out.println("Scroll down form");
		
		Thread.sleep(5000);
		WebElement name = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p2607-o1']/form/div[2]/div[1]/div/div/span/span/input"));
		name.sendKeys("Test Demo one");
		System.out.println("Values entered in name field");
		
		Thread.sleep(5000);
		WebElement email = driver.findElement(By.xpath("//*[@id='work-email-id']"));
		email.sendKeys("test01@ngenioussolutions.com");
		System.out.println("Values entered in email field");
		
		Thread.sleep(5000);
		WebElement number = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p2607-o1']/form/div[2]/div[3]/div/div/span/span[2]/input"));
		number.sendKeys("9874563210");
		System.out.println("Values entered in number field");
		
		Thread.sleep(5000);
		WebElement company = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p2607-o1']/form/div[2]/div[4]/div/div/span/span/input"));
		company.sendKeys("NSPL Pvt. Ltd.");
		System.out.println("Values entered in company field");
		
		Thread.sleep(5000);
		WebElement comment = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p2607-o1']/form/div[2]/div[5]/div/div/span/span/textarea"));
		comment.sendKeys("Values entered in comment field");
		System.out.println("Values entered in comment field");
		
		Thread.sleep(10000);
		WebElement submitBtn = driver.findElement(By.xpath("//*[@id='btnSubmit']"));
		submitBtn.click();
		System.out.println("Submit clicked");
		
		Thread.sleep(20000);
		String succesVld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p2607-o1']/form/div[3]")).getText();
		System.out.println("Success Msg: "+succesVld);
		String expectedsuccesVld = "Thank you for your message. It has been sent.";
		Assert.assertEquals(succesVld, expectedsuccesVld);
		System.out.println("Validated the form");
	}
	public static void verifyServiceEnterPriseMicrosoftSP() throws Exception
	{
		WebElement Servicearrow=driver.findElement(By.xpath("//*[@id='menu-item-1948']/span"));

		if(!Servicearrow.isDisplayed())
				
			{
			System.out.println("In web/Portrait ");
			Thread.sleep(10000);
			WebElement serviceMenu = driver.findElement(By.xpath("//*[@id='menu-item-1948']/a/span"));
			Actions action = new Actions(driver);
			action.moveToElement(serviceMenu);
			System.out.println("Moved to Services Menu");
			
			Thread.sleep(5000);
			WebElement dynamic = driver.findElement(By.xpath("//*[@id='menu-item-1960']/a/span"));
			action.moveToElement(dynamic);
			System.out.println("Moved to Microsoft SP");
			action.click().build().perform();
			System.out.println("Clicked on Microsoft SP");
	
			Thread.sleep(10000);
			String actualtile = driver.getTitle();
			System.out.println("Pagetitle: "+actualtile);
			String expectedTitle = "SharePoint Development Services for USA, NEW York, New Jersey, India | SharePoint Consultants | Office 365 consultants | SharePoint Experts - NGenious Solutions";
			Assert.assertEquals(actualtile, expectedTitle);
			}
		else
		{
			{
				System.out.println("Service arrow does  displayed");

				System.out.println("In mobile ");

				WebElement nintexautomationpage = driver.findElement(By
						.xpath("//*[@id='menu-item-1960']/a/span"));
				((JavascriptExecutor) driver).executeScript(
						"arguments[0].click();", nintexautomationpage);
			
				String actualtile = driver.getTitle();
				System.out.println("Pagetitle: " + actualtile);
				String expectedTitle = "SharePoint Development Services for USA, NEW York, New Jersey, India | SharePoint Consultants | Office 365 consultants | SharePoint Experts - NGenious Solutions";
				Assert.assertEquals(actualtile, expectedTitle);
				System.out.println("Clicked on Microsoft SP");
				
				

		

			}
		}
		
		
	}
	public static void verifyServiceEnterPriseMicrosoftSPFormVld() throws Exception
	{
		Thread.sleep(5000);
		WebElement formTitle = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div[1]/div[1]/div/div[1]/div/div/section[5]/div/div/div/div/div/section/div/div/div[2]/div/div/div[1]/div/h4"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",formTitle);
		System.out.println("Scroll down to form");
		
		Thread.sleep(5000);
		WebElement submitBtn = driver.findElement(By.xpath("//*[@id='btnSubmit']"));
		submitBtn.click();
		System.out.println("Submit clicked");
		
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",formTitle);
		
		Thread.sleep(10000);
		String namevld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3187-o1']/form/div[2]/div[1]/div/div/span/span/span/span")).getText();
		System.out.println("Name Validation: "+namevld);
		String expectednamevld = "The field is required.";
		Assert.assertEquals(namevld, expectednamevld);
		System.out.println("Verified validation for Name field");
		
		Thread.sleep(5000);
		String emailvld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3187-o1']/form/div[2]/div[2]/div/div/span[1]/span/span/span")).getText();
		System.out.println("Email Validation: "+emailvld);
		String expectedemailvld = "The field is required.";
		Assert.assertEquals(emailvld, expectedemailvld);
		System.out.println("Verified validation for Email field");
		
		Thread.sleep(5000);
		String numbervld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3187-o1']/form/div[2]/div[3]/div/div/span/span[2]/span/span")).getText();
		System.out.println("Number Validation: "+numbervld);
		String expectednumbervld = "The field is required.";
		Assert.assertEquals(numbervld, expectednumbervld);
		System.out.println("Verified validation for Number field");
		
		Thread.sleep(5000);
		String companyvld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3187-o1']/form/div[2]/div[4]/div/div/span/span/span/span")).getText();
		System.out.println("Company Validation: "+companyvld);
		String expectedcompanyvld = "The field is required.";
		Assert.assertEquals(companyvld, expectedcompanyvld);
		System.out.println("Verified validation for Company field");
		
		Thread.sleep(5000);
		WebElement comment = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3187-o1']/form/div[2]/div[5]/div/div/span/span/textarea"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",comment);
		System.out.println("Scrolled down to comment");
		
		Thread.sleep(5000);
		String commentvld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3187-o1']/form/div[2]/div[5]/div/div/span/span/span/span")).getText();
		System.out.println("Comment Validation: "+commentvld);
		String expectedcommentvld = "The field is required.";
		Assert.assertEquals(commentvld, expectedcommentvld);
		System.out.println("Verified validation for Comment field");
		
		Thread.sleep(5000);
		String overallvld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3187-o1']/form/div[3]")).getText();
		System.out.println("Over all Validation: "+overallvld);
		String expectedoverallvld = "One or more fields have an error. Please check and try again.";
		Assert.assertEquals(overallvld, expectedoverallvld);
		System.out.println("Verified validation for Over all field");
		
		Thread.sleep(5000);
		driver.navigate().refresh();
		System.out.println("Refreshed the Page");
		Thread.sleep(5000);
	}
	public static void verifyServiceEnterPriseMicrosoftSPForm() throws Exception
	{
		Thread.sleep(5000);
		WebElement formTitle = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div[1]/div[1]/div/div[1]/div/div/section[5]/div/div/div/div/div/section/div/div/div[2]/div/div/div[1]/div/h4"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",formTitle);
		System.out.println("Scroll down to form");
		
		Thread.sleep(5000);
		WebElement name = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3187-o1']/form/div[2]/div[1]/div/div/span/span/input"));
		name.sendKeys("Test Demo one");
		System.out.println("Values entered in name field");
		
		Thread.sleep(4000);
		WebElement email = driver.findElement(By.xpath("//*[@id='work-email-id']"));
		email.sendKeys("test01@ngenioussolutions.com");
		System.out.println("Values entered in email field");
		
		Thread.sleep(4000);
		WebElement number = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3187-o1']/form/div[2]/div[3]/div/div/span/span[2]/input"));
		number.sendKeys("9874563210");
		System.out.println("Values entered in number field");
		
		Thread.sleep(4000);
		WebElement company = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3187-o1']/form/div[2]/div[4]/div/div/span/span/input"));
		company.sendKeys("NSPL Pvt. Ltd.");
		System.out.println("Values entered in company field");
		
		Thread.sleep(4000);
		WebElement comment = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3187-o1']/form/div[2]/div[5]/div/div/span/span/textarea"));
		comment.sendKeys("Values entered in comment field");
		System.out.println("Values entered in comment field");
		
		Thread.sleep(4000);
		WebElement submitBtn = driver.findElement(By.xpath("//*[@id='btnSubmit']"));
		submitBtn.click();
		System.out.println("Submit clicked");
		
		Thread.sleep(25000);
		String succesVld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p3187-o1']/form/div[3]")).getText();
		System.out.println("Success Msg: "+succesVld);
		String expectedsuccesVld = "Thank you for your message. It has been sent.";
		Assert.assertEquals(succesVld, expectedsuccesVld);
		System.out.println("Validated the form");
	}
	public static void verifyServiceEnterPriseServiceNow() throws Exception
	{
		Thread.sleep(10000);
		WebElement serviceMenu = driver.findElement(By.xpath("//*[@id='menu-item-1948']/a/span"));
		Actions action = new Actions(driver);
		action.moveToElement(serviceMenu);
		System.out.println("Moved to Services Menu");
		
		Thread.sleep(5000);
		WebElement serviceNow = driver.findElement(By.xpath("//*[@id='menu-item-2465']/a/span"));
		action.moveToElement(serviceNow);
		System.out.println("Moved to ServiceNow");
		action.click().build().perform();


		System.out.println("Clicked on Service Now");

		System.out.println("Clicked on Services Now");


		System.out.println("Clicked on Service Now");


		Thread.sleep(10000);
		String actualtile = driver.getTitle();
		System.out.println("Pagetitle: "+actualtile);
		String expectedTitle = "ServiceNow | SharePoint Consultants | Office 365 consultants | SharePoint Experts - NGenious Solutions";
		Assert.assertEquals(actualtile, expectedTitle);
	}
	public static void verifyServiceEnterPriseServiceNowFormVld() throws Exception
	{
		Thread.sleep(5000);
		WebElement formTitle = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div[1]/div[1]/div/div[1]/div/div/section[6]/div/div/div/div/div/section/div/div/div[2]/div/div/div[1]/div/h4"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",formTitle);
		System.out.println("Scroll down to form");
		
		Thread.sleep(5000);
		WebElement submitBtn = driver.findElement(By.xpath("//*[@id='btnSubmit']"));
		submitBtn.click();
		System.out.println("Submit clicked");
		
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",formTitle);
		
		Thread.sleep(15000);
		String namevld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p2905-o1']/form/div[2]/div[1]/div/div/span/span/span/span")).getText();
		System.out.println("Name Validation: "+namevld);
		String expectednamevld = "The field is required.";
		Assert.assertEquals(namevld, expectednamevld);
		System.out.println("Verified validation for Name field");
		
		Thread.sleep(5000);
		String emailvld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p2905-o1']/form/div[2]/div[2]/div/div/span[1]/span/span/span")).getText();
		System.out.println("Email Validation: "+emailvld);
		String expectedemailvld = "The field is required.";
		Assert.assertEquals(emailvld, expectedemailvld);
		System.out.println("Verified validation for Email field");
		
		Thread.sleep(5000);
		String numbervld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p2905-o1']/form/div[2]/div[3]/div/div/span/span[2]/span/span")).getText();
		System.out.println("Number Validation: "+numbervld);
		String expectednumbervld = "The field is required.";
		Assert.assertEquals(numbervld, expectednumbervld);
		System.out.println("Verified validation for Number field");
		
		Thread.sleep(5000);
		String companyvld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p2905-o1']/form/div[2]/div[4]/div/div/span/span/span/span")).getText();
		System.out.println("Company Validation: "+companyvld);
		String expectedcompanyvld = "The field is required.";
		Assert.assertEquals(companyvld, expectedcompanyvld);
		System.out.println("Verified validation for Company field");
		
		Thread.sleep(5000);
		WebElement comment = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p2905-o1']/form/div[2]/div[5]/div/div/span/span/textarea"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",comment);
		System.out.println("Scrolled down to comment");
		
		Thread.sleep(5000);
		String commentvld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p2905-o1']/form/div[2]/div[5]/div/div/span/span/span/span")).getText();
		System.out.println("Comment Validation: "+commentvld);
		String expectedcommentvld = "The field is required.";
		Assert.assertEquals(commentvld, expectedcommentvld);
		System.out.println("Verified validation for Comment field");
		
		Thread.sleep(5000);
		String overallvld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p2905-o1']/form/div[3]")).getText();
		System.out.println("Over all Validation: "+overallvld);
		String expectedoverallvld = "One or more fields have an error. Please check and try again.";
		Assert.assertEquals(overallvld, expectedoverallvld);
		System.out.println("Verified validation for Over all field");
		
		Thread.sleep(5000);
		driver.navigate().refresh();
		System.out.println("Refreshed the Page");
		Thread.sleep(5000);
	}
	public static void verifyServiceEnterPriseServiceNowForm() throws Exception
	{
		Thread.sleep(5000);
		WebElement formTitle = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div[1]/div[1]/div/div[1]/div/div/section[6]/div/div/div/div/div/section/div/div/div[2]/div/div/div[1]/div/h4"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",formTitle);
		System.out.println("Scroll down to form");
		
		Thread.sleep(5000);
		WebElement name = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p2905-o1']/form/div[2]/div[1]/div/div/span/span/input"));
		name.sendKeys("Test Demo one");
		System.out.println("Values entered in name field");
		
		Thread.sleep(4000);
		WebElement email = driver.findElement(By.xpath("//*[@id='work-email-id']"));
		email.sendKeys("test01@ngenioussolutions.com");
		System.out.println("Values entered in email field");
		
		Thread.sleep(4000);
		WebElement number = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p2905-o1']/form/div[2]/div[3]/div/div/span/span[2]/input"));
		number.sendKeys("9874563210");
		System.out.println("Values entered in number field");
		
		Thread.sleep(4000);
		WebElement company = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p2905-o1']/form/div[2]/div[4]/div/div/span/span/input"));
		company.sendKeys("NSPL Pvt. Ltd.");
		System.out.println("Values entered in company field");
		
		Thread.sleep(4000);
		WebElement comment = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p2905-o1']/form/div[2]/div[5]/div/div/span/span/textarea"));
		comment.sendKeys("Values entered in comment field");
		System.out.println("Values entered in comment field");
		
		Thread.sleep(4000);
		WebElement submitBtn = driver.findElement(By.xpath("//*[@id='btnSubmit']"));
		submitBtn.click();
		System.out.println("Submit clicked");
		
		Thread.sleep(20000);
		String succesVld = driver.findElement(By.xpath("//*[@id='wpcf7-f3861-p2905-o1']/form/div[3]")).getText();
		System.out.println("Success Msg: "+succesVld);
		String expectedsuccesVld = "Thank you for your message. It has been sent.";
		Assert.assertEquals(succesVld, expectedsuccesVld);
		System.out.println("Validated the form");
	}
}
