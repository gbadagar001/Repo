package com.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class S_checkAlCheckBoxes 
{
	@Test
	public void testS_checkAlCheckBoxes() throws InterruptedException
	{
		WebDriver driver=(WebDriver) new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.gsmarena.com/nokia-phones-1.php");
		//checking all the checkboxes
//		List<WebElement> allCheckBoxes = driver.findElements(By.xpath("//input[@type='Checkbox']"));
//		for (int i = 0; i < allCheckBoxes.size(); i++) 
//		{
//		
//			allCheckBoxes.get(i).click();
//		}
//		Thread.sleep(2000);
//		driver.quit();
		
		//Counting and getting all the names of links
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		System.out.println("No of links:"+allLinks.size());
		for (int i = 0; i < allLinks.size(); i++) 
		{
			String linkName = allLinks.get(i).getText();
			System.out.println(linkName);
		}
		driver.close();
	}

}
