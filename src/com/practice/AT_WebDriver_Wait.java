package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AT_WebDriver_Wait 
{
	@Test
	public void testAT_WebDriver_Wait() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,20);
		driver.get("http://127.0.0.1/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginButton")));
		login.click();
		Thread.sleep(2000);
		WebElement logout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));		
		logout.click();
		Thread.sleep(2000);
		driver.close();		
	}

}