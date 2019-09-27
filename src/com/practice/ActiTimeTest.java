package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ActiTimeTest 
{
	@Test
	public void testActiTimeTest() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Reporter.log("Opening Actitime");
		driver.get("http://127.0.0.1/login.do");
		Reporter.log("Getting the Title1");
		System.out.println("Title1:-"+driver.getTitle());
		Thread.sleep(3000);
		Reporter.log("Opening Google");
		driver.navigate().to("http://www.google.com");
		Thread.sleep(3000);
		Reporter.log("Press Back");
		driver.navigate().back();
		Thread.sleep(3000);
		Reporter.log("Press Refresh");
		driver.navigate().refresh();
		Thread.sleep(3000);
		Reporter.log("Press Forward");
		driver.navigate().forward();
		Reporter.log("Getting the Title2");
		System.out.println("Title2:-"+driver.getTitle());
		System.out.println();
		Reporter.log("Close the Browser");
		//driver.close();
		driver.quit();
		
	}

}
