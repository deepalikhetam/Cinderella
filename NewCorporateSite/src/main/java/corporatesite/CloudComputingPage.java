package corporatesite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CloudComputingPage extends Browser 
	{
		static WebDriverWait wait = new WebDriverWait(driver, 50);
		static Actions action = new Actions(driver);
		public static void LinksUnderCloudComputingPage() throws Exception 
		{
			WebElement Servicearrow=driver.findElement(By.xpath("//*[@id='menu-item-1948']/span"));

			if(!Servicearrow.isDisplayed())
				
			{
				System.out.println("service arrow does not dislayed ");
				System.out.println("In web/landscape ");

				Thread.sleep(10000);
				WebElement serviceMenu = driver.findElement(By.xpath("//*[@id='menu-item-1948']/a/span"));
				
				action.moveToElement(serviceMenu);
				System.out.println("Moved to Services Menu");
				
				Thread.sleep(10000);
				WebElement MicrosoftAzure = driver.findElement(By.xpath("//*[@id='menu-item-3382']/a/span"));
				action.moveToElement(MicrosoftAzure);
				action.click().build().perform();
				System.out.println("Clicked on Microsoft Azure");

				Thread.sleep(10000);
				String actualtile = driver.getTitle();
				System.out.println("Pagetitle: "+actualtile);
				String expectedTitle = "SharePoint Consultants | Office 365 consultants | SharePoint Experts - NGenious Solutions";
				Assert.assertEquals(actualtile, expectedTitle);
				System.out.println("Verified Microsoft Azure Page");
				
				Thread.sleep(10000);
				WebElement Microsoft365 = driver.findElement(By.xpath("//*[@id='menu-item-1953']/a/span"));
				action.moveToElement(Microsoft365);
				action.click().build().perform();
				System.out.println("Clicked on Microsoft 365");
				
				Thread.sleep(10000);
				String actualtile1 = driver.getTitle();
				System.out.println("Pagetitle: "+actualtile1);
				String expectedTitle1 = "About Microsoft 365 Services - NGenious Solutions | SharePoint Consultants | Office 365 consultants | SharePoint Experts - NGenious Solutions";
				//fail
				
				Assert.assertEquals(actualtile1, expectedTitle1);
				System.out.println("Verified Microsoft 365 Page");
				
				Thread.sleep(10000);
				WebElement AmazonWebServices = driver.findElement(By.xpath("//*[@id='menu-item-1954']/a/span"));
				action.moveToElement(AmazonWebServices);
				action.click().build().perform();
				System.out.println("Clicked on Amazon Web Services");
				
				Thread.sleep(10000);
				String actualtile2 = driver.getTitle();
				System.out.println("Pagetitle: "+actualtile2);
				String expectedTitle2 = "About Microsoft 365 Services - NGenious Solutions | SharePoint Consultants | Office 365 consultants | SharePoint Experts - NGenious Solutions";
				Assert.assertEquals(actualtile2, expectedTitle2);
				System.out.println("Verified Amazon Web Services Page");
			}
			else
			{
				System.out.println("Service arrow does  displayed");
				System.out.println("In mobile ");
			
				WebElement Cloudcomputingarroww =driver.findElement(By.xpath("//*[@class='sub-menu megamenu-item-inited open']/li[1]//*[@class='swm-mini-menu-arrow']"));
				
				Cloudcomputingarroww.click();
				System.out.println("Clicked Cloud computing  arrow ");
				Thread.sleep(2000);
				WebElement MicrosoftAzurePage = driver.findElement(By
						.xpath("//*[@id='menu-item-1950']/a/span"));

				((JavascriptExecutor) driver).executeScript(
						"arguments[0].click();", MicrosoftAzurePage);
				System.out.println("Clicked on Microsoft Azure Page in the mobile");
				Thread.sleep(10000);
			
				String actualtile = driver.getTitle();
				System.out.println("Pagetitle: "+actualtile);
				String expectedTitle = "About Microsoft Azure Cloud Services by NGenious Solutions | SharePoint Consultants | Office 365 consultants | SharePoint Experts - NGenious Solutions";
				Assert.assertEquals(actualtile, expectedTitle);
				System.out.println("Verified Microsoft Azure Page");
			
				
				
				
				
				
				Thread.sleep(5000);

				driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span")).click();
				System.out.println("Clicked on Navigatin menu");

				
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id='menu-item-1948']/span")).click();
				System.out.println("Clicked services arrow ");
				
				Thread.sleep(2000);
				Cloudcomputingarroww = driver.findElement(By.xpath("//*[@class='sub-menu megamenu-item-inited open']/li[1]//*[@class='swm-mini-menu-arrow']"));
	
				Cloudcomputingarroww.click();
				System.out.println("Clicked Cloud computing  arrow ");
				Thread.sleep(2000);
				WebElement Microsoft365 = driver.findElement(By.xpath("//*[@id='menu-item-1953']/a/span"));
	
				((JavascriptExecutor) driver).executeScript(
						"arguments[0].click();", Microsoft365);
				System.out.println("Clicked on  Microsoft365 page in the mobile");
				Thread.sleep(10000);
	
				actualtile = driver.getTitle();
				System.out.println("Pagetitle: " + actualtile);
				expectedTitle = "About Microsoft 365 Services - NGenious Solutions | SharePoint Consultants | Office 365 consultants | SharePoint Experts - NGenious Solutions";
				Assert.assertEquals(actualtile, expectedTitle);
//				System.out.println("Verified Microsoft365 Page");
			
				
				
				
				Thread.sleep(5000);

				driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span")).click();
				System.out.println("Clicked on Navigatin menu");

				
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id='menu-item-1948']/span")).click();
				System.out.println("Clicked services arrow ");
				
				Thread.sleep(2000);
				 Cloudcomputingarroww = driver.findElement(By.xpath("//*[@class='sub-menu megamenu-item-inited open']/li[1]//*[@class='swm-mini-menu-arrow']"));
	
				Cloudcomputingarroww.click();
				System.out.println("Clicked Cloud computing  arrow ");
				Thread.sleep(2000);
				WebElement AmazonWebServices = driver.findElement(By
						.xpath("//*[@id='menu-item-1954']/a/span"));

				((JavascriptExecutor) driver).executeScript(
						"arguments[0].click();", AmazonWebServices);
			
				
				
				System.out.println("Clicked on Amazon Web Services Page in mobile");

				 actualtile = driver.getTitle();
				System.out.println("Pagetitle: " + actualtile);
				
			}

		}
		
		public  static void VerifyMicrosoftAzurePage() throws Exception
		{
			WebElement Servicearrow=driver.findElement(By.xpath("//*[@id='menu-item-1948']/span"));

			if(!Servicearrow.isDisplayed())
				
			{
				System.out.println("service arrow does not  dislayed ");
				System.out.println("In web/Portrait ");

				Thread.sleep(3000);
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("menu-item-1948"))));
					//	driver.findElement(By.id("menu-item-3389")).click();
				System.out.println("wait");
				WebElement item =driver.findElement(By.id("menu-item-1948"));
				System.out.println("item");
				item.click();
