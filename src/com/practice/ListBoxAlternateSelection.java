package com.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ListBoxAlternateSelection 
{
	@Test
	public static void testListBoxAlternateSelection()
	{
		//Open the browser
		WebDriver driver=new FirefoxDriver();
		//Wait
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		//Maximize
		driver.manage().window().maximize();
		//Get the URL
		driver.get("file:///C:/Users/sdjgf/Desktop/SelectList.html");
		//Select class
		WebElement listElements = driver.findElement(By.name("Country"));
		Select select=new Select(listElements);
		List<WebElement> allOptions = select.getOptions();
		for (int i = 0; i <allOptions.size(); i++)
		{
			WebElement element = allOptions.get(i);
			System.out.print(element.getText()+"-->");
			System.out.println(element.getAttribute("value"));
						
		}
	}

}
