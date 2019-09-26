package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DropDownMenu 
{
	@Test
	public static void testDropDownMenu()
	{
		//Open the browser
		WebDriver driver=new FirefoxDriver();
		//Wait
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		//Maximize
		driver.manage().window().maximize();
		//Actions class
		Actions actions=new Actions(driver);
		WebElement elementHotels = driver.findElement(By.name(""));
		//MOusehover on Hotels TAB
		actions.moveToElement(elementHotels).perform();
	}

}
