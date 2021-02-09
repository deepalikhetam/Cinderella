package corporatesite;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class AboutUs extends Browser
{
	static WebDriverWait wait = new WebDriverWait(driver, 50);
	public static void verifyAboutUsPage() throws Exception
	{
		
		Thread.sleep(5000);
		WebElement Aboutus=	driver.findElement(By.xpath("//*[@id='menu-item-1944']/span"));
		if(!Aboutus.isDisplayed())
		{
		System.out.println("About us Arrow  does not displlayed ");
		
	
	//	OLD
		
	//	try{
		
		
		System.out.println("web");

		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='menu-item-1944']/a/span")).click();
	
		
		Thread.sleep(5000);
		String actualtile = driver.getTitle();
		System.out.println("Pagetitle: "+actualtile);
		
		Thread.sleep(10000);
		System.out.println("Clicked on About Us Menu");
		}
		else
		{
//NEW 
//		
//		catch (Exception e)
//		{
//			
//		}
			
			
		System.out.println("Aboutus us arrow  displayed ");

		System.out.println("mobile");
		Thread.sleep(5000);//did not chnag he xpath only js
		WebElement Aboutusmenu = driver.findElement(By.xpath("//*[@id='menu-item-1945']/a/span"));

		((JavascriptExecutor) driver).executeScript("arguments[0].click();", Aboutusmenu);


		

		Thread.sleep(5000);


		String actualtile = driver.getTitle();
		System.out.println("Pagetitle: "+actualtile);
		
		Thread.sleep(10000);
		System.out.println("Clicked on About Us Menu");

		
		}
		
		
	}
	
	
	

	public  static void ClickOnAboutCompany() throws Exception
	{
	
		
	driver.navigate().refresh();
		Thread.sleep(5000);
		WebElement Aboutus=	driver.findElement(By.xpath("//*[@id='menu-item-1944']/span"));
		if (!Aboutus.isDisplayed()) {
			
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='menu-item-1944']/a/span"))));
			//	driver.findElement(By.id("menu-item-3389")).click();
		System.out.println("wait");

		WebElement item = driver.findElement(By.xpath("//*[@id='menu-item-1944']/a/span"));

		Thread.sleep(10000);
		System.out.println("item"+item.isDisplayed());
		System.out.println("item"+item.isEnabled());

		Actions action =new Actions(driver);
		action.moveToElement(item).build().perform();
		
		System.out.println("perform");
		
		//ff 
		Thread.sleep(5000);
		action.moveToElement(item).perform();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='menu-item-1945']/a")).click();
		System.out.println("Clicked on About Company SubMenu");
		
	
//			
//			Thread.sleep(5000);
//
//			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='menu-item-1944']/a/span"))));
//				//	driver.findElement(By.id("menu-item-3389")).click();
//			System.out.println("wait");
//
//			WebElement item = driver.findElement(By.xpath("//*[@id='menu-item-1944']/a/span"));
//			System.out.println("item");
//			item.click();
			//item.click();

