package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class S_AlertPopUp 
{
	@Test
	public void testAlertPopUp() throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Projects')]")).click();
		driver.findElement(By.xpath("//input[@value='Delete Selected']")).click();
		Thread.sleep(2000);
		//Switch to alert get message on pop up and click on OK/Cancel
		Alert alert = driver.switchTo().alert();
		String PopUpMesg = alert.getText();
		System.out.println("Message on the pop up"+PopUpMesg);
		//Accept the pop up-OK
		alert.accept();
		//Dismiss the pop up-Cancel
		//alert.dismiss();
		Thread.sleep(2000);
		//Log out
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
