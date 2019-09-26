package com.practice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class S_LoginLogoutActitime 
{
	@Test
	public void testLoginLogoutActitime() throws InterruptedException
	{
		//Open the browser
		WebDriver driver=new FirefoxDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Wait
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		//Open the application
		driver.get("http://127.0.0.1/login.do");
		//Enter user name
		driver.findElement(By.name("username")).sendKeys("admin");
		//Enter password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//Click on Login
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		//wait
		Thread.sleep(3000);
		//Logout
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(3000);
		//Close the browser
		//driver.close();
		driver.quit();
		
	}

}
