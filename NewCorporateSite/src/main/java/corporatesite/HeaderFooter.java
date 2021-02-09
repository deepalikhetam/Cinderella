package corporatesite;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HeaderFooter extends Browser 
	{
	  static WebDriverWait wait = new WebDriverWait(driver, 50);
	  public static void verifyPhoneNumber() throws Exception
	  {
			Thread.sleep(5000);
			String actual = driver.findElement(By.xpath("//*[@id='menu-item-469']")).getText();
			String expected = ("+1 (732) 351-2141 / 42");

			System.out.println("Clicked on Phone number");
			
			Assert.assertEquals(actual,expected);		
			System.out.println("Phone number Verified");
			Thread.sleep(2000);
			
		}
	  
	  public static void verifyEmail() throws Exception
	  {
			Thread.sleep(5000);
			driver.findElement(By.id("menu-item-468")).click();

			System.out.println("Pop-Up opened");
	
	  }
	  
	  public static void WorkingDays() throws Exception
	  {
		  Thread.sleep(5000);
			String actual = driver.findElement(By.xpath("//*[@id='menu-item-470']")).getText();
			String expected = ("Mon – Fri: 9:00am – 6:00pm");

			System.out.println("Clicked on working days");
			
			Assert.assertEquals(actual,expected);		
			System.out.println("Working Days and Time Verified");
			Thread.sleep(2000);	
		}
	  public static void SocialLinks() throws Exception
	  {
		 Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"swm-outer-wrap\"]/div[1]/div/div/div/div[1]/div[2]/ul[2]/li[1]/a")).click();
		System.out.println("Clicked on Twitter");
		Thread.sleep(5000);
		 Set<String> handler =driver.getWindowHandles();
		 Iterator<String> it= handler.iterator();
		 String ParentWindowid=it.next();
		 System.out.println("Parent window id is "+ ParentWindowid);
		 Thread.sleep(3000);
		 String childWindowid=it.next();
		 System.out.println("Child window id is "+ childWindowid);
		 
		 driver.switchTo().window(childWindowid);
		 Thread.sleep(5000);
		 driver.close();
		 Thread.sleep(5000);
		 driver.switchTo().window(ParentWindowid);
		 Thread.sleep(3000);
			 
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id=\"swm-outer-wrap\"]/div[1]/div/div/div/div[1]/div[2]/ul[2]/li[2]/a")).click();
		 System.out.println("Clicked on Facebook");
		 Thread.sleep(5000);
		 Set<String> handler1 =driver.getWindowHandles();
	     Iterator<String> it1= handler1.iterator();
	     String ParentWindowid1=it1.next();
	     System.out.println("Parent window id is "+ ParentWindowid1);
	     Thread.sleep(3000);
	      String childWindowid1=it1.next();
	      System.out.println("Child window id is "+ childWindowid1);
				 
	      driver.switchTo().window(childWindowid1);
	      Thread.sleep(5000);
          driver.close();
	      Thread.sleep(5000);
	      driver.switchTo().window(ParentWindowid1);
	      Thread.sleep(3000);
			 
	      Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id=\"swm-outer-wrap\"]/div[1]/div/div/div/div[1]/div[2]/ul[2]/li[3]/a")).click();
		  System.out.println("Clicked on LinkedIn");
		  Thread.sleep(5000);
		  Set<String> handler2 =driver.getWindowHandles();
		  Iterator<String> it2= handler2.iterator();
		  String ParentWindowid2=it2.next();
		  System.out.println("Parent window id is "+ ParentWindowid2);
		  Thread.sleep(3000);
		  String childWindowid2=it2.next();
		  System.out.println("Child window id is "+ childWindowid2);
					 
		  driver.switchTo().window(childWindowid2);
		  Thread.sleep(5000);
	      driver.close();
		  Thread.sleep(5000);
		  driver.switchTo().window(ParentWindowid2);
		  Thread.sleep(3000); 
			
		}
	  
	  public static void RecentPostLinks() throws Exception
	  {
		  Thread.sleep(5000);
			String actual = driver.findElement(By.xpath("//*[@id=\"gyan_recent_posts_wid-3\"]/div/div/div[2]/ul/li[1]/div[1]/div/a")).getText();
			String expected = ("Microsoft Dynamics 365 Business Central:");
			
			Assert.assertEquals(actual,expected);		
			System.out.println("Verified Link 1");
			Thread.sleep(2000);	
			
			Thread.sleep(5000);
			String actual1 = driver.findElement(By.xpath("//*[@id=\"gyan_recent_posts_wid-3\"]/div/div/div[2]/ul/li[2]/div[1]/div/a")).getText();
		    String expected1 = ("How Migrating to SharePoint Online Can H");
				
		    Assert.assertEquals(actual1,expected1);		
			System.out.println("Verified Link 2");
			Thread.sleep(2000);	
			
			Thread.sleep(5000);
			String actual2 = driver.findElement(By.xpath("//*[@id=\"gyan_recent_posts_wid-3\"]/div/div/div[2]/ul/li[3]/div[1]/div/a")).getText();
		    String expected2 = ("Microsoft Power BI: A Quick Glance At Wh");
				
		    Assert.assertEquals(actual2,expected2);		
			System.out.println("Verified Link 3");
			Thread.sleep(2000);	
			
			Thread.sleep(5000);
			String actual3 = driver.findElement(By.xpath("//*[@id=\"gyan_recent_posts_wid-3\"]/div/div/div[2]/ul/li[4]/div[1]/div/a")).getText();
		    String expected3 = ("5 Benefits Of Moving To The Cloud Now Mo");
				
		    Assert.assertEquals(actual3,expected3);		
			System.out.println("Verified Link 4");
			Thread.sleep(2000);	
		  
	  }
	  public static void LinksClick() throws Exception
	  {
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"gyan_recent_posts_wid-3\"]/div/div/div[2]/ul/li[1]/div[1]/div/a"))));
		  driver.findElement(By.xpath("//*[@id=\"gyan_recent_posts_wid-3\"]/div/div/div[2]/ul/li[1]/div[1]/div/a")).click();
          System.out.println("Clicked on first link");
		  Thread.sleep(4000);
		  driver.navigate().back();
		  Thread.sleep(4000);	   
		  driver.get("https://nsi.ngenioussolutions.com/");
          System.out.println("Back to Home Page");

		  
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"gyan_recent_posts_wid-3\"]/div/div/div[2]/ul/li[2]/div[1]/div/a"))));
		  driver.findElement(By.xpath("//*[@id=\"gyan_recent_posts_wid-3\"]/div/div/div[2]/ul/li[2]/div[1]/div/a")).click();
          System.out.println("Clicked on Second link");
		  Thread.sleep(4000);
		  driver.navigate().back();
		  Thread.sleep(4000);	   
		  driver.get("https://nsi.ngenioussolutions.com/");
          System.out.println("Back to Home Page");
		  
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"gyan_recent_posts_wid-3\"]/div/div/div[2]/ul/li[3]/div[1]/div/a"))));
		  driver.findElement(By.xpath("//*[@id=\"gyan_recent_posts_wid-3\"]/div/div/div[2]/ul/li[3]/div[1]/div/a")).click();
          System.out.println("Clicked on Third link");
		  Thread.sleep(4000);
		  driver.navigate().back();
		  Thread.sleep(4000);	   
		  driver.get("https://nsi.ngenioussolutions.com/");
	      System.out.println("Back to Home Page");

		  
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"gyan_recent_posts_wid-3\"]/div/div/div[2]/ul/li[4]/div[1]/div/a"))));
		  driver.findElement(By.xpath("//*[@id=\"gyan_recent_posts_wid-3\"]/div/div/div[2]/ul/li[4]/div[1]/div/a")).click();
          System.out.println("Clicked on Fourth link");
		  Thread.sleep(4000);
		  driver.navigate().back();
		  Thread.sleep(4000);	   
		  driver.get("https://nsi.ngenioussolutions.com/");
          System.out.println("Back to Home Page");
	  }
	  
	  public static void Dates() throws Exception
	  {
		    Thread.sleep(5000);
	        JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,250)");
			String actual = driver.findElement(By.xpath("//*[@id=\"gyan_recent_posts_wid-3\"]/div/div/div[2]/ul/li[1]/div[1]/p/span")).getText();

			System.out.println(actual);
			String expected = ("Dec 19, 2020");
			
			Assert.assertEquals(actual,expected);		
			System.out.println("Verified Date for Link 1");
			Thread.sleep(2000);	
			
			Thread.sleep(5000);
			String actual1 = driver.findElement(By.xpath("//*[@id=\"gyan_recent_posts_wid-3\"]/div/div/div[2]/ul/li[2]/div[1]/p/span")).getText();
			System.out.println(actual1);
			String expected1 = ("Nov 30, 2020");
				
		    Assert.assertEquals(actual1,expected1);		
			System.out.println("Verified Date for Link 2");
			Thread.sleep(2000);	
			
			Thread.sleep(5000);
			String actual2 = driver.findElement(By.xpath("//*[@id=\"gyan_recent_posts_wid-3\"]/div/div/div[2]/ul/li[3]/div[1]/p/span")).getText();
			System.out.println(actual2);
			String expected2 = ("Sep 24, 2020");
				
		    Assert.assertEquals(actual2,expected2);		
			System.out.println("Verified Date for Link 3");
			Thread.sleep(2000);	
			
			Thread.sleep(5000);
			String actual3 = driver.findElement(By.xpath("//*[@id=\"gyan_recent_posts_wid-3\"]/div/div/div[2]/ul/li[4]/div[1]/p/span")).getText();
			System.out.println(actual3);
			String expected3 = ("Sep 3, 2020");
				
		    Assert.assertEquals(actual3,expected3);		
			System.out.println("Verified Date for Link 4");
			Thread.sleep(2000);	 
	  }
	  
	  public static void ImageClick() throws Exception
	  {
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"gyan_recent_posts_wid-3\"]/div/div/div[2]/ul/li[1]/a/img"))));
		  driver.findElement(By.xpath("//*[@id=\"gyan_recent_posts_wid-3\"]/div/div/div[2]/ul/li[1]/a/img")).click();
          System.out.println("Clicked on first Image");
		  Thread.sleep(4000);
		  driver.navigate().back();
		  Thread.sleep(4000);	   
		  driver.get("https://nsi.ngenioussolutions.com/");
          System.out.println("Back to Home Page");
		  
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"gyan_recent_posts_wid-3\"]/div/div/div[2]/ul/li[2]/a/img"))));
		  driver.findElement(By.xpath("//*[@id=\"gyan_recent_posts_wid-3\"]/div/div/div[2]/ul/li[2]/a/img")).click();
          System.out.println("Clicked on Second Image");
		  Thread.sleep(4000);
		  driver.navigate().back();
		  Thread.sleep(4000);	   
		  driver.get("https://nsi.ngenioussolutions.com/");
          System.out.println("Back to Home Page");
		  
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"gyan_recent_posts_wid-3\"]/div/div/div[2]/ul/li[3]/a/img"))));
		  driver.findElement(By.xpath("//*[@id=\"gyan_recent_posts_wid-3\"]/div/div/div[2]/ul/li[3]/a/img")).click();
          System.out.println("Clicked on Third Image");
		  Thread.sleep(4000);
		  driver.navigate().back();
		  Thread.sleep(4000);	   
		  driver.get("https://nsi.ngenioussolutions.com/");
	      System.out.println("Back to Home Page");

		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"gyan_recent_posts_wid-3\"]/div/div/div[2]/ul/li[4]/a/img"))));
		  driver.findElement(By.xpath("//*[@id=\"gyan_recent_posts_wid-3\"]/div/div/div[2]/ul/li[4]/a/img")).click();
          System.out.println("Clicked on Fourth Image");
		  Thread.sleep(4000);
		  driver.navigate().back();
		  Thread.sleep(4000);	   
		  driver.get("https://nsi.ngenioussolutions.com/");
          System.out.println("Back to Home Page");
	  }
	  
	  public static void UsefulLinks() throws Exception
	  {
		  Thread.sleep(5000);
	        JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,250)");
			String actual = driver.findElement(By.xpath("//*[@id=\"menu-item-2004\"]/a")).getText();

			System.out.println(actual);
			String expected = ("Case Studies");
			
			Assert.assertEquals(actual,expected);		
			System.out.println("Verified Text for Link 1");
			Thread.sleep(2000);	
			
			Thread.sleep(5000);
			String actual1 = driver.findElement(By.xpath("//*[@id=\"menu-item-2005\"]/a")).getText();
			System.out.println(actual1);
			String expected1 = ("News Room");
				
		    Assert.assertEquals(actual1,expected1);		
			System.out.println("Verified Text for Link 2");
			Thread.sleep(2000);	
			
			Thread.sleep(5000);
			String actual2 = driver.findElement(By.xpath("//*[@id=\"menu-item-2006\"]/a")).getText();
			System.out.println(actual2);
			String expected2 = ("Blog");
				
		    Assert.assertEquals(actual2,expected2);		
			System.out.println("Verified Text for Link 3");
			Thread.sleep(2000);	
			
			Thread.sleep(5000);
			String actual3 = driver.findElement(By.xpath("//*[@id=\"menu-item-2008\"]/a")).getText();
			System.out.println(actual3);
			String expected3 = ("Career");
				
		    Assert.assertEquals(actual3,expected3);		
			System.out.println("Verified Text for Link 4");
			Thread.sleep(2000);	 
			
			Thread.sleep(5000);
			String actual4 = driver.findElement(By.xpath("//*[@id=\"menu-item-3317\"]/a")).getText();
			System.out.println(actual4);
			String expected4 = ("Intranet Solutions");
				
		    Assert.assertEquals(actual4,expected4);		
			System.out.println("Verified Text for Link 5");
			Thread.sleep(2000);	 
			
			Thread.sleep(5000);
			String actual5 = driver.findElement(By.xpath("//*[@id=\"menu-item-2007\"]/a")).getText();
			System.out.println(actual5);
			String expected5 = ("White Papers");
				
		    Assert.assertEquals(actual5,expected5);		
			System.out.println("Verified Text for Link 6");
			Thread.sleep(2000);	 
			
			Thread.sleep(5000);
			String actual6 = driver.findElement(By.xpath("//*[@id=\"menu-item-2010\"]/a")).getText();
			System.out.println(actual6);
			String expected6 = ("Privacy Policy");
				
		    Assert.assertEquals(actual6,expected6);		
			System.out.println("Verified Text for Link 7");
			Thread.sleep(2000);	 
			
			Thread.sleep(5000);
			String actual7 = driver.findElement(By.xpath("//*[@id=\"menu-item-2011\"]/a")).getText();
			System.out.println(actual7);
			String expected7 = ("Sitemap");
				
		    Assert.assertEquals(actual7,expected7);		
			System.out.println("Verified Text for Link 8");
			Thread.sleep(2000);	 
	  }
	  public static void UsefulLinksOnclick() throws Exception
	  {
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("menu-item-2004"))));
		  driver.findElement(By.id("menu-item-2004")).click();
          System.out.println("Clicked on first Link");
		  Thread.sleep(4000);
		  driver.navigate().back();
		  Thread.sleep(4000);	   
		  driver.get("https://nsi.ngenioussolutions.com/");
          System.out.println("Back to Home Page");
		  
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("menu-item-2005"))));
		  driver.findElement(By.id("menu-item-2005")).click();
          System.out.println("Clicked on Second Link");
		  Thread.sleep(4000);
		  driver.navigate().back();
		  Thread.sleep(4000);	   
		  driver.get("https://nsi.ngenioussolutions.com/");
          System.out.println("Back to Home Page");
		  
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"menu-item-2006\"]/a"))));
		  driver.findElement(By.xpath("//*[@id=\"menu-item-2006\"]/a")).click();
		  Thread.sleep(3000);
          System.out.println("Clicked on Third Link");
		  Thread.sleep(4000);
		  driver.navigate().back();
		  Thread.sleep(4000);	   
		  driver.get("https://nsi.ngenioussolutions.com/");
	      System.out.println("Back to Home Page");

		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"menu-item-2008\"]/a"))));
		  driver.findElement(By.xpath("//*[@id=\"menu-item-2008\"]/a")).click();
          System.out.println("Clicked on Fourth Link");
		  Thread.sleep(4000);
		  driver.navigate().back();
		  Thread.sleep(4000);	   
		  driver.get("https://nsi.ngenioussolutions.com/");
          System.out.println("Back to Home Page");
          
          Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"menu-item-3317\"]/a"))));
		  driver.findElement(By.xpath("//*[@id=\"menu-item-3317\"]/a")).click();
          System.out.println("Clicked on Fifth Link");
		  Thread.sleep(4000);
		  driver.navigate().back();
		  Thread.sleep(4000);	   
		  driver.get("https://nsi.ngenioussolutions.com/");
          System.out.println("Back to Home Page");
          
          Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("menu-item-2007"))));
		  driver.findElement(By.id("menu-item-2007")).click();
          System.out.println("Clicked on Sixth Link");
		  Thread.sleep(4000);
		  driver.navigate().back();
		  Thread.sleep(4000);	   
		  driver.get("https://nsi.ngenioussolutions.com/");
          System.out.println("Back to Home Page");
          
          Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("menu-item-2010"))));
		  driver.findElement(By.id("menu-item-2010")).click();
          System.out.println("Clicked on Seventh Link");
		  Thread.sleep(4000);
		  driver.navigate().back();
		  Thread.sleep(4000);	   
		  driver.get("https://nsi.ngenioussolutions.com/");
          System.out.println("Back to Home Page");
          
          Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("menu-item-2011"))));
		  driver.findElement(By.id("menu-item-2011")).click();
          System.out.println("Clicked on Seventh Link");
		  Thread.sleep(4000);
		  driver.navigate().back();
		  Thread.sleep(4000);	   
		  driver.get("https://nsi.ngenioussolutions.com/");
          System.out.println("Back to Home Page");
	  }
	  
	  public static void SocialLinksFooter() throws Exception
	  {
		 Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"gyan_social-2\"]/div/div/div[2]/ul/li[1]/a")).click();
		System.out.println("Clicked on Twitter");
		Thread.sleep(5000);
		 Set<String> handler =driver.getWindowHandles();
		 Iterator<String> it= handler.iterator();
		 String ParentWindowid=it.next();
		 System.out.println("Parent window id is "+ ParentWindowid);
		 Thread.sleep(3000);
		 String childWindowid=it.next();
		 System.out.println("Child window id is "+ childWindowid);
		 
		 driver.switchTo().window(childWindowid);
		 Thread.sleep(5000);
		 driver.close();
		 Thread.sleep(5000);
		 driver.switchTo().window(ParentWindowid);
		 Thread.sleep(3000);
			 
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id=\"gyan_social-2\"]/div/div/div[2]/ul/li[2]/a")).click();
		 System.out.println("Clicked on Facebook");
		 Thread.sleep(5000);
		 Set<String> handler1 =driver.getWindowHandles();
	     Iterator<String> it1= handler1.iterator();
	     String ParentWindowid1=it1.next();
	     System.out.println("Parent window id is "+ ParentWindowid1);
	     Thread.sleep(3000);
	      String childWindowid1=it1.next();
	      System.out.println("Child window id is "+ childWindowid1);
				 
	      driver.switchTo().window(childWindowid1);
	      Thread.sleep(5000);
          driver.close();
	      Thread.sleep(5000);
	      driver.switchTo().window(ParentWindowid1);
	      Thread.sleep(3000);
			 
	      Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id=\"gyan_social-2\"]/div/div/div[2]/ul/li[3]/a")).click();
		  System.out.println("Clicked on LinkedIn");
		  Thread.sleep(5000);
		  Set<String> handler2 =driver.getWindowHandles();
		  Iterator<String> it2= handler2.iterator();
		  String ParentWindowid2=it2.next();
		  System.out.println("Parent window id is "+ ParentWindowid2);
		  Thread.sleep(3000);
		  String childWindowid2=it2.next();
		  System.out.println("Child window id is "+ childWindowid2);
					 
		  driver.switchTo().window(childWindowid2);
		  Thread.sleep(5000);
	      driver.close();
		  Thread.sleep(5000);
		  driver.switchTo().window(ParentWindowid2);
		  Thread.sleep(3000); 
			
		}
	  
	  
}
