package com.practice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class T_BasicOperations 
{

	@Test
	public static void testT_BasicOperations() throws InterruptedException
	{
		//Open Browser
		WebDriver driver=new FirefoxDriver();
		//Maximize the Browser
		driver.manage().window().maximize();
		//Wait
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		//driver.get("http://127.0.0.1/login.do");
		driver.get("http://127.0.0.1/login.do");
		driver.navigate().to("http://www.google.com");
		//Navigate Back
		driver.navigate().back();
		//Navigate Forward
		driver.navigate().forward();
		//Refresh
		driver.navigate().refresh();
		//Get the title of the page
		String PageTitle = driver.getTitle();
		System.out.println("PageTile:"+PageTitle);
		//wait
		Thread.sleep(2000);
		//Close the Browser
		driver.quit();//Closing all the instances of Browser
		//driver.close(); //Closing only Browser Opened by WebDriver
		
		
	}

}