//			Actions action =new Actions(driver);
//			action.moveToElement(item).perform();
//			System.out.println("perform");
//			
//			System.out.println("Clicked on About Us");
//
//			Thread.sleep(2000);
//
//			driver.findElement(By.xpath("//*[@id='menu-item-1945']/a")).click();
//			System.out.println("Clicked on About Company SubMenu");
//			
//			String actualtile = driver.getTitle();
//			System.out.println("Pagetitle: "+actualtile);
//			System.out.println("Clicked on About us");
//
//			Thread.sleep(5000);
//
//			driver.findElement(By.xpath("//*[@id='menu-item-1945']/a")).click();
//			System.out.println("Clicked on About Company SubMenu in web ");


		}

		else {

			System.out.println("Aboutus arrow displayed  ");

			System.out.println("mobile");
			// *[@id='menu-item-1944']/a/span
			WebElement Aboutusmenu = driver.findElement(By
					.xpath("//*[@id='menu-item-1945']/a/span"));

			((JavascriptExecutor) driver).executeScript(
					"arguments[0].click();", Aboutusmenu);

			Thread.sleep(5000);

			// driver.findElement(By.xpath("//*[@id='menu-item-1945']/a")).click();
			System.out.println("Clicked on About Company SubMenu in mobile");

			String actualtile = driver.getTitle();
			System.out.println("Pagetitle: " + actualtile);
		}


	}
	
	
	public  static void ClickOnCoreTeam() throws Exception
	{
		
		
		//add try 
		WebElement Aboutus = driver.findElement(By
				.xpath("//*[@id='menu-item-1944']/span"));
		if (!Aboutus.isDisplayed()) {
			
			System.out.println("Aboutus arrow does not displayed ");
			System.out.println("In web/landscape ");
			Thread.sleep(3000);
			//driver.navigate().refresh();
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(driver
					.findElement(By.xpath("//*[@id='menu-item-1944']/a/span"))));
			// driver.findElement(By.id("menu-item-3389")).click();
			System.out.println("wait");
			WebElement item = driver.findElement(By
					.xpath("//*[@id='menu-item-1945']/a/span"));
			System.out.println("item");
			item.click();
//			Actions action = new Actions(driver);
//			action.moveToElement(item).perform();
			System.out.println("Clicked on About us");

			
		
		
		}
	
		
		
		else{
			
			Thread.sleep(3000);

			System.out.println("Aboutus arrow does  displayed ");

			//*[@id='menu-item-1944']/a/span
			WebElement coreteam = driver.findElement(By.xpath("//*[@id='menu-item-1946']/a/span"));

			((JavascriptExecutor) driver).executeScript("arguments[0].click();", coreteam);


			Thread.sleep(3000);

		//	driver.findElement(By.xpath("//*[@id='menu-item-1945']/a")).click();
			System.out.println("Clicked on core SubMenu in mobile");
			
			String actualtile = driver.getTitle();
			System.out.println("Pagetitle: "+actualtile);
			
		}
	
		
		
		

		
	}
	
	public  static void ClickOnOurPartner() throws Exception
	{
	
		//driver.navigate().refresh();
		Thread.sleep(5000);
	
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='menu-item-1944']/a/span"))));
			//	driver.findElement(By.id("menu-item-3389")).click();
		System.out.println("wait");

		WebElement item = driver.findElement(By.xpath("//*[@id='menu-item-1944']/a/span"));
		System.out.println("item");
		Actions action =new Actions(driver);
		action.moveToElement(item).perform();
		System.out.println("perform");
	
		action.moveToElement(item).perform();
		Thread.sleep(5000);

		
		driver.findElement(By.xpath("//*[@id='menu-item-1947']/a")).click();
		System.out.println("Clicked on Our Partner SubMenu");
		
		String actualtile = driver.getTitle();
		System.out.println("Pagetitle: "+actualtile);

	}
	
	public  static void ClickOnContact() throws Exception
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
	
	
	
	
	public  static void verfiyMenus() throws Exception
	{
		Thread.sleep(10000);
		
		
		
		driver.findElement(By.xpath("//*[@id='menu-item-1945']/a/span")).click();
		System.out.println("Clicked on Adout Us Menu");
		Thread.sleep(5000);
		String actualtileAboutUs = driver.getTitle();
		System.out.println("Pagetitle: "+actualtileAboutUs);
//		String expectedTitleAboutUs = "";
//		Assert.assertEquals(actualtileAboutUs, expectedTitleAboutUs);
		
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
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='menu-item-1943']")).click();
		System.out.println("Clicked on Home Menu");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='menu-item-3388']")).click();
		System.out.println("Clicked on Career Menu");
		Thread.sleep(5000);
		String actualtileCareer = driver.getTitle();
		System.out.println("Pagetitle: "+actualtileCareer);
//		String expectedTitleCareer = "";
//		Assert.assertEquals(actualtileCareer, expectedTitleCareer);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='menu-item-1943']")).click();
		System.out.println("Clicked on Home Menu");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='menu-item-3389']")).click();
		System.out.println("Clicked on Contact Us Menu");
		Thread.sleep(5000);
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
		driver.findElement(By.xpath("//*[@id='menu-item-1943']")).click();
		System.out.println("Clicked on Home Menu");
		
		Thread.sleep(5000);
		WebElement readMore = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[1]/div/div/div[2]/div/div/div[3]/div/div/a/span/span"));
														   
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",readMore );
		
		Thread.sleep(5000);
		readMore.click();
		System.out.println("Read More button clicked");
		
		Thread.sleep(5000);
		String actualtileAboutUs = driver.getTitle();
		System.out.println("Pagetitle: "+actualtileAboutUs);
