package com.practice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AT_Test_230816 
{
	@Test
	public void testAT_Test_230816_1() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Work\\geckodriver.exe");
		//Launch Firefox Browser
		System.out.println("Opening Firefox Browser");
		WebDriver driver=new FirefoxDriver();
		//Implicitely wait for 30 seconds
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Maximize the Browser
		System.out.println("Maximizing the Browser");
		driver.manage().window().maximize();
		//Launch the URL
		System.out.println("Opening URL");
		driver.get("http://www.google.com");
		//Enter text to search
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Giriyappa Badagar");
		//Click on Search button
		driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']")).click();
		//Wait for 2 minutes
		Thread.sleep(2000);
		//Close all instances of Browser
		System.out.println("Closing the Browser");
		driver.quit();
		//System.out.println("Browser has been closed");
		Reporter.log("Browser has been closed",true);
		//Close current instance of Browser
		//driver.close();
	}
	
	@Test
	public void testAT_Test_230816_2() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Work\\geckodriver.exe");
		//Launch Firefox Browser
		System.out.println("Opening Firefox Browser");
		WebDriver driver=new FirefoxDriver();
		//Implicitely wait for 30 seconds
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Maximize the Browser
		System.out.println("Maximizing the Browser");
		driver.manage().window().maximize();
		//Launch the URL
		System.out.println("Opening URL");
		driver.get("http://www.google.com");
		//Enter text to search
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Giriyappa Badagar");
		//Click on Search button
		driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']")).click();
		//Wait for 2 minutes
		Thread.sleep(2000);
		//Close all instances of Browser
		System.out.println("Closing the Browser");
		driver.quit();
		//System.out.println("Browser has been closed");
		Reporter.log("Browser has been closed",true);
		//Close current instance of Browser
		//driver.close();
	}
	
	@Test
	public void testAT_Test_230816_3() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Work\\geckodriver.exe");
		//Launch Firefox Browser
		System.out.println("Opening Firefox Browser");
		WebDriver driver=new FirefoxDriver();
		//Implicitely wait for 30 seconds
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Maximize the Browser
		System.out.println("Maximizing the Browser");
		driver.manage().window().maximize();
		//Launch the URL
		System.out.println("Opening URL");
		driver.get("http://www.google.com");
		//Enter text to search
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Giriyappa Badagar");
		//Click on Search button
		driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']")).click();
		//Wait for 2 minutes
		Thread.sleep(2000);
		//Close all instances of Browser
		System.out.println("Closing the Browser");
		driver.quit();
		//System.out.println("Browser has been closed");
		Reporter.log("Browser has been closed",true);
		//Close current instance of Browser
		//driver.close();
	}
}
