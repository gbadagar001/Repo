package com.practice;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class T_ActitimeLoginLogout 
{
	@Test
	public void testT_ActitimeLoginLogout () throws InterruptedException
	{
		//WebDriver driver;
		//System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.firefox.bin","C:\\Users\\gbadagar001\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		WebDriver driver=new FirefoxDriver();
		Dimension size = driver.manage().window().getSize();
		System.out.println("Before Maximizing the browser:-"+size);
		driver.manage().window().maximize();
		Dimension size1 = driver.manage().window().getSize();	
		System.out.println("After Maximizing the browser:-"+size1);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		driver.manage().window().setSize(new Dimension(600,500));
		driver.findElement(By.id("logoutLink")).click();
		Dimension size2 = driver.manage().window().getSize();
		System.out.println("After resizing the browser:-"+size2);
		Thread.sleep(2000);
		driver.quit();

	}

}