//				Actions action =new Actions(driver);
//				action.moveToElement(item).perform();
//				System.out.println("perform");
				Thread.sleep(3000);
				driver.findElement(By.id("menu-item-1950")).click();
				System.out.println("Clicked on Microsoft Azure Page ");
				String actualtile = driver.getTitle();
				System.out.println("Pagetitle: "+actualtile);
				
			
				
			}
			
			else
			{
				System.out.println("Service arrow does  displayed");

				System.out.println("In mobile ");
				WebElement MicrosoftAzurePage = driver.findElement(By
						.xpath("//*[@id='menu-item-1950']/a/span"));

				((JavascriptExecutor) driver).executeScript(
						"arguments[0].click();", MicrosoftAzurePage);
				System.out.println("Clicked on Microsoft Azure Page in the mobile");

				String actualtile = driver.getTitle();
				System.out.println("Pagetitle: " + actualtile);
				
				
				
				



			}
		}
		public static void VerifyMicrosoftAzurePage_FormvalidationOnBlank() throws Exception
		{
			Thread.sleep(5000);
			WebElement name = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2084-o1\"]/form/div[2]/div[1]/div/div/span/span/input"));
			
																				//*[@id="wpcf7-f3861-p3563-o1"]/form/div[2]/div[1]/div/div/span/span/input
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);
			
			
			
			WebElement emailString = driver.findElement(By.xpath("//*[@id='work-email-id']"));
			WebElement number = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2084-o1\"]/form/div[2]/div[3]/div/div/span/span[2]/input"));
			WebElement company = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2084-o1\"]/form/div[2]/div[4]/div/div/span/span/input"));			Thread.sleep(2000);
			
			WebElement comment = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2084-o1\"]/form/div[2]/div[5]/div/div/span/span/textarea"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comment);
			
			if(name.isDisplayed() && emailString.isDisplayed() && number.isDisplayed() && company.isDisplayed()  && comment.isDisplayed())
			{
				WebElement submit = driver.findElement(By.xpath("//*[@id='btnSubmit']"));
				Thread.sleep(3000);
				submit.click();
				System.out.println("Submit Clicked");
				
				Thread.sleep(5000);
				name = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2084-o1\"]/form/div[2]/div[1]/div/div/span/span/input"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);
				
				Thread.sleep(4000);
				String actualVldMsgName = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2084-o1\"]/form/div[2]/div[1]/div/div/span/span/span/span")).getText();
				
																	//*[@id="wpcf7-f3861-p2916-o1"]/form/div[2]/div[1]/div/div/span/span/span/span
				System.out.println("NameActualMessage: "+actualVldMsgName);
				String expectedVldMsgName = "The field is required.";
				Assert.assertEquals(actualVldMsgName, expectedVldMsgName);
				System.out.println("verified validation for name ");
				
				Thread.sleep(3000);
				String actualVldMsgEmail = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2084-o1\"]/form/div[2]/div[2]/div/div/span[1]/span/span/span")).getText();
				System.out.println("emailActualMessage: "+actualVldMsgName);
				String expectedVldMsgEmail = "The field is required.";
				Assert.assertEquals(actualVldMsgEmail, expectedVldMsgEmail);
				System.out.println("verified validation for email ");
				
				Thread.sleep(3000);
				String actualVldMsgNumber = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2084-o1\"]/form/div[2]/div[3]/div/div/span/span[2]/span/span")).getText();
				System.out.println("NumberActualMessage: "+actualVldMsgName);
				String expectedVldMsgNumber = "The field is required.";
				Assert.assertEquals(actualVldMsgNumber, expectedVldMsgNumber);
				System.out.println("verified validation for number ");
				
				
				Thread.sleep(3000);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comment);
				String actualVldMsgComments = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2084-o1\"]/form/div[2]/div[5]/div/div/span/span/span/span")).getText();
				System.out.println("commentsActualMessage: "+actualVldMsgName);
				String expectedVldMsgComments = "The field is required.";
				Assert.assertEquals(actualVldMsgComments, expectedVldMsgComments);
				System.out.println("verified validation for comments ");
