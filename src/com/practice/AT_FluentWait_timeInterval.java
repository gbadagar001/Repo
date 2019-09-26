package com.practice;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class AT_FluentWait_timeInterval 
{
	@Test
	public void testAT_FluentWait_timeInterval() throws InterruptedException
	{
		System.setProperty("webdriver.firefox.bin","C:\\Users\\gbadagar001\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new HtmlUnitDriver();
		driver.manage().window().maximize();
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(30,TimeUnit.SECONDS)//it will wait maximum 30 seconds
				.pollingEvery(2,TimeUnit.SECONDS)//check for every 2 seconds
				.ignoring(NoSuchElementException.class);
		driver.get("http://127.0.0.1/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		WebElement Login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Login']")));
		Login.click();
		//Blind wait-2 seconds
		Thread.sleep(2000);
		//Logout form the application
		WebElement Logout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Logout']")));
		Logout.click();
		//Wait for 2 seconds
		Thread.sleep(2000);
		driver.close();
	}

}
