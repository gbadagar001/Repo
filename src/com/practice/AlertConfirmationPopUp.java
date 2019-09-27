package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AlertConfirmationPopUp 
{
	@Test
	public static void testAlertConfirmationPopUp() throws InterruptedException
	{
		//Open the Firefox Browser
		WebDriver driver=new FirefoxDriver();
		//Wait
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		//Maximize
		driver.manage().window().maximize();
		//Get the URL
		driver.get("http://127.0.0.1/login.do");
		//Login
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
		driver.findElement(By.linkText("Projects & Customers")).click();
		//Click on Archive Selected
		driver.findElement(By.xpath("//input[@value='Archive Selected']")).click();
		//Switching to alert and the get the message and click on OK/Cancel
		//Explicit Wait
	    Thread.sleep(4000);
		Alert alert=driver.switchTo().alert();
		String message = alert.getText();
		System.out.println(message);
		//Click on OK
		alert.accept();
		//Click on Cancel
		//alert.dismiss();
		//Explicit Wait
		Thread.sleep(3000);
		//Close the Browser
		driver.quit();
		
	}

}