//				
				Thread.sleep(3000);
				String actualVldMsgInterest = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2084-o1\"]/form/div[2]/div[4]/div/div/span/span/span/span")).getText();
				System.out.println("CompanytActualMessage: "+actualVldMsgName);
				String expectedVldMsgInterest = "The field is required.";
				Assert.assertEquals(actualVldMsgInterest, expectedVldMsgInterest);
				System.out.println("verified validation for company ");

			}
			else
			{
				System.out.println("If loop not entered");
			}
		}
		
		public static void verifyMicrosoftAzure_Form() throws Exception
		{
			Thread.sleep(2000);
			driver.navigate().refresh();
			
			Thread.sleep(5000);
			WebElement name = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2084-o1\"]/form/div[2]/div[1]/div/div/span/span/input"));	
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);
			Thread.sleep(2000);
			name.sendKeys("Test One demo");
			
			WebElement emailString = driver.findElement(By.xpath("//*[@id='work-email-id']"));
			Thread.sleep(2000);
			emailString.sendKeys("test01@ngenioussolutions.com");
			
			WebElement number = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2084-o1\"]/form/div[2]/div[3]/div/div/span/span[2]/input"));
			number.sendKeys("987456320");
			
			WebElement company = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2084-o1\"]/form/div[2]/div[4]/div/div/span/span/input"));			Thread.sleep(2000);
			company.sendKeys("NSPL Pvt. Ltd.");

			WebElement comment = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2084-o1\"]/form/div[2]/div[5]/div/div/span/span/textarea"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comment);
			Thread.sleep(2000);
			comment.sendKeys("Values entered in comments Values entered in comments");
			
			WebElement submit = driver.findElement(By.xpath("//*[@id='btnSubmit']"));
			Thread.sleep(3000);
			submit.click();
			System.out.println("Submit Clicked");
			
			Thread.sleep(20000);
			
			String actualsucessmsg = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2084-o1\"]/form/div[3]")).getText();
			
			System.out.println("Success Msg: "+actualsucessmsg);
			String expectedsuccessmsg = "Thank you for your message. It has been sent.";
			Assert.assertEquals(actualsucessmsg, expectedsuccessmsg);
			System.out.println("Verified the success msg");
		}

		public static void VerifyMicrosoftAzure_VldMsg() throws Exception
		{
			Thread.sleep(2000);
			driver.navigate().refresh();
			
			Thread.sleep(5000);
			WebElement name = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2084-o1\"]/form/div[2]/div[1]/div/div/span/span/input"));	
		
															//*[@id="wpcf7-f3861-p2916-o1"]/form/div[2]/div[1]/div/div/span/span/input
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);
			Thread.sleep(2000);
			name.sendKeys("Google will check the clicking position on the checkbox Bots click exactly on the center of the checkbox");
			
			WebElement emailString = driver.findElement(By.xpath("//*[@id='work-email-id']"));
			Thread.sleep(2000);
			emailString.sendKeys("Google will check the clicking position on the checkbox Bots click exactly on the center of the checkbox");
			
			Thread.sleep(4000);
			WebElement number = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2084-o1\"]/form/div[2]/div[3]/div/div/span/span[2]/input"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", number);
			Thread.sleep(2000);
			number.sendKeys("9874563210987456");
			
			WebElement company = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2084-o1\"]/form/div[2]/div[4]/div/div/span/span/input"));
			Thread.sleep(2000);
			company.sendKeys("ASDFghjkl");
			
			WebElement comment = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2084-o1\"]/form/div[2]/div[5]/div/div/span/span/textarea"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comment);
			Thread.sleep(2000);
			comment.sendKeys("Google will check the clicking position on the checkbox. Bots click exactly on the center of the checkbox while humans click somewhere on the box. This will help to decide Google whether the user is a human or bot.Google will check the clicking position on the checkbox. Bots click exactly on the center of the checkbox while humans click somewhere on the box. This will help to decide Google whether the user is a human or bot. This will help to decide Google whether the user is a human or bot.This will");
			
			Thread.sleep(4000);
			WebElement submit = driver.findElement(By.xpath("//*[@id='btnSubmit']"));
			Thread.sleep(3000);
			submit.click();
			System.out.println("Submit Clicked");
			
			Thread.sleep(15000);
			name = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2084-o1\"]/form/div[2]/div[1]/div/div/span/span/input"));	
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);
			System.out.println("name");

			Thread.sleep(5000);
			String actualemailVld = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2084-o1\"]/form/div[2]/div[2]/div/div/span[1]/span/span/span")).getText();
			                                                  
			String expectedemailVld = "The e-mail address entered is invalid.";
			Assert.assertEquals(actualemailVld, expectedemailVld);
			System.out.println("validated the Email validation msg");
