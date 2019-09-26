package com.practice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AT_3_LoginPage_Text_Validation 
{
	@Test
	public void testAT_3_LoginPage_Text_Validation() throws InterruptedException
	{
		//System.setProperty("webdriver.firefox.bin","C:\\Users\\gbadagar001\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do");

		String etext1 = "Please identify yourself";
		String atext1 =driver.findElement(By.xpath("//*[@id='headerContainer']")).getText();
		System.out.println("atext1:-"+atext1);
		Assert.assertEquals(atext1, etext1);

//		String etext2="To login for the first time use the following username and password:";
//		String atext2=driver.findElement(By.xpath("//*[contains(text(),'username and password:')]")).getText();
//		System.out.println("atext2:-"+atext2);
//		Assert.assertEquals(atext2, etext2);

//		boolean result1 = driver.findElement(By.xpath("//div[b[text()='admin']]")).isDisplayed();
//		Assert.assertTrue(result1);
//
//		boolean result2 = driver.findElement(By.xpath("//div[b[text()='manager']]")).isDisplayed();
//		Assert.assertTrue(result2);

//		String atext3="It is strongly recommended to change the default password to keep your data secure.";
//		String etext3=driver.findElement(By.xpath("//td[contains(text(),'strongly recommended')]")).getText();
//		System.out.println("atext3:-"+atext3);
//		Assert.assertEquals(atext3, etext3);

//		boolean result3 = driver.findElement(By.xpath("//img[@src='/img/default/login/alarm.gif?hash=797059755']")).isDisplayed();
//		Assert.assertTrue(result3);
//
//		boolean result4 = driver.findElement(By.xpath("//img[@src='/img/default/login/timer.gif?hash=797059755']")).isDisplayed();
//		Assert.assertTrue(result4);
//
//		boolean result5 = driver.findElement(By.xpath("//img[@src='/img/default/logo.gif?hash=797059755']")).isDisplayed();
//		Assert.assertTrue(result5);
//
//		boolean result6 = driver.findElement(By.xpath("//img[@src='/img/default/login/sloagan.gif?hash=797059755']")).isDisplayed();
//		Assert.assertTrue(result6);

		String etext4 = "Keep me logged in unless I log out";
		String atext4 = driver.findElement(By.id("keepLoggedInLabel")).getText();
		System.out.println("atext4:-"+atext4);
		Assert.assertEquals(atext4,etext4);

		String etext5 = "Do not select if this computer is shared";
		String atext5 =driver.findElement(By.xpath("//div[contains(text(),'computer is shared')]")).getText();
		System.out.println("atext5:-"+atext5);
		Assert.assertEquals(atext5, etext5);

		Thread.sleep(2000);

		//close the browser
		driver.quit();	
	}
}
 