//		String expectedTitleAboutUs = "";
//		Assert.assertEquals(actualtileAboutUs, expectedTitleAboutUs);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='menu-item-1943']")).click();
		System.out.println("Clicked on Home Menu");
	}
	public static void verifyHomePageBestServices() throws Exception
	{
		Thread.sleep(5000);
		WebElement cloudComputing = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[4]/div/div/div/div/div/div/div/div/div[1]/div[1]/div/div[2]/h6"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",cloudComputing );
		
		Thread.sleep(5000);
		cloudComputing.click();
		System.out.println("Clicked on Cloud Computing");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='menu-item-1943']")).click();
		System.out.println("Clicked on Home Menu");
		
		Thread.sleep(5000);
		WebElement enterpriseSolutions = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[4]/div/div/div/div/div/div/div/div/div[1]/div[2]/div/div[2]/h6/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",enterpriseSolutions );
		
		Thread.sleep(5000);
		enterpriseSolutions.click();
		System.out.println("Clicked on Enterprise Solution");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='menu-item-1943']")).click();
		System.out.println("Clicked on Home Menu");
		
		Thread.sleep(5000);
		WebElement processAutomation = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[4]/div/div/div/div/div/div/div/div/div[1]/div[3]/div/div[2]/h6/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",processAutomation );
		
		Thread.sleep(5000);
		processAutomation.click();
		System.out.println("Clicked on Process Automation");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='menu-item-1943']")).click();
		System.out.println("Clicked on Home Menu");
		
		Thread.sleep(5000);
		WebElement businessIntelligence = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[4]/div/div/div/div/div/div/div/div/div[1]/div[4]/div/div[2]/h6/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",businessIntelligence );
		
		Thread.sleep(5000);
		businessIntelligence.click();
		System.out.println("Clicked on Business Intelligence");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='menu-item-1943']")).click();
		System.out.println("Clicked on Home Menu");
		
		Thread.sleep(5000);
		WebElement mangedSupport = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[4]/div/div/div/div/div/div/div/div/div[1]/div[5]/div/div[2]/h6/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",mangedSupport );
		
		Thread.sleep(5000);
		mangedSupport.click();
		System.out.println("Clicked on Manged Support");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='menu-item-1943']")).click();
		System.out.println("Clicked on Home Menu");
		
		Thread.sleep(5000);
		WebElement applicationDevelopment = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[4]/div/div/div/div/div/div/div/div/div[1]/div[6]/div/div[2]/h6/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",applicationDevelopment );
		
		Thread.sleep(5000);
		applicationDevelopment.click();
		System.out.println("Clicked on Application Development");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='menu-item-1943']")).click();
		System.out.println("Clicked on Home Menu");
	}
	public static void verifyHomePageIntranetSolutions() throws Exception
	{
		Thread.sleep(5000);
		WebElement appz = driver.findElement(By.xpath("//*[@id='swm-wrap']/div[4]/div[1]/div/div/section[5]/div/div/div[2]/div/div/div[5]/div/div/a/span/span[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",appz );
		Thread.sleep(5000);
		appz.click();
		System.out.println("Clicked on 365Appz Explore");
		
		Thread.sleep(5000);
		driver.get("https://nsi.ngenioussolutions.com/");
		System.out.println("Redirected to root URL");
	}
	public static void verfiyhomepageCaseStudieDownloadVldMsg() throws Exception
	{
		Thread.sleep(5000);
		WebElement casestudieDownload = driver.findElement(By.xpath("//*[@id='hrefUrl']/span[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",casestudieDownload );
		Thread.sleep(5000);
		casestudieDownload.click();
		
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		Thread.sleep(5000);
		String  nameVldFld = driver.findElement(By.xpath("//*[@id='wpcf7-f4368-p158-o2']/form/div[2]/div/div/span/span/span")).getText();
		System.out.println("Name field validation: "+nameVldFld);
		String expectednameVldFld = "The field is required.";
		Assert.assertEquals(nameVldFld, expectednameVldFld);
		System.out.println("Validated Name field");
		
		String emailIDVldFld = driver.findElement(By.xpath("//*[@id='wpcf7-f4368-p158-o2']/form/div[3]/div/div/span[1]/span/span")).getText();
		System.out.println("Email Field validation: "+emailIDVldFld);
		String expectedemailIDVldFld = "The field is required.";
		Assert.assertEquals(emailIDVldFld, expectedemailIDVldFld);
		System.out.println("Validated Email field");
		
		String numberVldFld = driver.findElement(By.xpath("//*[@id='wpcf7-f4368-p158-o2']/form/div[4]/div/div/span/span[2]/span")).getText();
		System.out.println("Number Field validation: "+numberVldFld);
		String expectednumberIDVldFld = "The field is required.";
		Assert.assertEquals(numberVldFld, expectednumberIDVldFld);
		System.out.println("Validated Number field");
		
		alert.dismiss();
		Thread.sleep(5000);
		driver.navigate().refresh();
	}
	public static void verfiyhomepageCaseStudieDownload() throws Exception
	{
		Thread.sleep(5000);
		WebElement casestudieDownload = driver.findElement(By.xpath("//*[@id='hrefUrl']/span[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",casestudieDownload );
		Thread.sleep(5000);
		casestudieDownload.click();
		
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(5000);
		WebElement  name = driver.findElement(By.xpath("//*[@id='wpcf7-f4368-p158-o2']/form/div[2]/div/div/span/span/span"));
		name.sendKeys("Chinnadurai");
		System.out.println("Name Entered");
		
		Thread.sleep(5000);
		WebElement email = driver.findElement(By.xpath("//*[@id='wpcf7-f4368-p158-o2']/form/div[3]/div/div/span[1]/span/span"));
		email.sendKeys("test01@ngenioussolutions.com");
		System.out.println("Email Entered");
		
		Thread.sleep(5000);
		WebElement number = driver.findElement(By.xpath("//*[@id='wpcf7-f4368-p158-o2']/form/div[4]/div/div/span/span[2]/span"));
		number.sendKeys("987456321");
		System.out.println("Number Entered");
		
		Thread.sleep(5000);
		alert.accept();
		System.out.println("Submit button clicked");
		
	}
	public static void verifyHomePageContactUsFormVldMsg() throws Exception
	{
		Thread.sleep(5000);
		WebElement Submit = driver.findElement(By.xpath("//*[@id='submitform']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",Submit );
		
		Thread.sleep(5000);
		Submit.click();
		System.out.println("Clicked on Submit button");
		
		Thread.sleep(10000);
		WebElement name = driver.findElement(By.xpath("//*[@id='wpcf7-f3631-p158-o1']/form/div[2]/div/div/span/span/input"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",name);
		
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
		System.out.println("Vlaidated company field");
		
		Thread.sleep(5000);
		driver.navigate().refresh();
	}
	public static void verifyHomePageContactUsForm() throws Exception
	{
		Thread.sleep(10000);
		WebElement name = driver.findElement(By.xpath("//*[@id='wpcf7-f3631-p158-o1']/form/div[2]/div/div/span/span/input"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",name);
		Thread.sleep(5000);
		name.sendKeys("Test Demo one");
		System.out.println("Name Entered");
		
		Thread.sleep(5000);
		WebElement email = driver.findElement(By.xpath("//*[@id='work-email-id']"));
		email.sendKeys("test01@ngenioussolutions.com");
		System.out.println("Email Entered");
		
		Thread.sleep(5000);
		WebElement number = driver.findElement(By.xpath("//*[@id='wpcf7-f3631-p158-o1']/form/div[4]/div/div/span/span[2]/input"));
		number.sendKeys("987456321");
		System.out.println("Number Entered");
		
		Thread.sleep(5000);
		WebElement company = driver.findElement(By.xpath("//*[@id='wpcf7-f3631-p158-o1']/form/div[5]/div/div/span/span/input"));
		company.sendKeys("NSPL Pvt. LTD.");
		System.out.println("Company Entered");
		
		Thread.sleep(5000);
		WebElement comment = driver.findElement(By.xpath("//*[@id='wpcf7-f3631-p158-o1']/form/div[6]/div/div/span/span/textarea"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",comment);
		comment.sendKeys("Entered the values in Comments field");
		System.out.println("Comments Entered");
		
		Thread.sleep(5000);
		WebElement Submit = driver.findElement(By.xpath("//*[@id='submitform']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",Submit );
		Submit.click();
		System.out.println("Submit button clicked");
		
		Thread.sleep(10000);
		String successMsg = driver.findElement(By.xpath("//*[@id='wpcf7-f3631-p158-o1']/form/div[8]")).getText();
		System.out.println("Success Message: "+successMsg);
		String expectedsuccessMsg = "Thank you for your message. It has been sent.";
		Assert.assertEquals(successMsg, expectedsuccessMsg);
		System.out.println("Success msg validated and displayed");
	}
}
