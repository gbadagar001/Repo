package com.practice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginActiTIMELogout 
{
	@Test
	public void testLoginLogoutFromActiTIME() throws InterruptedException
	{
		//Opening browser
		WebDriver driver=new FirefoxDriver();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		//get the URL
		driver.navigate().to("http://127.0.0.1/login.do");
		//Maximize the browser
		driver.manage().window().maximize();
		//Login to application
		//Enter the username
		driver.findElement(By.name("username")).sendKeys("admin");
		System.out.println("Entered Username");
		//Enter password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		System.out.println("Entered Password");
		//Click on Login Button
		driver.findElement(By.id("loginButton")).sendKeys(Keys.RETURN);
		System.out.println("Logged in");
		//wait
		Thread.sleep(5000);
		//Logout
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logged out");
		//wait
		Thread.sleep(2000);
		//Close the browser
		driver.quit();
		//driver.close()
		System.out.println("Closing the Browser");
		System.out.println("");
		
	}

}
