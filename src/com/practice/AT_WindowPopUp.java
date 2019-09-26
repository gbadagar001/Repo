package com.practice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AT_WindowPopUp 
{
	@Test
	public void testAT_WindowPopUp() throws IOException, InterruptedException
	{
		//Runtime.getRuntime().exec("..\\WindowPOpUP.exe");
		//Opening Browser
		WebDriver driver=new FirefoxDriver();
		//Wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Maximize the Browser
		driver.manage().window().maximize();
		//Launching URL
		driver.get("http://127.0.0.1/login.do");
		//Enter User Name
		driver.findElement(By.name("username")).sendKeys("admin");
		//Enter Password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//Click on Login
		driver.findElement(By.id("loginButton")).click();
		//Wait
		Thread.sleep(2000);
		//Click on Logout
		driver.findElement(By.id("logoutLink")).click();
		//Wait
		Thread.sleep(1000);
		//Close the Browser
		driver.quit();
		
	}

}
