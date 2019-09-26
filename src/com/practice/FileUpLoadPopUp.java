package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FileUpLoadPopUp 
{
	@Test
	public void testFileUpLoadPopUp()
	{
		//Open the Firefox Browser 
		WebDriver driver=new FirefoxDriver();
		//Wait
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		//Maximize the browser
		driver.manage().window().maximize();
		//Navigate to the URL
		driver.get("http://www.2shared.com/");
		driver.findElement(By.id("upField")).sendKeys("C:\\Users\\Girish\\Desktop\\GiriyappaBadagar_3+_Years_ETL_QTP_Selenium.docx");
		driver.findElement(By.xpath("//input[@title='Upload file']")).click();
		
	}

}
