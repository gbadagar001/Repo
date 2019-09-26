package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AT_LoginToActitime_2017// extends commonMethods
{
	@Test
	public void testAT_LoginToActitime_2017() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do");
		//Enter username, password and click on Login
		//Login("admin","manager");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.linkText("Login")).click();
		//Wait for 2 seconds
		Thread.sleep(2000);
		//Logout from the application
		driver.findElement(By.linkText("Logout")).click();
		//Close the browser
		//driver.close();//Closing the current instance
		driver.quit(); //Closing all the instances

	}

}
