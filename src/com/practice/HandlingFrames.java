package com.practice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HandlingFrames 
{
	@Test
	public static void testHandlingFrames() throws InterruptedException, IOException
	{
		//Open the browser
		WebDriver driver=new FirefoxDriver();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		//Maximize the browser
		driver.manage().window().maximize();
		//Get the URL
		driver.get("file:///C:/Users/sdjgf/Desktop/Page1.html");
		//Switch to frame
		driver.switchTo().frame("f1");
		//driver.switchTo().frame(0);
		//Enter text to A2 text box
		driver.findElement(By.id("a2")).sendKeys("xyz");
		//Switch back to main page
		driver.switchTo().defaultContent();
		//Enter text to A1 text box
		driver.findElement(By.id("a1")).sendKeys("abc");
		//Wait
		Thread.sleep(3000);
		//Close the browser
		driver.quit();
		
		//Runtime.getRuntime().exec("d:\\popupo.exe");
	}

}
