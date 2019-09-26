package com.practice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class practice4_ContextClick 
{
	@Test
	public static void textpractice4() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		//URL
		driver.get("http://127.0.0.1/login.do");
		//Login
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		//Tasks
		WebElement elementTasks = driver.findElement(By.xpath("//div[text()='Tasks']"));
		Actions actions=new Actions(driver);
		actions.contextClick(elementTasks).perform();
		actions.sendKeys("w").perform();
		//Wait
		Thread.sleep(3000);
		//Close the browser
		driver.quit();
	}

}
