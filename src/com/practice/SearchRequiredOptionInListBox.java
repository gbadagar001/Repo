package com.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SearchRequiredOptionInListBox 
{
	@Test
	public static void testSearchRequiredOptionInListBox()
	{
		//Open the Browser
		WebDriver driver=new FirefoxDriver();
		//Wait
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		//Maximize 
		driver.manage().window().maximize();
		//get URL
		driver.get("file:///C:/Users/sdjgf/Desktop/SelectList.html");
		WebElement listElements = driver.findElement(By.name("Country"));
		Select select=new Select(listElements);
		List<WebElement> allOptions = select.getOptions();
		String flag="Not found";
		String eOptionName="Sureban";
		for (int i = 0; i <allOptions.size(); i++)
		{
			String aOptionName = allOptions.get(i).getText();
			if(eOptionName.equals(aOptionName))
			{
				flag="found";
				break;
			}
			
		}
		System.out.println(flag);
	}

}
