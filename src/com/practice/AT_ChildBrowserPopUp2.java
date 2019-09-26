package com.practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AT_ChildBrowserPopUp2 
{
	@Test
	public void testAT_ChildBrowserPopUp2() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do");
		driver.findElement(By.linkText("Actimind Inc.")).click();
		//get window handles of parent and child
		Iterator<String> allWH = driver.getWindowHandles().iterator();
		String Parent = allWH.next();
		String Child = allWH.next();
		//switch to child and close it
		driver.switchTo().window(Child);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Home Page']")).click();
		Thread.sleep(3000);
		driver.close();
		//Switch to Parent and close it
		driver.switchTo().window(Parent);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		driver.close();
	}
}