//			
			Thread.sleep(4000);
			String actualNumberVld = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2084-o1\"]/form/div[2]/div[3]/div/div/span/span[2]/span/span")).getText();
			
			
																//*[@id="wpcf7-f3861-p3275-o1"]/form/div[2]/div[3]/div/div/span/span[2]/span/span
			String expectedNumberVld = "The number is larger than the maximum allowed.";
			Assert.assertEquals(actualNumberVld,expectedNumberVld);
			System.out.println("validated the Number validation msg");
			
			Thread.sleep(5000);                                    
			String actualCompanyVld = driver.findElement(By.xpath(" //*[@id=\"wpcf7-f3861-p2084-o1\"]/form/div[2]/div[4]/div/div/span/span/span/span")).getText();
		
																	//*[@id="wpcf7-f3861-p3275-o1"]/form/div[2]/div[4]/div/div/span/span/span/span
			String expectedCompanyVld = "The field is too short.";
			Assert.assertEquals(actualCompanyVld,expectedCompanyVld);
			System.out.println("validated the Company validation msg");
			
		}
		
		public  static void VerifyMicrosoft365Page() throws Exception
		{
			WebElement Servicearrow=driver.findElement(By.xpath("//*[@id='menu-item-1948']/span"));
			if(!Servicearrow.isDisplayed())
				
			{
				System.out.println("service arrow does not  dislayed ");
				System.out.println("In web/Portrait ");

				Thread.sleep(3000);
				
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("menu-item-1948"))));
					//	driver.findElement(By.id("menu-item-3389")).click();
				System.out.println("wait");
	
				WebElement item =driver.findElement(By.id("menu-item-1948"));
	
	
				System.out.println("item");
				item.click();
				Thread.sleep(3000);
				
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("menu-item-1948"))));
				System.out.println("wait");
