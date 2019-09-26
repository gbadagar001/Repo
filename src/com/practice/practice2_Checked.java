package com.practice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class practice2_Checked 
{
	@Test
	public static void testpractice2()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//URL
		driver.get("http://sdjgf-pc/login.do");
		//Check the check box 'keep me logged in'
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		boolean status = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		if(status)
		{
			Reporter.log("Chech box is checked",true);
		}
		else
		{
			Reporter.log("Chech box is not checked",true);
		}		
		
	}

}
