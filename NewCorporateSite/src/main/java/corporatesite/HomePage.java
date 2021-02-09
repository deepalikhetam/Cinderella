package corporatesite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage extends Browser
{
	static WebDriverWait wait = new WebDriverWait(driver, 50);
	public static void verifyHomePage() throws Exception
	{
		Thread.sleep(5000);
		WebElement Navigation=driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span"));

		if(!Navigation.isDisplayed())
			{
			System.out.println("Navigation menu  does not displayed ");
			System.out.println("In web/Landsacpe ");
			driver.findElement(By.xpath("//*[@id='menu-item-1943']")).click();
			System.out.println("Clicked on Home Menu");
			
			Thread.sleep(5000);
			String actualtile = driver.getTitle();
			System.out.println("Pagetitle: "+actualtile);
			
			String expectedTitle = "SharePoint Consultants | Office 365 consultants | SharePoint Experts - NGenious Solutions";
			Assert.assertEquals(actualtile, expectedTitle);
			Thread.sleep(5000);
		
			}
		else
		{
			Thread.sleep(3000);

			WebElement Home=driver.findElement(By.xpath("//*[@id='menu-item-1943']/a"));

			((JavascriptExecutor) driver).executeScript(
					"arguments[0].click();", Home);
			Thread.sleep(5000);
			System.out.println("Clicked on Home page in the mobile");
			String actualtile = driver.getTitle();
			System.out.println("Pagetitle: " + actualtile);
			String expectedTitle = "SharePoint Consultants | Office 365 consultants | SharePoint Experts - NGenious Solutions";
			Assert.assertEquals(actualtile, expectedTitle);
			Thread.sleep(3000);
		}
	}
	public  static void verfiyMenus() throws Exception
	{
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='menu-item-1944']/a/span")).click();
		System.out.println("Clicked on Adout Us Menu");
		Thread.sleep(5000);
		String actualtileAboutUs = driver.getTitle();
		System.out.println("Pagetitle: "+actualtileAboutUs);
		String expectedTitleAboutUs = "More about NGenious Solutions | SharePoint Consultants | Office 365 consultants | SharePoint Experts - NGenious Solutions";
		Assert.assertEquals(actualtileAboutUs, expectedTitleAboutUs);
		
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id='menu-item-1943']")).click();
//		System.out.println("Clicked on Home Menu");
		
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id='menu-item-1948']")).click();
//		System.out.println("Clicked on Services Menu");
//		
//		Thread.sleep(5000);
//		String actualtileServices = driver.getTitle();
//		System.out.println("Pagetitle: "+actualtileServices);
//		String expectedTitleServices = "";
//		Assert.assertEquals(actualtileServices, expectedTitleServices);
		
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id='menu-item-3381']")).click();
//		System.out.println("Clicked on Solutions Menu");
//		Thread.sleep(5000);
//		String actualtileSolution = driver.getTitle();
//		System.out.println("Pagetitle: "+actualtileSolution);
//		String expectedTitleSolution = "";
//		Assert.assertEquals(actualtileSolution, expectedTitleSolution);
		
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id='menu-item-1943']")).click();
//		System.out.println("Clicked on Home Menu");
//		
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id='menu-item-3383']")).click();
//		System.out.println("Clicked on Resources Menu");
//		Thread.sleep(5000);
//		String actualtileResources = driver.getTitle();
//		System.out.println("Pagetitle: "+actualtileResources);
//		String expectedTitleResources = "";
//		Assert.assertEquals(actualtileServices, expectedTitleResources);
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='menu-item-1943']")).click();
		System.out.println("Clicked on Home Menu");
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='menu-item-3388']")).click();
		System.out.println("Clicked on Career Menu");
		Thread.sleep(10000);
		String actualtileCareer = driver.getTitle();
		System.out.println("Pagetitle: "+actualtileCareer);
		String expectedTitleCareer = "Career at NGenious Solutions USA, New Jersey, New York, India, Mumbai | SharePoint Consultants | Office 365 consultants | SharePoint Experts - NGenious Solutions";
		Assert.assertEquals(actualtileCareer, expectedTitleCareer);
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='menu-item-1943']")).click();
		System.out.println("Clicked on Home Menu");
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='menu-item-3389']")).click();
		System.out.println("Clicked on Contact Us Menu");
		Thread.sleep(10000);
		String actualtileContactUs = driver.getTitle();
		System.out.println("Pagetitle: "+actualtileContactUs);
		String expectedTitleContactUs = "NGenious Solutions Contact details USA , New York, New Jersey , INDIA, MUMBAI | SharePoint Consultants | Office 365 consultants | SharePoint Experts - NGenious Solutions";
		Assert.assertEquals(actualtileContactUs, expectedTitleContactUs);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='menu-item-1943']")).click();
		System.out.println("Clicked on Home Menu");
	}
	public static void verifyHomePageAbtCompyReadMorebtn() throws Exception
	{
		Thread.sleep(5000);
		WebElement Navigation=driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span"));

		if(!Navigation.isDisplayed())
		{
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='menu-item-1943']")).click();
		System.out.println("Clicked on Home Menu");
		
		Thread.sleep(10000);
		WebElement readMoreAboveContent = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[1]/div/div/div[2]/div/div/div[1]/div/div/div[2]"));												   
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",readMoreAboveContent );
		System.out.println("Scrolled to Read more button");
		
		Thread.sleep(10000);
		WebElement readMore = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[1]/div/div/div[2]/div/div/div[3]/div/div/a/span/span"));
		readMore.click();
		System.out.println("Read More button clicked");
		
		Thread.sleep(10000);
		String actualtileAboutUs = driver.getTitle();
		System.out.println("Pagetitle: "+actualtileAboutUs);
		String expectedTitleAboutUs = "More about NGenious Solutions | SharePoint Consultants | Office 365 consultants | SharePoint Experts - NGenious Solutions";
		Assert.assertEquals(actualtileAboutUs, expectedTitleAboutUs);
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='menu-item-1943']")).click();
		System.out.println("Clicked on Home Menu");
		}
		
		else
		{
			Thread.sleep(10000);
			WebElement readMoreAboveContent = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[1]/div/div/div[2]/div/div/div[1]/div/div/div[2]"));												   
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",readMoreAboveContent );
			System.out.println("Scrolled to Read more button");
			
			Thread.sleep(10000);
			WebElement readMore = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[1]/div/div/div[2]/div/div/div[3]/div/div/a/span/span"));
			readMore.click();
			System.out.println("Read More button clicked");
			
			Thread.sleep(10000);
			String actualtileAboutUs = driver.getTitle();
			System.out.println("Pagetitle: "+actualtileAboutUs);
			String expectedTitleAboutUs = "More about NGenious Solutions | SharePoint Consultants | Office 365 consultants | SharePoint Experts - NGenious Solutions";
			Assert.assertEquals(actualtileAboutUs, expectedTitleAboutUs);
			Thread.sleep(2000);

			driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span")).click();
			System.out.println("Clicked on Navigatin menu");
			Thread.sleep(2000);
			Thread.sleep(10000);
			WebElement Home=driver.findElement(By.xpath("//*[@id='menu-item-1943']/a"));

			((JavascriptExecutor) driver).executeScript(
					"arguments[0].click();", Home);
			Thread.sleep(5000);
			System.out.println("Clicked on Home page in the mobile")
			
			;
		//	driver.findElement(By.xpath("//*[@id='menu-item-1943']")).click();
		//	System.out.println("Clicked on Home Menu")

			
			;
		}
		
	}
	public static void verifyHomePageBestServices() throws Exception
	{
		Thread.sleep(5000);
		WebElement Navigation=driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span"));

		if(!Navigation.isDisplayed())
		{
			System.out.println("In Web/Landsacpe");

			Thread.sleep(10000);
			WebElement content = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[4]/div/div/div/div/div/section/div/div/div[2]/div/div/div/div/div/p/span"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",content);
			System.out.println("Scrolled to Our Best Service content");
			
			Thread.sleep(10000);
			WebElement cloudComputing = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[4]/div/div/div/div/div/div/div/div/div[1]/div[1]/div/div[2]/h6"));
			cloudComputing.click();
			System.out.println("Clicked on Cloud Computing");
			
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id='menu-item-1943']")).click();
			System.out.println("Clicked on Home Menu");
			
			Thread.sleep(15000);
			content = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[4]/div/div/div/div/div/section/div/div/div[2]/div/div/div/div/div/p/span"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",content);
			
			Thread.sleep(15000);
			WebElement enterpriseSolutions = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[4]/div/div/div/div/div/div/div/div/div[1]/div[2]/div/div[2]/h6/a"));
			enterpriseSolutions.click();
			System.out.println("Clicked on Enterprise Solution");
			
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id='menu-item-1943']")).click();
			System.out.println("Clicked on Home Menu");
			
			Thread.sleep(15000);
			content = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[4]/div/div/div/div/div/section/div/div/div[2]/div/div/div/div/div/p/span"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",content);
			
			Thread.sleep(15000);
			WebElement processAutomation = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[4]/div/div/div/div/div/div/div/div/div[1]/div[3]/div/div[2]/h6"));
			processAutomation.click();
			System.out.println("Clicked on Process Automation");
			
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id='menu-item-1943']")).click();
			System.out.println("Clicked on Home Menu");
			
			Thread.sleep(15000);
			cloudComputing = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[4]/div/div/div/div/div/div/div/div/div[1]/div[1]/div/div[2]/h6"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",cloudComputing);
			
			Thread.sleep(15000);
			WebElement businessIntelligence = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[4]/div/div/div/div/div/div/div/div/div[1]/div[4]/div/div[2]/h6/a"));
			businessIntelligence.click();
			System.out.println("Clicked on Business Intelligence");
			
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id='menu-item-1943']")).click();
			System.out.println("Clicked on Home Menu");
			
			Thread.sleep(15000);
			cloudComputing = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[4]/div/div/div/div/div/div/div/div/div[1]/div[1]/div/div[2]/h6"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",cloudComputing);
			
			Thread.sleep(15000);
			WebElement mangedSupport = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[4]/div/div/div/div/div/div/div/div/div[1]/div[5]/div/div[2]/h6/a"));
			mangedSupport.click();
			System.out.println("Clicked on Manged Support");
			
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id='menu-item-1943']")).click();
			System.out.println("Clicked on Home Menu");
			
			Thread.sleep(15000);
			cloudComputing = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[4]/div/div/div/div/div/div/div/div/div[1]/div[1]/div/div[2]/h6"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",cloudComputing);
			
			Thread.sleep(15000);
			WebElement applicationDevelopment = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[4]/div/div/div/div/div/div/div/div/div[1]/div[6]/div/div[2]/h6/a"));
			applicationDevelopment.click();
			System.out.println("Clicked on Application Development");
			
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id='menu-item-1943']")).click();
			System.out.println("Clicked on Home Menu");
		
		}
		
		else
		{
//			System.out.println("In Mobile");
//
//			Thread.sleep(10000);
//			WebElement content = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[4]/div/div/div/div/div/section/div/div/div[2]/div/div/div/div/div/p/span"));
//			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",content);
//			System.out.println("Scrolled to Our Best Service content");
//			
//			Thread.sleep(10000);
//			WebElement cloudComputing = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[4]/div/div/div/div/div/div/div/div/div[1]/div[1]/div/div[2]/h6"));
//			cloudComputing.click();
//			System.out.println("Clicked on Cloud Computing");
//			
//			Thread.sleep(10000);
//			driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span")).click();
//			System.out.println("Clicked on Navigatin menu");
//		
//			Thread.sleep(3000);
//			WebElement Home=driver.findElement(By.xpath("//*[@id='menu-item-1943']/a"));
//
//			((JavascriptExecutor) driver).executeScript(
//					"arguments[0].click();", Home);
//
//			System.out.println("Clicked on Home menu");
//
//			
//			Thread.sleep(15000);
//			content = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[4]/div/div/div/div/div/section/div/div/div[2]/div/div/div/div/div/p/span"));
//			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",content);
//			
//			Thread.sleep(15000);
//			WebElement enterpriseSolutions = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[4]/div/div/div/div/div/div/div/div/div[1]/div[2]/div/div[2]/h6/a"));
//			enterpriseSolutions.click();
//			System.out.println("Clicked on Enterprise Solution");
//			
//			Thread.sleep(10000);
//			driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span")).click();
//			System.out.println("Clicked on Navigatin menu");
//		
//			Thread.sleep(3000);
//			 Home=driver.findElement(By.xpath("//*[@id='menu-item-1943']/a"));
//
//			((JavascriptExecutor) driver).executeScript(
//					"arguments[0].click();", Home);
//			System.out.println("Clicked on Home menu");
//
//			
//			
//			Thread.sleep(15000);
//			content = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[4]/div/div/div/div/div/section/div/div/div[2]/div/div/div/div/div/p/span"));
//			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",content);
//			
//			Thread.sleep(15000);
//			WebElement processAutomation = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[4]/div/div/div/div/div/div/div/div/div[1]/div[3]/div/div[2]/h6"));
//			processAutomation.click();
//			System.out.println("Clicked on Process Automation");
//			
//			Thread.sleep(10000);
//			driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span")).click();
//			System.out.println("Clicked on Navigatin menu");
//		
//			Thread.sleep(3000);
//			 Home=driver.findElement(By.xpath("//*[@id='menu-item-1943']/a"));
//
//			((JavascriptExecutor) driver).executeScript(
//					"arguments[0].click();", Home);
//			System.out.println("Clicked on Home menu");
//
//			
//			Thread.sleep(15000);
//			cloudComputing = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[4]/div/div/div/div/div/div/div/div/div[1]/div[1]/div/div[2]/h6"));
//			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",cloudComputing);
//			
//			Thread.sleep(15000);
//			WebElement businessIntelligence = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[4]/div/div/div/div/div/div/div/div/div[1]/div[4]/div/div[2]/h6/a"));
//			businessIntelligence.click();
//			System.out.println("Clicked on Business Intelligence");
//			
//			Thread.sleep(10000);
//			driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span")).click();
//			System.out.println("Clicked on Navigatin menu");
//		
//			Thread.sleep(3000);
//			 Home=driver.findElement(By.xpath("//*[@id='menu-item-1943']/a"));
//
//			((JavascriptExecutor) driver).executeScript(
//					"arguments[0].click();", Home);
//			System.out.println("Clicked on Home menu");
//
//			
//			Thread.sleep(15000);
//			cloudComputing = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[4]/div/div/div/div/div/div/div/div/div[1]/div[1]/div/div[2]/h6"));
//			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",cloudComputing);
//			
//			Thread.sleep(15000);
//			WebElement mangedSupport = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[4]/div/div/div/div/div/div/div/div/div[1]/div[5]/div/div[2]/h6/a"));
//			mangedSupport.click();
//			System.out.println("Clicked on Manged Support");
//			
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span")).click();
			System.out.println("Clicked on Navigatin menu");
		
			Thread.sleep(3000);
			WebElement Home=driver.findElement(By.xpath("//*[@id='menu-item-1943']/a"));

			((JavascriptExecutor) driver).executeScript(
					"arguments[0].click();", Home);
			System.out.println("Clicked on Home menu");
			
			Thread.sleep(15000);
			WebElement cloudComputing = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[4]/div/div/div/div/div/div/div/div/div[1]/div[1]/div/div[2]/h6"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",cloudComputing);
			
			Thread.sleep(15000);
			WebElement applicationDevelopment = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[4]/div/div/div/div/div/div/div/div/div[1]/div[6]/div/div[2]/h6/a"));
			applicationDevelopment.click();
			System.out.println("Clicked on Application Development");
			
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id='swm-mobi-nav-btn']/span/span")).click();
			System.out.println("Clicked on Navigatin menu");
		
			Thread.sleep(3000);
			 Home=driver.findElement(By.xpath("//*[@id='menu-item-1943']/a"));

			((JavascriptExecutor) driver).executeScript(
					"arguments[0].click();", Home);
			System.out.println("Clicked on Home menu");

		}
	}
	public static void verifyHomePageIntranetSolutions() throws Exception
	{
		Thread.sleep(5000);
		WebElement appzContent = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[5]/div/div/div[2]/div/div/div[2]/div/div/p"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",appzContent);
		
		Thread.sleep(5000);
		WebElement appz = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[5]/div/div/div[2]/div/div/div[5]/div/div/a/span/span[2]"));
		appz.click();
		System.out.println("Clicked on 365Appz Explore");
		
		Thread.sleep(5000);
		driver.get("https://nsi.ngenioussolutions.com/");
		System.out.println("Redirected to root URL");
	}
	public static void verfiyhomepageCaseStudieDownloadVldMsg() throws Exception
	{
		Thread.sleep(5000);
		WebElement casestudieSection = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[6]/div/div/div/div/div/div/div/div[3]/div/div"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",casestudieSection);
		
		Thread.sleep(5000);
		WebElement casestudieDownload = driver.findElement(By.xpath("//*[@id='hrefUrl']/span[1]"));
		Thread.sleep(5000);
		casestudieDownload.click();
		System.out.println("Clicked on CaseStudie Download");
		
		Thread.sleep(10000);
		WebElement popupSubmitBtn = driver.findElement(By.xpath("//*[@id='submitform']"));
		popupSubmitBtn.click();
		System.out.println("Clicked on Popup Submit button");
		
		Thread.sleep(10000);
		String  nameVldFld = driver.findElement(By.xpath("//*[@id='wpcf7-f4368-p158-o2']/form/div[2]/div/div/span/span/span")).getText();
		System.out.println("Name field validation: "+nameVldFld);
		String expectednameVldFld = "The field is required.";
		Assert.assertEquals(nameVldFld, expectednameVldFld);
		System.out.println("Validated Name field");
		
		Thread.sleep(5000);
		String emailIDVldFld = driver.findElement(By.xpath("//*[@id='wpcf7-f4368-p158-o2']/form/div[3]/div/div/span[1]/span/span")).getText();
		System.out.println("Email Field validation: "+emailIDVldFld);
		String expectedemailIDVldFld = "The field is required.";
		Assert.assertEquals(emailIDVldFld, expectedemailIDVldFld);
		System.out.println("Validated Email field");
		
		Thread.sleep(5000);
		String numberVldFld = driver.findElement(By.xpath("//*[@id='wpcf7-f4368-p158-o2']/form/div[4]/div/div/span/span[2]/span")).getText();
		System.out.println("Number Field validation: "+numberVldFld);
		String expectednumberIDVldFld = "The field is required.";
		Assert.assertEquals(numberVldFld, expectednumberIDVldFld);
		System.out.println("Validated Number field");
		
		Thread.sleep(5000);
		WebElement closeMark = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[6]/div/div/div/div/div/div/div/div[2]/div/a"));
		closeMark.click();
		System.out.println("Clicked on close button of Pop-up Form");
		
		Thread.sleep(5000);
		driver.navigate().refresh();
	}
	public static void verfiyhomepageCaseStudieDownload() throws Exception
	{
		Thread.sleep(5000);
		WebElement casestudieSection = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[6]/div/div/div/div/div/div/div/div[3]/div/div"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",casestudieSection);
		
		Thread.sleep(5000);
		WebElement casestudieDownload = driver.findElement(By.xpath("//*[@id='hrefUrl']/span[1]"));
		casestudieDownload.click();
			
		Thread.sleep(10000);
		WebElement  name = driver.findElement(By.xpath("//*[@id='your-name']"));
		name.sendKeys("Chinnadurai");
		System.out.println("Name Entered");
		
		Thread.sleep(10000);
		WebElement email = driver.findElement(By.xpath("//*[@id='work-email-id']"));
		email.sendKeys("test01@ngenioussolutions.com");
		System.out.println("Email Entered");
		
		Thread.sleep(7000);
		WebElement number = driver.findElement(By.xpath("//*[@id='number']"));
		number.sendKeys("987456321");
		System.out.println("Number Entered");
		
		Thread.sleep(7000);
		WebElement popupSubmitBtn = driver.findElement(By.xpath("//*[@id='submitform']"));
		popupSubmitBtn.click();
		System.out.println("Clicked on Popup Submit button");
		
		Thread.sleep(5000);
		WebElement closeMark = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[6]/div/div/div/div/div/div/div/div[2]/div/a"));
		closeMark.click();
		System.out.println("Clicked on close button of Pop-up Form");
	}
	public static void verifyHomePageContactUsFormVldMsg() throws Exception
	{
		Thread.sleep(5000);
		WebElement contactTitle = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[7]/div/div/div/div/div/section/div/div/div[2]/div/div/div[1]/div/h2"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",contactTitle);
		System.out.println("scrolled down to contact form");
		
		Thread.sleep(15000);
		WebElement submit = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div[4]/div[1]/div/div/section[7]/div/div/div/div/div/section/div/div/div[2]/div/div/div[2]/div/div/div/div/form/div[7]/input"));
		submit.click();
		System.out.println("Clicked on Submit button");
		
		Thread.sleep(10000);
		WebElement name = driver.findElement(By.xpath("//*[@id='wpcf7-f3631-p158-o1']/form/div[2]/div/div/span/span/input"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",name);
		System.out.println("Scrolled up to Name field");
		
		Thread.sleep(5000);
		String nameVld = driver.findElement(By.xpath("//*[@id='wpcf7-f3631-p158-o1']/form/div[2]/div/div/span/span/span")).getText();
		System.out.println("Name Field vld: "+nameVld);
		String expectednameVld = "The field is required.";
		Assert.assertEquals(nameVld, expectednameVld);
		System.out.println("Vlaidated name field");
		
		Thread.sleep(5000);
		String emailVld = driver.findElement(By.xpath("//*[@id='wpcf7-f3631-p158-o1']/form/div[3]/div/div/span[1]/span/span")).getText();
		System.out.println("Email Field vld: "+emailVld);
		String expectedemailVld = "The field is required.";
		Assert.assertEquals(emailVld, expectedemailVld);
		System.out.println("Vlaidated email field");
		
		Thread.sleep(5000);
		String numberVld = driver.findElement(By.xpath("//*[@id='wpcf7-f3631-p158-o1']/form/div[4]/div/div/span/span[2]/span")).getText();
		System.out.println("Number Field vld: "+numberVld);
		String expectednumberVld = "The field is required.";
		Assert.assertEquals(numberVld, expectednumberVld);
		System.out.println("Vlaidated number field");
		
		Thread.sleep(5000);
		String companyVld = driver.findElement(By.xpath("//*[@id='wpcf7-f3631-p158-o1']/form/div[5]/div/div/span/span/span")).getText();
		System.out.println("Company Field vld: "+companyVld);
		String expectedcompanyVld = "The field is required.";
		Assert.assertEquals(companyVld, expectedcompanyVld);
		System.out.println("Vlaidated company field");
		
		Thread.sleep(5000);
		WebElement comment = driver.findElement(By.xpath("//*[@id='wpcf7-f3631-p158-o1']/form/div[5]/div/div/span/span/span"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",comment);
		
		Thread.sleep(5000);
		String commentVld = driver.findElement(By.xpath("//*[@id='wpcf7-f3631-p158-o1']/form/div[6]/div/div/span/span/span")).getText();
		System.out.println("Comment field vld: "+commentVld);
		String expectedcommentVld = "The field is required.";
		Assert.assertEquals(commentVld, expectedcommentVld);
		System.out.println("Vlaidated Comment field");
		
		Thread.sleep(5000);
		driver.navigate().refresh();
	}
	public static void verifyHomePageContactUsForm() throws Exception
	{
		Thread.sleep(5000);
		WebElement contactTitle = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[7]/div/div/div/div/div/section/div/div/div[2]/div/div/div[1]/div/h2"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",contactTitle);
		System.out.println("scrolled down to contact form");
		
		Thread.sleep(10000);
		WebElement name = driver.findElement(By.xpath("//*[@id='wpcf7-f3631-p158-o1']/form/div[2]/div/div/span/span/input"));
		name.sendKeys("Test Demo one");
		System.out.println("Name Entered");
		
		Thread.sleep(10000);
		WebElement email = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div[4]/div[1]/div/div/section[7]/div/div/div/div/div/section/div/div/div[2]/div/div/div[2]/div/div/div/div/form/div[3]/div/div/span[1]/span/input"));
		email.sendKeys("test01@ngenioussolutions.com");
		System.out.println("Email Entered");
		
		Thread.sleep(10000);
		WebElement number = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div[4]/div[1]/div/div/section[7]/div/div/div/div/div/section/div/div/div[2]/div/div/div[2]/div/div/div/div/form/div[4]/div/div/span/span[2]/input"));
		number.sendKeys("987456321");
		System.out.println("Number Entered");
		
		Thread.sleep(10000);
		WebElement company = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div[4]/div[1]/div/div/section[7]/div/div/div/div/div/section/div/div/div[2]/div/div/div[2]/div/div/div/div/form/div[5]/div/div/span/span/input"));
		company.sendKeys("NSPL Pvt. LTD.");
		System.out.println("Company Entered");
		
		Thread.sleep(10000);
		WebElement comment = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div[4]/div[1]/div/div/section[7]/div/div/div/div/div/section/div/div/div[2]/div/div/div[2]/div/div/div/div/form/div[6]/div/div/span/span/textarea"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",comment);
		comment.sendKeys("Entered the values in Comments field");
		System.out.println("Comments Entered");
		
		Thread.sleep(10000);
		WebElement Submit = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div[4]/div[1]/div/div/section[7]/div/div/div/div/div/section/div/div/div[2]/div/div/div[2]/div/div/div/div/form/div[7]/input"));
		Submit.click();
		System.out.println("Submit button clicked");
		
		Thread.sleep(20000);
		String successMsg = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div[4]/div[1]/div/div/section[7]/div/div/div/div/div/section/div/div/div[2]/div/div/div[2]/div/div/div/div/form/div[8]")).getText();
		System.out.println("Success Message: "+successMsg);
		String expectedsuccessMsg = "Thank you for your message. It has been sent.";
		Assert.assertEquals(successMsg, expectedsuccessMsg);
		System.out.println("Success msg validated and displayed");
	}
}
