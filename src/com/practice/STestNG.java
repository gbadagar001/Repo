package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class STestNG 
{
	static WebDriver driver;
	//Open Browser with required URL
	@BeforeMethod
	public static void PreCondition()
	{//Opening browser
		driver=new FirefoxDriver();
		//Wait
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		//Maximizing the Browser
		driver.manage().window().maximize();
		//Opening URL
		driver.get("http://127.0.0.1/login.do");
	}

	//Close the Browser
	@AfterMethod
	public static void PostCondition() throws InterruptedException
	{
		//wait
		Thread.sleep(3000);
		//Close the application
		driver.quit();
	}


}
