package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AT_ExplicitWait_WebDriverWait 
{
	@Test
	public void testAT_ExplicitWait_WebDriverWait() throws InterruptedException
	{
		//System.setProperty("webdriver.firefox.bin","C:\\Users\\gbadagar001\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,20);
		driver.get("http://127.0.0.1/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		WebElement Login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginButton")));
		Login.click();
		//driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		WebElement Logout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		Logout.click();
		Thread.sleep(2000);
		driver.close();

	}

}