//				Actions action =new Actions(driver);
//				action.moveToElement(item).perform();
//				System.out.println("perform");
				Thread.sleep(3000);
	
				driver.findElement(By.id("menu-item-1953")).click();
				System.out.println("Clicked on Microsoft 365 Page");
				
				String actualtile = driver.getTitle();
				System.out.println("Pagetitle: "+actualtile);
			}
				
			else
			{
				System.out.println("Service arrow does  displayed");

				System.out.println("In mobile ");

				WebElement Databasepagemobile = driver.findElement(By
						.xpath("//*[@id='menu-item-1953']/a/span"));

				((JavascriptExecutor) driver).executeScript(
						"arguments[0].click();", Databasepagemobile);
				
				System.out.println("Clicked on Microsoft 365 Page in the mobile");

				String actualtile = driver.getTitle();
				System.out.println("Pagetitle: " + actualtile);
				
	


				
				
			}
		}
		public static void VerifyMicrosoft365Page_FormvalidationOnBlank() throws Exception
		{
			Thread.sleep(5000);
			WebElement name = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2232-o1\"]/form/div[2]/div[1]/div/div/span/span/input"));
			
																				//*[@id="wpcf7-f3861-p3563-o1"]/form/div[2]/div[1]/div/div/span/span/input
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);
			
			
			
			WebElement emailString = driver.findElement(By.xpath("//*[@id='work-email-id']"));
			WebElement number = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2232-o1\"]/form/div[2]/div[3]/div/div/span/span[2]/input"));
			WebElement company = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2232-o1\"]/form/div[2]/div[4]/div/div/span/span/input"));		
			Thread.sleep(2000);
			
			WebElement comment = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2232-o1\"]/form/div[2]/div[5]/div/div/span/span/textarea"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comment);
			
			if(name.isDisplayed() && emailString.isDisplayed() && number.isDisplayed() && company.isDisplayed()  && comment.isDisplayed())
			{
				WebElement submit = driver.findElement(By.xpath("//*[@id='btnSubmit']"));
				Thread.sleep(3000);
				submit.click();
				System.out.println("Submit Clicked");
				
				Thread.sleep(5000);
				name = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2232-o1\"]/form/div[2]/div[1]/div/div/span/span"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);
				
				Thread.sleep(8000);
				String actualVldMsgName = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2232-o1\"]/form/div[2]/div[1]/div/div/span/span/span/span")).getText();
				System.out.println("NameActualMessage: "+actualVldMsgName);
				
				String expectedVldMsgName = "The field is required.";
				Assert.assertEquals(actualVldMsgName, expectedVldMsgName);
				System.out.println("verified validation for name ");
				
				Thread.sleep(3000);
				String actualVldMsgEmail = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2232-o1\"]/form/div[2]/div[2]/div/div/span[1]/span/span/span")).getText();
				System.out.println("emailActualMessage: "+actualVldMsgName);
				String expectedVldMsgEmail = "The field is required.";
				Assert.assertEquals(actualVldMsgEmail, expectedVldMsgEmail);
				System.out.println("verified validation for email ");
				
				Thread.sleep(3000);
				String actualVldMsgNumber = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2232-o1\"]/form/div[2]/div[3]/div/div/span/span[2]/span/span")).getText();
				System.out.println("NumberActualMessage: "+actualVldMsgName);
				String expectedVldMsgNumber = "The field is required.";
				Assert.assertEquals(actualVldMsgNumber, expectedVldMsgNumber);
				System.out.println("verified validation for number ");
				
				
				Thread.sleep(3000);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comment);
				String actualVldMsgComments = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2232-o1\"]/form/div[2]/div[5]/div/div/span/span/span/span")).getText();
				System.out.println("commentsActualMessage: "+actualVldMsgName);
				String expectedVldMsgComments = "The field is required.";
				Assert.assertEquals(actualVldMsgComments, expectedVldMsgComments);
				System.out.println("verified validation for comments ");
