package com.practice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AT_Test_DeleteUser_ATime 
{
	@Test(groups={"Delete"})
	public void testAT_Test_DeleteUser_ATime() throws IOException, InterruptedException
	{
		//Launch Firefox Browser
		System.out.println("Opening Firefox Browser");
		WebDriver driver=new FirefoxDriver();
		//Implicitely wait for 30 seconds
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Maximize the Browser
		System.out.println("Maximizing the Browser");
		driver.manage().window().maximize();
		//Launch the URL
		System.out.println("Opening URL");
		//Call Authentication pop up AutoIT script
		Runtime.getRuntime().exec("C:\\Users\\gbadagar001\\Desktop\\AuthenticationPopUp.exe");
		driver.get("http://127.0.0.1/login.do");
		//Enter valid credentials and login
		System.out.println("Login in with valid credentials");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		System.out.println("Login is successful");
		//Wait for 1 minutes-Blind wait
		Thread.sleep(1000);
		//CLick on Users tab
		driver.findElement(By.xpath("//div[text()='Users']")).click();
		//Click on the user to delete
		driver.findElement(By.xpath("//a[contains(text(),'Giriyappa')]")).click();
		//Click on delete user
		driver.findElement(By.xpath("//input[@value='Delete This User']")).click();
		//Click Ok for Alter pop up
		Alert alert = driver.switchTo().alert();
		alert.accept();
		//Verify Success message
		boolean successmsg = driver.findElement(By.xpath("//span[@class='successmsg']")).isDisplayed();
		Assert.assertTrue(successmsg);
		System.out.println("User has been deleted successfully");
		//wait for 2 seconds
		Thread.sleep(2000);
		//Logout from the application
		System.out.println("loging out");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logged out");
		//Wait for 2 minutes
		Thread.sleep(2000);
		//Close all instances of Browser
		System.out.println("Closing the Browser");
		driver.quit();
		System.out.println("Browser has been closed");
	}

}
