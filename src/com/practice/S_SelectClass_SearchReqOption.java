package com.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class S_SelectClass_SearchReqOption 
{
	@Test
	public void testSearchReqOption () throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Girish/Desktop/MyPage.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		//Select Class
		WebElement listview = driver.findElement(By.name("country"));
		Select select=new Select(listview);
		List<WebElement> allOptions = select.getOptions();
		String flag = "Not Found";
		String eOptionName = "Canada";
		for (int i = 0; i <allOptions.size(); i++)
		{
			String aOptionName = allOptions.get(i).getText();
			if (eOptionName.equals(aOptionName))
			{
				flag="Found";
				break;
				
			}
			
		}
		System.out.println(flag);
		Thread.sleep(2000);
		driver.quit();
	}
	

}
