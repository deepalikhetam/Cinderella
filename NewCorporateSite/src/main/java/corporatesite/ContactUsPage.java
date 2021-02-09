package corporatesite;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ContactUsPage extends Browser
{
	static WebDriverWait wait = new WebDriverWait(driver, 50);
	public static void verifyContactUsPage() throws Exception 
	{
		
		Thread.sleep(5000);
		WebElement Navigation=driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span"));

		if(!Navigation.isDisplayed())
		{
			System.out.println("Navigation menu  does not displayed ");
			System.out.println("In web/Landsacpe ");
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("menu-item-3389"))));
			driver.findElement(By.id("menu-item-3389")).click();
			System.out.println("Clicked on Contact Us Page");
			
			Thread.sleep(3000);
			String actualtile = driver.getTitle();
			System.out.println("Pagetitle: "+actualtile);
			
			String expectedtitle = "NGenious Solutions Contact details USA , New York, New Jersey , INDIA, MUMBAI | SharePoint Consultants | Office 365 consultants | SharePoint Experts - NGenious Solutions";
			Assert.assertEquals(actualtile, expectedtitle);
			Thread.sleep(3000);
		
		}
		
		else
			
		{
//			WebElement home=driver.findElement(By.xpath("//*[@id='menu-item-1943']/a/span"));
//			System.out.println("mobile");
//			((JavascriptExecutor) driver).executeScript(
//					"arguments[0].click();", home);
//			System.out.println("Clicked on Home menu in mobile");
			Thread.sleep(3000);

			WebElement Contactus=driver.findElement(By.xpath("//*[@id='menu-item-3389']/a"));

			((JavascriptExecutor) driver).executeScript(
					"arguments[0].click();", Contactus);
			Thread.sleep(5000);
			System.out.println("Clicked on contact Us page in the mobile");
			String actualtile = driver.getTitle();
			System.out.println("Pagetitle: " + actualtile);
			String expectedtitle = "NGenious Solutions Contact details USA , New York, New Jersey , INDIA, MUMBAI | SharePoint Consultants | Office 365 consultants | SharePoint Experts - NGenious Solutions";
			Assert.assertEquals(actualtile, expectedtitle);
			Thread.sleep(3000);
			
			
			
			
		}
	}
	public static void verifyContactUsFormvalidationOnBlank() throws Exception
	{
		Thread.sleep(5000);
		WebElement name = driver.findElement(By.xpath("//*[@id='wpcf7-f3627-p433-o1']/form/div[2]/div/div/span/span/input"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);
		WebElement emailString = driver.findElement(By.xpath("//*[@id='work-email-id']"));
		WebElement number = driver.findElement(By.xpath("//*[@id='wpcf7-f3627-p433-o1']/form/div[4]/div/div/span/span[2]/input"));
		WebElement company = driver.findElement(By.xpath("//*[@id='wpcf7-f3627-p433-o1']/form/div[5]/div/div/span/span/input"));
		WebElement interestat = driver.findElement(By.xpath("//*[@id='Interested']"));
		
		WebElement comment = driver.findElement(By.xpath("//*[@id='wpcf7-f3627-p433-o1']/form/div[7]/div/div/span/span/textarea"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comment);
		
		if(name.isDisplayed() && emailString.isDisplayed() && number.isDisplayed() && company.isDisplayed() && interestat.isDisplayed() && comment.isDisplayed())
		{
			WebElement submit = driver.findElement(By.xpath("//*[@id='btnSubmit']"));
			Thread.sleep(3000);
			submit.click();
			System.out.println("Submit Clicked");
			
			Thread.sleep(5000);
			name = driver.findElement(By.xpath("//*[@id='wpcf7-f3627-p433-o1']/form/div[2]/div/div/span/span/input"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);
			
			Thread.sleep(4000);
			String actualVldMsgName = driver.findElement(By.xpath("//*[@id='wpcf7-f3627-p433-o1']/form/div[2]/div/div/span/span/span")).getText();
			System.out.println("Name: "+actualVldMsgName);
			String expectedVldMsgName = "The field is required.";
			Assert.assertEquals(actualVldMsgName, expectedVldMsgName);
			System.out.println("verified validation for name ");
			
			Thread.sleep(3000);
			String actualVldMsgEmail = driver.findElement(By.xpath("//*[@id='wpcf7-f3627-p433-o1']/form/div[3]/div/div/span[1]/span/span/span")).getText();
			System.out.println("Name: "+actualVldMsgName);
			String expectedVldMsgEmail = "The field is required.";
			Assert.assertEquals(actualVldMsgEmail, expectedVldMsgEmail);
			System.out.println("verified validation for email ");
			
			Thread.sleep(3000);
			String actualVldMsgNumber = driver.findElement(By.xpath("//*[@id='wpcf7-f3627-p433-o1']/form/div[4]/div/div/span/span[2]/span/span")).getText();
			System.out.println("Name: "+actualVldMsgName);
			String expectedVldMsgNumber = "The field is required.";
			Assert.assertEquals(actualVldMsgNumber, expectedVldMsgNumber);
			System.out.println("verified validation for number ");
			
			Thread.sleep(3000);
			String actualVldMsgInterest = driver.findElement(By.xpath("//*[@id='wpcf7-f3627-p433-o1']/form/div[6]/div/div/span/span/span[2]/span")).getText();
			System.out.println("Name: "+actualVldMsgName);
			String expectedVldMsgInterest = "The field is required.";
			Assert.assertEquals(actualVldMsgInterest, expectedVldMsgInterest);
			System.out.println("verified validation for interest ");
			
			Thread.sleep(3000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comment);
			String actualVldMsgComments = driver.findElement(By.xpath("//*[@id='wpcf7-f3627-p433-o1']/form/div[6]/div/div/span/span/span[2]/span")).getText();
			System.out.println("Name: "+actualVldMsgName);
			String expectedVldMsgComments = "The field is required.";
			Assert.assertEquals(actualVldMsgComments, expectedVldMsgComments);
			System.out.println("verified validation for comments ");
			
			Thread.sleep(3000);
			String actualVldMsg = driver.findElement(By.xpath("//*[@id='wpcf7-f3627-p433-o1']/form/div[9]")).getText();
			System.out.println("Name: "+actualVldMsgName);
			String expectedVldMsg = "One or more fields have an error. Please check and try again.";
			Assert.assertEquals(actualVldMsg, expectedVldMsg);
			System.out.println("verified validation for overall ");
			
			driver.navigate().refresh();
			System.out.println("Refreshed the contact US page");
		}
		else
		{
			System.out.println("If loop not entered");
		}
	}
	public static void verfiyContactUsForm() throws Exception
	{
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		WebElement name = driver.findElement(By.xpath("//*[@id='wpcf7-f3627-p433-o1']/form/div[2]/div/div/span/span/input"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);
		Thread.sleep(2000);
		name.sendKeys("Test One demo");
		
		WebElement emailString = driver.findElement(By.xpath("//*[@id='work-email-id']"));
		Thread.sleep(2000);
		emailString.sendKeys("test01@ngenioussolutions.com");
		
		WebElement number = driver.findElement(By.xpath("//*[@id='wpcf7-f3627-p433-o1']/form/div[4]/div/div/span/span[2]/input"));
		Thread.sleep(2000);
		number.sendKeys("987456320");
		
		WebElement company = driver.findElement(By.xpath("//*[@id='wpcf7-f3627-p433-o1']/form/div[5]/div/div/span/span/input"));
		Thread.sleep(2000);
		company.sendKeys("NSPL Pvt. Ltd.");
		
		WebElement interestat = driver.findElement(By.xpath("//*[@id='Interested']"));
		Thread.sleep(2000);
		Select s =new Select(interestat);
		s.selectByIndex(1);
		
		WebElement comment = driver.findElement(By.xpath("//*[@id='wpcf7-f3627-p433-o1']/form/div[7]/div/div/span/span/textarea"));
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
		
		WebElement submit = driver.findElement(By.xpath("//*[@id='btnSubmit']"));
		Thread.sleep(3000);
		submit.click();
		System.out.println("Submit Clicked");
		
		Thread.sleep(20000);
		String actualsucessmsg = driver.findElement(By.xpath("//*[@id='wpcf7-f3627-p433-o1']/form/div[9]")).getText();
		System.out.println("Success Msg: "+actualsucessmsg);
		String expectedsuccessmsg = "Thank you for your message. It has been sent.";
		Assert.assertEquals(actualsucessmsg, expectedsuccessmsg);
		System.out.println("Verified the success msg");
	}
	public static void verifyContactUsStaticFields() throws Exception
	{
		driver.navigate().refresh();
		Thread.sleep(4000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[1]/div/div/div/div/div/section/div/div/div[2]/div/div/div[1]/div/div/div[2]/h4")));
		String USA = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[1]/div/div/div/div/div/section/div/div/div[2]/div/div/div[1]/div/div/div[2]/h4")).getText();
		System.out.println("USA name: "+USA);
		String usa = "U.S.A";
		Assert.assertEquals(USA, usa);
		
		Thread.sleep(2000);
		String USAadd = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[1]/div/div/div/div/div/section/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[1]")).getText().trim();
		System.out.println("USA Address: "+USAadd);
		String usaadd = "30 Knightsbridge Road, Suite 525, Piscataway, New Jersey 08854";
		Assert.assertEquals(USAadd, usaadd);
		
		Thread.sleep(2000);
		String phone= driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[1]/div/div/div/div/div/section/div/div/div[2]/div/div/div[2]/div/div/div[2]/h4")).getText().trim();
		System.out.println("phone: "+phone);
		String phonelabel = "Phone";
		Assert.assertEquals(phonelabel, phonelabel);
		
		Thread.sleep(2000);
		String phonenumber = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[1]/div/div/div/div/div/section/div/div/div[2]/div/div/div[2]/div/div/div[2]/div[1]")).getText().trim();
		System.out.println("phone: "+phonenumber);
		String phonenumberlabel = "+1 (732) 351-2141";
		Assert.assertEquals(phonenumber, phonenumberlabel);
		
		Thread.sleep(2000);
		String email = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[1]/div/div/div/div/div/section/div/div/div[2]/div/div/div[8]/div/div/div[2]/h4")).getText().trim();
		System.out.println("email: "+email);
		String emailexpected = "Email";
		Assert.assertEquals(email, emailexpected);
		
		Thread.sleep(2000);
		String emailID = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[1]/div/div/div/div/div/section/div/div/div[2]/div/div/div[8]/div/div/div[2]/div[1]")).getText().trim();
		System.out.println("phone: "+emailID);
		String emailIDexpected = "sales.in@ngenioussolutions.com";
		Assert.assertEquals(emailID, emailIDexpected);
		
		String root = driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[1]/div/div/div/div/div/section/div/div/div[2]/div/div/div[4]/div/div/div/p/a")).click();
		System.out.println("Google Map URL Opened");
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
		
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[1]/div/div/div/div/div/section/div/div/div[2]/div/div/div[6]/div/div/div[2]/h4")));
		String India = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[1]/div/div/div/div/div/section/div/div/div[2]/div/div/div[6]/div/div/div[2]/h4")).getText();
		System.out.println("India name: "+India);
		String india = "INDIA";
		Assert.assertEquals(India, india);
		
		Thread.sleep(2000);
		String IndiaAdd = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[1]/div/div/div/div/div/section/div/div/div[2]/div/div/div[6]/div/div/div[2]/div[1]")).getText();
		System.out.println("India Add: "+IndiaAdd);
		String indiaAdd = "803, Opal Square IT Park, Plot No. C-1, S.G. Barve Road, Wagle Estate, Thane (W) - 400604";
		Assert.assertEquals(IndiaAdd, indiaAdd);
		
		Thread.sleep(2000);
		String IndiaPhone = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[1]/div/div/div/div/div/section/div/div/div[2]/div/div/div[7]/div/div/div[2]/h4")).getText();
		System.out.println("India Phone: "+IndiaPhone);
		String indiaPhone = "Phone";
		Assert.assertEquals(IndiaPhone, indiaPhone);
		
		Thread.sleep(2000);
		String IndiaNumber = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[1]/div/div/div/div/div/section/div/div/div[2]/div/div/div[7]/div/div/div[2]/div[1]")).getText();
		System.out.println("India Phone: "+IndiaNumber);
		String indiaNumber = "+1 (732) 351-2142";
		Assert.assertEquals(IndiaNumber, indiaNumber);
		
		Thread.sleep(2000);
		String IndiaEmail = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[1]/div/div/div/div/div/section/div/div/div[2]/div/div/div[8]/div/div/div[2]/h4")).getText();
		System.out.println("India Phone: "+IndiaEmail);
		String indiaEmail = "Email";
		Assert.assertEquals(IndiaEmail, indiaEmail);
		
		Thread.sleep(2000);
		String IndiaEmailID = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[1]/div/div/div/div/div/section/div/div/div[2]/div/div/div[8]/div/div/div[2]/div[1]")).getText();
		System.out.println("India Phone: "+IndiaEmailID);
		String indiaEmailID = "sales.in@ngenioussolutions.com";
		Assert.assertEquals(IndiaEmailID, indiaEmailID);
		
		root = driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[1]/div/div/div/div/div/section/div/div/div[2]/div/div/div[9]/div/div/div/p/a")).click();
		System.out.println("Google Map URL Opened");
		Thread.sleep(3000);
		allwindows =driver.getWindowHandles();
		counttab = allwindows.size();
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
		rooturl = driver.getCurrentUrl();
		System.out.println("Root URL: "+rooturl);
		System.out.println("Verfied root URL");
	}
	
	public static void verifyFieldVldMsg() throws Exception
	{
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		WebElement name = driver.findElement(By.xpath("//*[@id='wpcf7-f3627-p433-o1']/form/div[2]/div/div/span/span/input"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);
		Thread.sleep(2000);
		name.sendKeys("Google will check the clicking position on the checkbox Bots click exactly on the center of the checkbox");
		
		WebElement emailString = driver.findElement(By.xpath("//*[@id='work-email-id']"));
		Thread.sleep(2000);
		emailString.sendKeys("Google will check the clicking position on the checkbox Bots click exactly on the center of the checkbox");
		
		Thread.sleep(4000);
		WebElement number = driver.findElement(By.xpath("//*[@id='wpcf7-f3627-p433-o1']/form/div[4]/div/div/span/span[2]/input"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", number);
		Thread.sleep(2000);
		number.sendKeys("9874563210987456");
		
		WebElement company = driver.findElement(By.xpath("//*[@id='wpcf7-f3627-p433-o1']/form/div[5]/div/div/span/span/input"));
		Thread.sleep(2000);
		company.sendKeys("ASDFghjkl");
		
		WebElement comment = driver.findElement(By.xpath("//*[@id='wpcf7-f3627-p433-o1']/form/div[7]/div/div/span/span/textarea"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comment);
		Thread.sleep(2000);
		comment.sendKeys("Google will check the clicking position on the checkbox. Bots click exactly on the center of the checkbox while humans click somewhere on the box. This will help to decide Google whether the user is a human or bot.Google will check the clicking position on the checkbox. Bots click exactly on the center of the checkbox while humans click somewhere on the box. This will help to decide Google whether the user is a human or bot. This will help to decide Google whether the user is a human or bot.This will");
		
		Thread.sleep(4000);
		WebElement submit = driver.findElement(By.xpath("//*[@id='btnSubmit']"));
		Thread.sleep(3000);
		submit.click();
		System.out.println("Submit Clicked");
		
		Thread.sleep(15000);
		name = driver.findElement(By.xpath("//*[@id='wpcf7-f3627-p433-o1']/form/div[2]/div/div/span/span/input"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);
		
		Thread.sleep(3000);
		String actualemailVld = driver.findElement(By.xpath("//*[@id='wpcf7-f3627-p433-o1']/form/div[3]/div/div/span[1]/span/span/span")).getText();
		String expectedemailVld = "The e-mail address entered is invalid.";
		Assert.assertEquals(actualemailVld, expectedemailVld);
		System.out.println("validated the Email validation msg");
		
		Thread.sleep(4000);
		String actualNumberVld = driver.findElement(By.xpath("//*[@id='wpcf7-f3627-p433-o1']/form/div[4]/div/div/span/span[2]/span/span")).getText();
		String expectedNumberVld = "The number is larger than the maximum allowed.";
		Assert.assertEquals(actualNumberVld,expectedNumberVld);
		System.out.println("validated the Number validation msg");
		
		Thread.sleep(3000);
		String actualCompanyVld = driver.findElement(By.xpath("//*[@id='wpcf7-f3627-p433-o1']/form/div[5]/div/div/span/span/span/span")).getText();
		String expectedCompanyVld = "The field is too short.";
		Assert.assertEquals(actualCompanyVld,expectedCompanyVld);
		System.out.println("validated the Company validation msg");
		
	}
}
