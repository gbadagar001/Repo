package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class S_CustomListBox 
{
	@Test
	public void testCustomListBox() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("http://www.yatra.com/");
		driver.findElement(By.name("flight_origin_city")).sendKeys("GOI");
		driver.findElement(By.name("flight_origin_city")).sendKeys(Keys.RETURN);
		driver.findElement(By.name("flight_destination_city")).sendKeys("BLR");
		driver.findElement(By.name("flight_destination_city")).sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		driver.quit();
	}

}
