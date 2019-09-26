package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class S_FileUploadPopUp 
{
	@Test
	public void testFileUploadPopUp() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.2shared.com/");
		driver.findElement(By.id("upField")).sendKeys("C:\\Users\\Girish\\Desktop\\GiriyappaBadagar.docx");
		driver.findElement(By.xpath("//input[@title='Upload file']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@value='Close']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
	

}
