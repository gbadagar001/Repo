package com.practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AT_ChildBrowserPopUp1
{
	@Test
	public void testAT_ChildBrowserPopUp()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do");
		driver.findElement(By.linkText("Actimind Inc.")).click();
		Set<String> a = driver.getWindowHandles();
		Iterator<String> b = a.iterator();
		while (b.hasNext()) 
		{
           System.out.println(b.hasNext());
           System.out.println(b.next());
		}
	}

}
