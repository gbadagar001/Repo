package com.practice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class S_WindowPopUp_AutoIT 
{
	@Test
	public void testWindowPopUp_AutoIT() throws IOException
	{
		Runtime.getRuntime().exec("C:\\Users\\Girish\\Desktop\\WinPopUp.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("http://www.seleniumhq.org/download/");
		driver.findElement(By.xpath("//a[text()='2.44.0']")).click();
		//Runtime.getRuntime().exec("");
		
	}

}
