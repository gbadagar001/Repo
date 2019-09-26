package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CheckBoxSelectionVerification 
{
	@Test
	public void testCheckBoxSelectionVerification() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.navigate().to("http://127.0.0.1/login.do");
		driver.findElement(By.xpath("//input[contains(@id,'CheckBox')]")).click();
		//Verify that checkbox checked or not
		boolean status = driver.findElement(By.xpath("//input[contains(@id,'CheckBox')]")).isSelected();
		if(status)
		{
			System.out.println("checkbox is selected");
		}
		else
		{
			System.out.println("checkbox is not selected ");
		}
		Thread.sleep(3000);
		driver.quit();
		
	}

}
