package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class checkBoxCheckedOrNot 
{
	@Test
	public static void testcheckBoxCheckedOrNot()
	{
		//Open the Browser
		WebDriver driver=new FirefoxDriver();
		//wait
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		//Maximize the browser
		driver.manage().window().maximize();
		//Get URL
		driver.get("http://127.0.0.1/login.do");
		//Check the check box keep me logged in
		driver.findElement(By.xpath("//input[@name='remember']")).click();
		//Verify check box checked or not
		boolean status = driver.findElement(By.xpath("//input[@name='remember']")).isSelected();
		if(status)
		{
			System.out.println("Checkbox is selected");
		}
		else
		{
			System.out.println("Checkbox is NOT selected");
		}
		
	}

}