//				
				Thread.sleep(3000);
				String actualVldMsgInterest = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2232-o1\"]/form/div[2]/div[4]/div/div/span/span/span/span")).getText();
				System.out.println("CompanytActualMessage: "+actualVldMsgName);
				String expectedVldMsgInterest = "The field is required.";
				Assert.assertEquals(actualVldMsgInterest, expectedVldMsgInterest);
				System.out.println("verified validation for company ");

			}
			else
			{
				System.out.println("If loop not entered");
			}
		}
		public static void verifyMicrosoft365_Form() throws Exception
		{
			Thread.sleep(2000);
			driver.navigate().refresh();
			
			Thread.sleep(5000);
			WebElement name = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2232-o1\"]/form/div[2]/div[1]/div/div/span/span/input"));	
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);
			Thread.sleep(2000);
			name.sendKeys("Test One demo");
			
			WebElement emailString = driver.findElement(By.xpath("//*[@id='work-email-id']"));
			Thread.sleep(2000);
			emailString.sendKeys("test01@ngenioussolutions.com");
			
			WebElement number = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2232-o1\"]/form/div[2]/div[3]/div/div/span/span[2]/input"));
			number.sendKeys("987456320");
			
			WebElement company = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2232-o1\"]/form/div[2]/div[4]/div/div/span/span/input"));			
			Thread.sleep(2000);
			company.sendKeys("NSPL Pvt. Ltd.");

			WebElement comment = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2232-o1\"]/form/div[2]/div[5]/div/div/span/span/textarea"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comment);
			Thread.sleep(2000);
			comment.sendKeys("Values entered in comments Values entered in comments");
			
			WebElement submit = driver.findElement(By.xpath("//*[@id='btnSubmit']"));
			Thread.sleep(3000);
			submit.click();
			System.out.println("Submit Clicked");
			
			Thread.sleep(20000);
			
			String actualsucessmsg = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2232-o1\"]/form/div[3]")).getText();
			
			System.out.println("Success Msg: "+actualsucessmsg);
			String expectedsuccessmsg = "Thank you for your message. It has been sent.";
			Assert.assertEquals(actualsucessmsg, expectedsuccessmsg);
			System.out.println("Verified the success msg");
		}

		public static void VerifyMicrosoft365_VldMsg() throws Exception
		{
			Thread.sleep(2000);
			driver.navigate().refresh();
			
			Thread.sleep(5000);
			WebElement name = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2232-o1\"]/form/div[2]/div[1]/div/div/span/span/input"));	
		
															//*[@id="wpcf7-f3861-p2916-o1"]/form/div[2]/div[1]/div/div/span/span/input
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);
			Thread.sleep(2000);
			name.sendKeys("Google will check the clicking position on the checkbox Bots click exactly on the center of the checkbox");
			
			WebElement emailString = driver.findElement(By.xpath("//*[@id='work-email-id']"));
			Thread.sleep(2000);
			emailString.sendKeys("Google will check the clicking position on the checkbox Bots click exactly on the center of the checkbox");
			
			Thread.sleep(4000);
			WebElement number = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2232-o1\"]/form/div[2]/div[3]/div/div/span/span[2]/input"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", number);
			Thread.sleep(2000);
			number.sendKeys("9874563210987456");
			
			WebElement company = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2232-o1\"]/form/div[2]/div[4]/div/div/span/span/input"));			
			Thread.sleep(2000);
			company.sendKeys("ASDFghjkl");
			
			WebElement comment = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2232-o1\"]/form/div[2]/div[5]/div/div/span/span/textarea"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comment);
			Thread.sleep(2000);
			comment.sendKeys("Google will check the clicking position on the checkbox. Bots click exactly on the center of the checkbox while humans click somewhere on the box. This will help to decide Google whether the user is a human or bot.Google will check the clicking position on the checkbox. Bots click exactly on the center of the checkbox while humans click somewhere on the box. This will help to decide Google whether the user is a human or bot. This will help to decide Google whether the user is a human or bot.This will");
			
			Thread.sleep(4000);
			WebElement submit = driver.findElement(By.xpath("//*[@id='btnSubmit']"));
			Thread.sleep(3000);
			submit.click();
			System.out.println("Submit Clicked");
			
			Thread.sleep(15000);
			name = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2232-o1\"]/form/div[2]/div[1]/div/div/span/span/input"));	
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);
			System.out.println("name");

			Thread.sleep(15000);                                  
			String actualemailVld = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2232-o1\"]/form/div[2]/div[2]/div/div/span[1]/span/span/span")).getText();
            System.out.println(actualemailVld);                                         
			String expectedemailVld = "The e-mail address entered is invalid.";
			Assert.assertEquals(actualemailVld, expectedemailVld);
			System.out.println("validated the Email validation msg");
		
			Thread.sleep(4000);
			String actualNumberVld = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2232-o1\"]/form/div[2]/div[3]/div/div/span/span[2]/span/span")).getText();
															//*[@id="wpcf7-f3861-p3275-o1"]/form/div[2]/div[3]/div/div/span/span[2]/span/span
			String expectedNumberVld = "The number is larger than the maximum allowed.";
			Assert.assertEquals(actualNumberVld,expectedNumberVld);
			System.out.println("validated the Number validation msg");
			
			Thread.sleep(5000);                                    
			String actualCompanyVld = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2232-o1\"]/form/div[2]/div[4]/div/div/span/span/span/span")).getText();
		
																	//*[@id="wpcf7-f3861-p3275-o1"]/form/div[2]/div[4]/div/div/span/span/span/span
			String expectedCompanyVld = "The field is too short.";
			Assert.assertEquals(actualCompanyVld,expectedCompanyVld);
			System.out.println("validated the Company validation msg");
		}
		
		public  static void VerifyAmazonWebServicesPage() throws Exception
		{
			
			WebElement Servicearrow=driver.findElement(By.xpath("//*[@id='menu-item-1948']/span"));

			if(!Servicearrow.isDisplayed())
				
			{
					System.out.println("service arrow does not  dislayed ");
					System.out.println("In web/Portrait ");
	
					Thread.sleep(3000);
					
					wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("menu-item-1948"))));
						//	driver.findElement(By.id("menu-item-3389")).click();
					System.out.println("wait");
		
					WebElement item =driver.findElement(By.id("menu-item-1948"));
					System.out.println("item");
					item.click();
					Thread.sleep(3000);
