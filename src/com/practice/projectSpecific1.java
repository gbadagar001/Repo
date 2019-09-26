package com.practice;

import org.openqa.selenium.By;
import org.testng.Assert;

public class projectSpecific1 extends STestNG
{
	//static WebDriver driver;
	public static void Login(String UN,String PWD)
	{
		//Enter User Name
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(UN);
		//Enter Password
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(PWD);
		//Click on Login
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	}

	public static void Logout() throws InterruptedException
	{
		//wait
		Thread.sleep(2000);
		//Log out from application
		driver.findElement(By.xpath("//a[contains(text(),'out')]")).click();
	}

	public static void Verification(String etextLogout )
	{
		String atextLogout = driver.findElement(By.xpath("//a[contains(text(),'out')]")).getText();
		Assert.assertEquals(atextLogout, etextLogout);
	}	
}


