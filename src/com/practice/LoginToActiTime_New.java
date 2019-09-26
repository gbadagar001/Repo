package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginToActiTime_New
{
	@Test
	public void testLoginToActiTime() throws InterruptedException
	{
		//open the browser
		WebDriver driver=new FirefoxDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Implicitely time wait
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		//Open the application
		driver.get("http://127.0.0.1/login.do");
		//Enter Username
		driver.findElement(By.name("username")).sendKeys("admin");
		//Enter Password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//Click on Login
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		//Wait for some time
		Thread.sleep(3000);//Wait for 3 seconds
		//Log out from application
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		//Wait for some time
		Thread.sleep(3000);//Wait for 3 seconds
		//Close the application and browser
		//Closes all the instances of browser
		driver.quit();
		//Close the only that instance of browser
		//driver.close();
	
		
	}

}