//					System.out.println("item");
//					Actions action =new Actions(driver);
//					action.moveToElement(item).perform();
//					System.out.println("perform");
					Thread.sleep(3000);
		
					driver.findElement(By.id("menu-item-1954")).click();
					System.out.println("Clicked on Amazon Web Services Page");
					
					String actualtile = driver.getTitle();
					System.out.println("Pagetitle: "+actualtile);
			
			
			}
				
				else
				{
					System.out.println("Service arrow does  displayed");

					System.out.println("In mobile ");
					WebElement AmazonWebServices = driver.findElement(By
							.xpath("//*[@id='menu-item-1954']/a/span"));

					((JavascriptExecutor) driver).executeScript(
							"arguments[0].click();", AmazonWebServices);
				
					
					
					System.out.println("Clicked on Amazon Web Services Page in mobile");

					String actualtile = driver.getTitle();
					System.out.println("Pagetitle: " + actualtile);
					
		

				}
		}
		
		public static void VerifyAmazonWebServices_FormvalidationOnBlank() throws Exception
		{
			Thread.sleep(5000);
			WebElement name = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2333-o1\"]/form/div[2]/div[1]/div/div/span/span/input"));
			
																				//*[@id="wpcf7-f3861-p3563-o1"]/form/div[2]/div[1]/div/div/span/span/input
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);
			
			
			
			WebElement emailString = driver.findElement(By.xpath("//*[@id='work-email-id']"));
			WebElement number = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2333-o1\"]/form/div[2]/div[3]/div/div/span/span[2]/input"));
			WebElement company = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2333-o1\"]/form/div[2]/div[4]/div/div/span/span/input"));		
			Thread.sleep(2000);
			
			WebElement comment = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2333-o1\"]/form/div[2]/div[5]/div/div/span/span/textarea"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comment);
			
			if(name.isDisplayed() && emailString.isDisplayed() && number.isDisplayed() && company.isDisplayed()  && comment.isDisplayed())
			{
				WebElement submit = driver.findElement(By.xpath("//*[@id='btnSubmit']"));
				Thread.sleep(3000);
				submit.click();
				System.out.println("Submit Clicked");
				
				Thread.sleep(5000);
				name = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2333-o1\"]/form/div[2]/div[1]/div/div/span/span"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);
				
				Thread.sleep(8000);
				String actualVldMsgName = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2333-o1\"]/form/div[2]/div[1]/div/div/span/span/span/span")).getText();
				System.out.println("NameActualMessage: "+actualVldMsgName);
				
				String expectedVldMsgName = "The field is required.";
				Assert.assertEquals(actualVldMsgName, expectedVldMsgName);
				System.out.println("verified validation for name ");
				
				Thread.sleep(3000);
				String actualVldMsgEmail = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2333-o1\"]/form/div[2]/div[2]/div/div/span[1]/span/span/span")).getText();
				System.out.println("emailActualMessage: "+actualVldMsgName);
				String expectedVldMsgEmail = "The field is required.";
				Assert.assertEquals(actualVldMsgEmail, expectedVldMsgEmail);
				System.out.println("verified validation for email ");
				
				Thread.sleep(3000);
				String actualVldMsgNumber = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2333-o1\"]/form/div[2]/div[3]/div/div/span/span[2]/span/span")).getText();
				System.out.println("NumberActualMessage: "+actualVldMsgName);
				String expectedVldMsgNumber = "The field is required.";
				Assert.assertEquals(actualVldMsgNumber, expectedVldMsgNumber);
				System.out.println("verified validation for number ");
				
				
				Thread.sleep(3000);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comment);
				String actualVldMsgComments = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2333-o1\"]/form/div[2]/div[5]/div/div/span/span/span/span")).getText();
				System.out.println("commentsActualMessage: "+actualVldMsgName);
				String expectedVldMsgComments = "The field is required.";
				Assert.assertEquals(actualVldMsgComments, expectedVldMsgComments);
				System.out.println("verified validation for comments ");
