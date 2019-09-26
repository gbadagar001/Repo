package com.practice;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HiddenDivisionPopUp 
{
	@Test
	public void testHiddenDivisionPopUp() throws InterruptedException
	{
		//Open the Firefox Browser
		WebDriver driver=new FirefoxDriver();
		//Wait
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		//Maximize
		driver.manage().window().maximize();
		//Get the URL
		driver.get("http://127.0.0.1/login.do");
		//Login
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
		driver.findElement(By.linkText("Projects & Customers")).click();
		//Select the Customer need to be deleted
		//Custmer Name-giri
		driver.findElement(By.xpath("//tr[td[table[tbody[tr[td[a[text()='giri']]]]]]]/td[6]/input")).click();
		//Click on 'Delete Selected'
		driver.findElement(By.xpath("//input[@value='Delete Selected']")).click();
		//Get text on pop up
		String TextOnPopUp = driver.findElement(By.id("deleteHeader")).getText();
		System.out.println(TextOnPopUp);
		//wait
		Thread.sleep(3000);
		//Click on 'Delete This Customer'
		driver.findElement(By.id("deleteButton")).click();
		//Verify the success message
		String aMsg = driver.findElement(By.xpath("//span[@class='successmsg']")).getText();
		String eMsg="Selected customers have been successfully deleted.";
		Assert.assertEquals(eMsg,aMsg);
		//Logout
		driver.findElement(By.linkText("Logout")).click();
		//Close the browser
		driver.quit();
		
	}

}
