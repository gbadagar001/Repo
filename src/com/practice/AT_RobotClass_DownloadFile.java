package com.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AT_RobotClass_DownloadFile 
{
	@Test
	public void testAT_RobotClass_DownloadFile () throws AWTException, InterruptedException
	{
		System.setProperty("webdriver.firefox.bin","C:\\Users\\gbadagar001\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/");
		driver.findElement(By.xpath("//a[text()='mailmerge.xls']")).click();
		Robot robot = new Robot();
		//robot.delay(2000);
		Thread.sleep(2000);
		//Press down arrow key
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		//Press TAB
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		//Thread.sleep(2000);
		robot.delay(2000);
		//Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		//Close the application
		driver.close();

	}

}
