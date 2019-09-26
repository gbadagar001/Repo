package com.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NoOFLinksOnWebPage 
{
@Test
public static void testNoOFLinksOnWebPage() throws InterruptedException
{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
	//URL
	driver.get("http://127.0.0.1/login.do");
	List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
	System.out.println("Number of links:"+allLinks.size());
	 
	for (int i = 0; i <allLinks.size(); i++)
	{
		String linkName=allLinks.get(i).getText();
		System.out.println(linkName);
		
	}
	//Close the browser
	driver.quit();
}
}
