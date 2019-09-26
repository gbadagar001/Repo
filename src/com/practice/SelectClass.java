package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectClass 
{
	@Test
	public static void testSelectClass() throws InterruptedException
	{
		//open Browser
		WebDriver driver=new FirefoxDriver();
		//wait
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		//Maximize the Browser
		driver.manage().window().maximize();
		//Get The URL
		driver.get("file:///C:/Users/sdjgf/Desktop/SelectList.html");
		//Simple Select class
		//WebElement listElements = driver.findElement(By.name("Country"));
		//Select select=new Select(listElements);
		//select.selectByIndex(1);
		//select.selectByValue("SBN");
		//select.selectByVisibleText("Sureban");
		//Multiple Select class
		WebElement listElements = driver.findElement(By.name("Country"));
		Select select=new Select(listElements);
		int count = select.getOptions().size();
		for (int i = 0; i < count; i++) 
		{
			select.selectByIndex(i);
			
		}
		Thread.sleep(2000);
		select.deselectAll();
		
	}

}
