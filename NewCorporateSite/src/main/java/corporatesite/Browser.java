package corporatesite;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Browser 
{
	public static WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public static void setApplication(String browser) throws Exception
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", ".\\SeleniumDriver\\chromedriver.exe");
			driver=new ChromeDriver();	
			System.out.println("Chrome Browser Opened");
			driver.manage().window().maximize();
			driver.get("https://nsi.ngenioussolutions.com/");
		}
		if(browser.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver", ".\\SeleniumDriver\\msedgedriver.exe");
			driver=new EdgeDriver();	
			System.out.println("Edge Browser Opened");
			driver.manage().window().maximize();
			driver.get("https://nsi.ngenioussolutions.com/");
		}
		if(browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", ".\\SeleniumDriver\\geckodriver.exe");
			driver=new FirefoxDriver();	
			System.out.println("Firefox Browser Opened");
			driver.get("https://nsi.ngenioussolutions.com/");
		}
		
		

		if(browser.equalsIgnoreCase("IPADPortrait"))
		{
			
			Map<String, Object> deviceMetrics = new HashMap<>();

			deviceMetrics.put("width", 768);

			deviceMetrics.put("height", 1024);

			deviceMetrics.put("pixelRatio", 3.0);

			Map<String, Object> mobileEmulation = new HashMap<>();

			mobileEmulation.put("deviceMetrics", deviceMetrics);

			
			mobileEmulation
			.put("userAgent",
			"Mozilla/5.0 (iPad; CPU OS 12_2 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E148");
			
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
			
			System.setProperty("webdriver.chrome.driver", ".\\SeleniumDriver\\chromedriver.exe");

			driver = new ChromeDriver(chromeOptions);
				
			driver.manage().window().maximize();
			driver.get("https://nsi.ngenioussolutions.com/");
			
			
	
			
		
		
				
				
		}
		
		if(browser.equalsIgnoreCase("IPADlandscape"))
		{
			
			Map<String, Object> deviceMetrics = new HashMap<>();

			deviceMetrics.put("width", 1024);

			deviceMetrics.put("height", 768);

			deviceMetrics.put("pixelRatio", 3.0);

			



			Map<String, Object> mobileEmulation = new HashMap<>();

			mobileEmulation.put("deviceMetrics", deviceMetrics);

//			mobileEmulation.put("userAgent",
//				"Mozilla/5.0 (Linux; Android 6.0.1; Moto G (4) Build/MPJ24.139-64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.146 Mobile Safari/537.36 PTST/201104.191133");

			
//			
			mobileEmulation
			.put("userAgent",
			"Mozilla/5.0 (iPad; CPU OS 12_2 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E148");

				
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
			
			System.setProperty("webdriver.chrome.driver", ".\\SeleniumDriver\\chromedriver.exe");

			driver = new ChromeDriver(chromeOptions);
				
			driver.manage().window().maximize();
			driver.get("https://nsi.ngenioussolutions.com/");
			
				
				
		}
		
		
		
		if(browser.equalsIgnoreCase("MotoG4Portrait"))
		{
			
			Map<String, Object> deviceMetrics = new HashMap<>();
			deviceMetrics.put("width", 360);
			deviceMetrics.put("height", 640);
			deviceMetrics.put("pixelRatio", 3.0);//g4

			Map<String, Object> mobileEmulation = new HashMap<>();

			mobileEmulation.put("deviceMetrics", deviceMetrics);

			mobileEmulation
			.put("userAgent",
			"Mozilla/5.0 (Linux; Android 6.0.1; Moto G (4) Build/MPJ24.139-64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.146 Mobile Safari/537.36 PTST/201104.191133");

			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
			
			System.setProperty("webdriver.chrome.driver", ".\\SeleniumDriver\\chromedriver.exe");

			driver = new ChromeDriver(chromeOptions);
				
			driver.manage().window().maximize();
			driver.get("https://nsi.ngenioussolutions.com/");
			
				
				
		}
		if(browser.equalsIgnoreCase("MotoG4Landscape"))
		{
			
			Map<String, Object> deviceMetrics = new HashMap<>();
			deviceMetrics.put("width", 640);
			deviceMetrics.put("height", 360);
			deviceMetrics.put("pixelRatio", 3.0);//g4

			Map<String, Object> mobileEmulation = new HashMap<>();

			mobileEmulation.put("deviceMetrics", deviceMetrics);

			mobileEmulation
			.put("userAgent",
			"Mozilla/5.0 (Linux; Android 6.0.1; Moto G (4) Build/MPJ24.139-64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.146 Mobile Safari/537.36 PTST/201104.191133");

			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
			
			System.setProperty("webdriver.chrome.driver", ".\\SeleniumDriver\\chromedriver.exe");

			driver = new ChromeDriver(chromeOptions);
				
			driver.manage().window().maximize();
			driver.get("https://nsi.ngenioussolutions.com/");
			
				
				
		}
	

		if(browser.equalsIgnoreCase("GalaxyS5Potrait"))
		{
			
			Map<String, Object> deviceMetrics = new HashMap<>();
			deviceMetrics.put("width", 360);
			deviceMetrics.put("height", 640);
			deviceMetrics.put("pixelRatio", 3.0);//g4

			Map<String, Object> mobileEmulation = new HashMap<>();

			mobileEmulation.put("deviceMetrics", deviceMetrics);

			mobileEmulation
			.put("userAgent",
			"Mozilla/5.0 (Linux; Android 6.0.1; SM-G900V Build/MMB29M) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.98 Mobile Safari/537.36");

			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
			
			System.setProperty("webdriver.chrome.driver", ".\\SeleniumDriver\\chromedriver.exe");

			driver = new ChromeDriver(chromeOptions);
				
			driver.manage().window().maximize();
			driver.get("https://nsi.ngenioussolutions.com/");
			
				
				
		}
		
		if(browser.equalsIgnoreCase("GalaxyS5Landscape"))
		{
			
			Map<String, Object> deviceMetrics = new HashMap<>();
			deviceMetrics.put("width", 640);
			deviceMetrics.put("height", 360);
			deviceMetrics.put("pixelRatio", 3.0);//g4

			Map<String, Object> mobileEmulation = new HashMap<>();

			mobileEmulation.put("deviceMetrics", deviceMetrics);

			mobileEmulation
			.put("userAgent",
			"Mozilla/5.0 (Linux; Android 6.0.1; SM-G900V Build/MMB29M) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.98 Mobile Safari/537.36");

			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
			
			System.setProperty("webdriver.chrome.driver", ".\\SeleniumDriver\\chromedriver.exe");

			driver = new ChromeDriver(chromeOptions);
				
			driver.manage().window().maximize();
			driver.get("https://nsi.ngenioussolutions.com/");
			
				
				
		}
		if(browser.equalsIgnoreCase("iphonexPortrait"))
		{
			
			Map<String, Object> deviceMetrics = new HashMap<>();
			deviceMetrics.put("width", 375);
			deviceMetrics.put("height", 812);
			deviceMetrics.put("pixelRatio", 3.0);//g4

			Map<String, Object> mobileEmulation = new HashMap<>();

			mobileEmulation.put("deviceMetrics", deviceMetrics);

			mobileEmulation
			.put("userAgent",
			"Mozilla/5.0 (iPhone; CPU iPhone OS 10_3 like Mac OS X)AppleWebKit/602.1.50 (KHTML, like Gecko) CriOS/56.0.2924.75Mobile/14E5239e Safari/602.1");

			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
			
			System.setProperty("webdriver.chrome.driver", ".\\SeleniumDriver\\chromedriver.exe");

			driver = new ChromeDriver(chromeOptions);
				
			driver.manage().window().maximize();
			driver.get("https://nsi.ngenioussolutions.com/");
			
				
				
		}
		
		if(browser.equalsIgnoreCase("iphonexLandscape"))
		{
			
			Map<String, Object> deviceMetrics = new HashMap<>();
			deviceMetrics.put("width", 812);
			deviceMetrics.put("height", 375);
			deviceMetrics.put("pixelRatio", 3.0);//g4

			Map<String, Object> mobileEmulation = new HashMap<>();

			mobileEmulation.put("deviceMetrics", deviceMetrics);

			mobileEmulation
			.put("userAgent",
			"Mozilla/5.0 (iPhone; CPU iPhone OS 10_3 like Mac OS X)AppleWebKit/602.1.50 (KHTML, like Gecko) CriOS/56.0.2924.75Mobile/14E5239e Safari/602.1");

			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
			
			System.setProperty("webdriver.chrome.driver", ".\\SeleniumDriver\\chromedriver.exe");

			driver = new ChromeDriver(chromeOptions);
				
			driver.manage().window().maximize();
			driver.get("https://nsi.ngenioussolutions.com/");
			
				
				
		}
		
	}
//	@AfterTest
//	public static void closetest()
//	{
//		driver.close();
//		System.out.println("Browser closed");
//	}
}
