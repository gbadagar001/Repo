package com.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class S_findElements 
{
	@Test
	public void testfindElements() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("http://www.gsmarena.com/nokia-phones-1.php");
		List<WebElement> allCheckBoxes = driver.findElements(By.xpath("//input[@type='Checkbox']"));
		for (int i = 0; i < allCheckBoxes.size(); i++) 
		{
			allCheckBoxes.get(i).click();
			
		}
		Thread.sleep(2000);
		driver.quit();
		
	}

}
