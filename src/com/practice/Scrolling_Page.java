package com.practice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Scrolling_Page 
{
	@Test
	public void testScrolling_Page() throws InterruptedException
	{
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
		driver.findElement(By.linkText("Projects & Customers")).click();
		Thread.sleep(3000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		//actions.sendKeys(Keys.PAGE_UP).perform();
		//Scroll Page DOWN
//		for (int i = 0; i<=2; i++) 
//		{
//			actions.sendKeys(Keys.PAGE_DOWN).perform();
//		}
		Thread.sleep(3000);
		actions.sendKeys(Keys.PAGE_UP).perform();
		//Scroll Page UP
//		for (int i = 0; i<=2; i++) 
//		{
//			actions.sendKeys(Keys.PAGE_UP).perform();
//		}
//		//Scroll Page RIGHT
//		for (int i = 0; i<=10; i++) 
//		{
//			actions.sendKeys(Keys.RIGHT).perform();
//		}
//		//Scroll the Page LEFT
//		for (int i = 0; i<=10; i++) 
//		{
//			actions.sendKeys(Keys.LEFT).perform();
//		}
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
