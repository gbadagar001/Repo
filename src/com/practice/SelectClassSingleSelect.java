package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectClassSingleSelect 
{
	@Test
	public void testSelectClassSingleSelect() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Girish/Desktop/Mypage.html");
		WebElement listElement = driver.findElement(By.name("country"));
		Select select=new Select(listElement);
		select.selectByIndex(3);
		Thread.sleep(2000);
		driver.quit();
	}

}
