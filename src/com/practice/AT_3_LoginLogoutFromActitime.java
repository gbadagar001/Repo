package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AT_3_LoginLogoutFromActitime// extends SuperTestNG
{
	@Test
	public void testAT_3_LoginLogoutFromActitime () throws InterruptedException
	{
		System.setProperty("webdriver.firefox.bin","C:\\Users\\gbadagar001\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		Reporter.log("Opening firefox browser");
		WebDriver driver=new FirefoxDriver();

		Reporter.log("Implicitely wait for 30 seconds");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		Reporter.log("Maximizing the browser");
		driver.manage().window().maximize();

		Reporter.log("Launching URL http://127.0.0.1/login.do");
		driver.get("http://127.0.0.1/login.do");

		Reporter.log("Enter username");
		driver.findElement(By.name("username")).sendKeys("admin");

		Reporter.log("Enter password");
		driver.findElement(By.name("pwd")).sendKeys("manager");

		Reporter.log("Click on Login");
		driver.findElement(By.xpath("//a[text()='Login']")).click();

		Reporter.log("wait for 2 seconds");
		Thread.sleep(2000);

		Reporter.log("Click on Tasks tab");		
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();

		Reporter.log("Click on Customers & Projects Dropdown");
		driver.findElement(By.xpath("//td[@id='cpSelector.cpButton.contentsContainer']")).click();

		Thread.sleep(1000);
		Reporter.log("Click on selected Customers Projects Radio button");
		driver.findElement(By.id("selectedCustomersProjectsRadio")).click();

		Thread.sleep(1000);
		driver.findElement(By.id("cpSelector.cpPopup.cpListbox_item_0")).click();

		Thread.sleep(1000);
		Reporter.log("Click on clear selection");
		driver.findElement(By.xpath("//span[text()='clear selection']")).click();

		Thread.sleep(1000);
		Reporter.log("Click on Close button");
		driver.findElement(By.id("closeButton")).click();

		//Wait for 2 seconds
		Thread.sleep(2000);

		Reporter.log("Click on Logout button");
		driver.findElement(By.id("logoutLink")).click();

		//Wait for 2 seconds
		Thread.sleep(2000);
		Reporter.log("Close the application");
		driver.close();

	}

}
