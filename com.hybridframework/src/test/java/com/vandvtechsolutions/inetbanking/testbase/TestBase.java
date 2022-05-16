package com.vandvtechsolutions.inetbanking.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.vandvtechsolutions.inetbanking.utility.ConfigDataProvider;
import com.vandvtechsolutions.inetbanking.utility.ExcelDataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
		public WebDriver driver;
		
		//System.getProperty("user.dir");
		
		static String configdatapath = "/Volumes/Prashik 3/Maven Project 2/Configuration/config.properties";
		static String excelDataProviderpath = "/Volumes/Prashik 3/Maven Project 2/TestData/TestData.xlsx";
		
		
		public static ConfigDataProvider configdataprovider;	
		public static ExcelDataProvider excelDataProvider;
				
		@BeforeSuite
		public void init()
		{
		configdataprovider = new ConfigDataProvider(configdatapath);
		excelDataProvider = new ExcelDataProvider(excelDataProviderpath);
		}
		
		
	@BeforeMethod
	@Parameters({"browser"})
	public void setup(@Optional("Chrome")String brName) 
		{     
			if(brName.equals("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(brName.equals("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("browser not matched please check with expected browser");
		}
		
		driver.manage().window().maximize();
		driver.get(configdataprovider.getURL());
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.quit();
	}
}