//				
				Thread.sleep(3000);
				String actualVldMsgInterest = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2333-o1\"]/form/div[2]/div[4]/div/div/span/span/span/span")).getText();
				System.out.println("CompanytActualMessage: "+actualVldMsgName);
				String expectedVldMsgInterest = "The field is required.";
				Assert.assertEquals(actualVldMsgInterest, expectedVldMsgInterest);
				System.out.println("verified validation for company ");

			}
			else
			{
				System.out.println("If loop not entered");
			}
		}
		public static void verifyAmazonWebServices_Form() throws Exception
		{
			Thread.sleep(2000);
			driver.navigate().refresh();
			
			Thread.sleep(5000);
			WebElement name = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2333-o1\"]/form/div[2]/div[1]/div/div/span/span/input"));	
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);
			Thread.sleep(2000);
			name.sendKeys("Test One demo");
			
			WebElement emailString = driver.findElement(By.xpath("//*[@id='work-email-id']"));
			Thread.sleep(2000);
			emailString.sendKeys("test01@ngenioussolutions.com");
			
			WebElement number = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2333-o1\"]/form/div[2]/div[3]/div/div/span/span[2]/input"));
			number.sendKeys("987456320");
			
			WebElement company = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2333-o1\"]/form/div[2]/div[4]/div/div/span/span/input"));			
			Thread.sleep(2000);
			company.sendKeys("NSPL Pvt. Ltd.");

			WebElement comment = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2333-o1\"]/form/div[2]/div[5]/div/div/span/span/textarea"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comment);
			Thread.sleep(2000);
			comment.sendKeys("Values entered in comments Values entered in comments");
			
			WebElement submit = driver.findElement(By.xpath("//*[@id='btnSubmit']"));
			Thread.sleep(3000);
			submit.click();
			System.out.println("Submit Clicked");
			
			Thread.sleep(20000);
			
			String actualsucessmsg = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2333-o1\"]/form/div[3]")).getText();
			
			System.out.println("Success Msg: "+actualsucessmsg);
			String expectedsuccessmsg = "Thank you for your message. It has been sent.";
			Assert.assertEquals(actualsucessmsg, expectedsuccessmsg);
			System.out.println("Verified the success msg");
		}
		
		public static void VerifyAmazonWebServices_VldMsg() throws Exception
		{
			Thread.sleep(2000);
			driver.navigate().refresh();
			
			Thread.sleep(5000);
			WebElement name = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2333-o1\"]/form/div[2]/div[1]/div/div/span/span/input"));	
		
															//*[@id="wpcf7-f3861-p2916-o1"]/form/div[2]/div[1]/div/div/span/span/input
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);
			Thread.sleep(2000);
			name.sendKeys("Google will check the clicking position on the checkbox Bots click exactly on the center of the checkbox");
			
			WebElement emailString = driver.findElement(By.xpath("//*[@id='work-email-id']"));
			Thread.sleep(2000);
			emailString.sendKeys("Google will check the clicking position on the checkbox Bots click exactly on the center of the checkbox");
			
			Thread.sleep(4000);
			WebElement number = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2333-o1\"]/form/div[2]/div[3]/div/div/span/span[2]/input"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", number);
			Thread.sleep(2000);
			number.sendKeys("9874563210987456");
			
			WebElement company = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2333-o1\"]/form/div[2]/div[4]/div/div/span/span/input"));			
			Thread.sleep(2000);
			company.sendKeys("ASDFghjkl");
			
			WebElement comment = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2333-o1\"]/form/div[2]/div[5]/div/div/span/span/textarea"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comment);
			Thread.sleep(2000);
			comment.sendKeys("Google will check the clicking position on the checkbox. Bots click exactly on the center of the checkbox while humans click somewhere on the box. This will help to decide Google whether the user is a human or bot.Google will check the clicking position on the checkbox. Bots click exactly on the center of the checkbox while humans click somewhere on the box. This will help to decide Google whether the user is a human or bot. This will help to decide Google whether the user is a human or bot.This will");
			
			Thread.sleep(4000);
			WebElement submit = driver.findElement(By.xpath("//*[@id='btnSubmit']"));
			Thread.sleep(3000);
			submit.click();
			System.out.println("Submit Clicked");
			
			Thread.sleep(15000);
			name = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2333-o1\"]/form/div[2]/div[1]/div/div/span/span/input"));	
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);
			System.out.println("name");

			Thread.sleep(15000);                                 
			String actualemailVld = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2333-o1\"]/form/div[2]/div[2]/div/div/span[1]/span/span/span")).getText();
            System.out.println(actualemailVld);                                         
			String expectedemailVld = "The e-mail address entered is invalid.";
			Assert.assertEquals(actualemailVld, expectedemailVld);
			System.out.println("validated the Email validation msg");
		
			Thread.sleep(4000);
			String actualNumberVld = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2333-o1\"]/form/div[2]/div[3]/div/div/span/span[2]/span/span")).getText();
															//*[@id="wpcf7-f3861-p3275-o1"]/form/div[2]/div[3]/div/div/span/span[2]/span/span
			String expectedNumberVld = "The number is larger than the maximum allowed.";
			Assert.assertEquals(actualNumberVld,expectedNumberVld);
			System.out.println("validated the Number validation msg");
			
			Thread.sleep(5000);                                    
			String actualCompanyVld = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3861-p2333-o1\"]/form/div[2]/div[4]/div/div/span/span/span/span")).getText();
		
																	//*[@id="wpcf7-f3861-p3275-o1"]/form/div[2]/div[4]/div/div/span/span/span/span
			String expectedCompanyVld = "The field is too short.";
			Assert.assertEquals(actualCompanyVld,expectedCompanyVld);
			System.out.println("validated the Company validation msg");
		}
		

	}