package com.practice;
import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileNotFoundException;  
import java.io.IOException;  
import java.util.Properties;  
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class ReadPropertyFile 
{  

	public static WebDriver driver;
	//Properties file reader for browser type
	@BeforeMethod
	static void LaunchBrowser()
	{
		try{  
			// Create FileInputStream Object  
			FileInputStream fileInput = new FileInputStream(new File(".\\Data\\config.properties"));  
			// Create Properties object  
			Properties prop = new Properties();  
			//load properties file  
			prop.load(fileInput);  

			//Reading Properties Values  
			String browser = prop.getProperty("browserType");
			if(browser.equalsIgnoreCase("firefox"))
			{
				driver=new FirefoxDriver();
				//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				Reporter.log("Opening Firefox Browser",true);
			}
			else if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", ".\\exe\\chromedriver.exe");
				driver=new ChromeDriver();
				//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				Reporter.log("Opening Chrome Browser",true);
			}
			else
			{
				System.setProperty("webdriver.ie.driver", ".\\exe\\IEDriverServer.exe");
				driver=new InternetExplorerDriver();
				//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				Reporter.log("Opening Internet Explorer Browser",true);
			}
			driver.manage().window().maximize();
			Reporter.log("Maximizing Browser",true);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Reporter.log("Setting time out",true);
			String URL = "http://www.hdfcbank.com/";
			driver.get(URL);
			Reporter.log("Navigating to URL:"+URL,true);


		} catch (FileNotFoundException e) {  
			e.printStackTrace();  
		} catch (IOException e) {  
			e.printStackTrace();  
		} catch (NoSuchElementException e) {  
			e.printStackTrace();  
		} 

	} 

	@AfterMethod
	static void CloseBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}

} 