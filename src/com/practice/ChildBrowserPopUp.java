package com.practice;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ChildBrowserPopUp 
{
	@Test
	public static void testChildBrowserPopUp() throws InterruptedException
  {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
	//URL
	driver.get("http://sdjgf-pc/login.do");
	//Click on 'License for using this software' link
	driver.findElement(By.id("licenseLink")).click();
	//wait
	Thread.sleep(3000);
	//Get the window handles of parent and child browser
	Iterator<String> allWH = driver.getWindowHandles().iterator();
	String parent=allWH.next();
	String child=allWH.next();
	//switch to child and close it
	driver.switchTo().window(child);
	driver.close();
	//Switch to parent and close it
	driver.switchTo().window(parent);
	driver.quit();
 }

}
