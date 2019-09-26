package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class S_HiddenDivisionPopUp 
{
	@Test
	public void testHiddenDivisionPopUp() throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
		driver.findElement(By.xpath("//input[@value='Create New Tasks']")).click();
		//driver.findElement(By.name("customerId")).click();
		WebElement listElement = driver.findElement(By.name("customerId"));
		Select select = new Select(listElement);
		select.selectByIndex(3);
		Thread.sleep(2000);
		//Clickon Time-Track
		driver.findElement(By.xpath("//div[text()='Time-Track']")).click();
		//Text on the pop up
		String textOnPopUp = driver.findElement(By.id("ConfirmQuest")).getText();
        System.out.println("Text On PopUp:->"+textOnPopUp);
		//Click on Cancel Task Creation button on the  pop up
		driver.findElement(By.id("DiscardChangesButton")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Projects')]")).click();
//		driver.findElement(By.linkText("All")).click();
//		driver.findElement(By.xpath("//input[@value='Delete Selected']")).click();
 		Thread.sleep(2000);
//		String textOnPopUp = driver.findElement(By.id("deleteHeader")).getText();
//		System.out.println("Text On PopUp:->"+textOnPopUp);
//		//Confirm Deletion
//		driver.findElement(By.id("deleteButton")).click();
//		//Verification for successful deletion
//		String eMsg = "Selected customers have been successfully deleted.";
//		String aMsg = driver.findElement(By.xpath("//span[@class='successmsg']")).getText();
//		Assert.assertEquals(aMsg,eMsg);
		//Logout
		driver.findElement(By.id("logoutLink")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
