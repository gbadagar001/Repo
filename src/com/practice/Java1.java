package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Java1 
{
    @Test
	public void testJava1() throws InterruptedException 
	{
    	WebDriver driver=new FirefoxDriver();
    	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	driver.get("http://127.0.0.1/login.do");
    	String title = driver.getTitle();
    	System.out.println("Page Title is:-"+title);
    	Thread.sleep(3000);
    	driver.quit();
		//System.out.println("Welcome to Java");

	}

}
