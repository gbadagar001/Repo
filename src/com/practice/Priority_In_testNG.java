package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Priority_In_testNG 
{       
	WebDriver driver;           

	//Method 1: Open Browser say Firefox           
	@Test(priority=1)      
	public void openBrowser() 
	{             
		System.setProperty("webdriver.firefox.bin","C:\\Users\\gbadagar001\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		driver = new FirefoxDriver();    
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}       

	//Method 2: Launch Google.com          
	@Test(priority=2)      
	public void launchGoogle() 
	{                
		driver.get("http://www.google.co.in");                      
	}       

	//Method 3: Perform a search using "Facebook"          
	@Test(priority=3)      
	public void peformSeachAndClick1stLink() 
	{              
		driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys("Facebook");                             
	}       
	//Method 5: Close the browser
	@Test(priority=5)
	public void CloseBrowser()
	{
		driver.close();
	}

	//Method 4: Verify Google search page title.           
	@Test(priority=4)      
	public void FaceBookPageTitleVerification() throws Exception 
	{              
		driver.findElement(By.xpath(".//*[@value='Search']")).click();                      
		Thread.sleep(3000);     
		Assert.assertEquals(driver.getTitle().contains("Facebook - Google Search"),true);   
		//Assert.assertEquals(driver.getTitle().contains("Facebook - Google Search"),true);
	}     


}
