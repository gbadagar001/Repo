package com.practice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class S_SelectClass_MultipleSelection 
{
	@Test
	public void testSelectClass() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Girish/Desktop/MyPage.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		//Select Class
		WebElement listview = driver.findElement(By.name("country"));
		Select select=new Select(listview);
		int Count = select.getOptions().size();
		for (int i = 0; i < Count; i++)
		{
			select.selectByIndex(i);
			Thread.sleep(2000);
			
		}
		Thread.sleep(2000);
		select.deselectAll();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
