package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginToNaukriCom 
{
	@Test
	public static void LoginToNaukri()
	{
	  WebDriver driver = new FirefoxDriver(); 	
	  driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("https://login.naukri.com/nLogin/Login.php");
	  //Enter Username and Password
	  driver.findElement(By.id("emailTxt")).click();
	  driver.findElement(By.name("USERNAME")).sendKeys("girish.badagar@gmail.com");
	  driver.findElement(By.id("pwd1")).click();
	  driver.findElement(By.id("pwd1")).sendKeys("Poornima@123");
	  //Click on Login
	  driver.findElement(By.name("Login")).click();
	}

}
