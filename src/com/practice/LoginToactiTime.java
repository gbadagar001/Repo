package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class LoginToactiTime 
{
	@Test
	public static void testLoginToactiTime() throws InterruptedException
	{
		//Set the exe path
		//System.setProperty("webdriver.ie.driver", "./exe/IEDriverServer.exe");
		//System.setProperty("webdriver.ie.driver","./exe/IEDriverServer.exe");
		//System.setProperty("webdriver.chrome.driver","./exe/chromedriver.exe");
		
		//Open the Browser
		//WebDriver driver=new InternetExplorerDriver();
		WebDriver driver=new FirefoxDriver();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		//Maximize the Browser
		driver.manage().window().maximize();
		//Get URL
		driver.get("http://127.0.0.1/login.do");
		//Login into actiTime application
		//Enter Username
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
        //driver.findElement(By.name("username")).sendKeys("admin");
        //Enter the password
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
        //driver.findElement(By.name("pwd")).sendKeys("manager");
        //Click on Login
		driver.findElement(By.xpath("//a[@id='loginButton']")).sendKeys(Keys.RETURN);
        //driver.findElement(By.id("loginButton")).click();
        //Syntax of cssSelector
        //htmlTag[property name='value']
        //driver.findElement(By.cssSelector("input[type='value']")).sendKeys("xyz");
		Thread.sleep(5000);
        //Logout
		driver.findElement(By.xpath("//a[text()='Logout']")).sendKeys(Keys.RETURN);
		//wait for 5 seconds
		Thread.sleep(5000);
		//Close the Browser
		driver.quit();
	}
}