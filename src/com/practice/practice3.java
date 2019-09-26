package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class practice3
{
	@Test
	public static void testpractice3() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		
		//get the url
		driver.navigate().to("C:\\Users\\sdjgf\\Desktop\\SelectList.html");
		
		//Select list
		WebElement listElement = driver.findElement(By.name("Country"));
		Select select=new Select(listElement);
		if(select.isMultiple())
		{
			System.out.println("Select list is multiple select list");
		}
		else
		{
			System.out.println("Select list is not multiple select list");
		}
		for (int i = 0; i <select.getOptions().size(); i++) 
		{
			select.selectByIndex(i);
			Thread.sleep(1000);
		}
		select.deselectAll();		
		Thread.sleep(2000);
		driver.quit();		
	}

}
