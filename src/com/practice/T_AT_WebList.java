package com.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class T_AT_WebList 
{
	@Test
	public void testT_AT_WebList() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Tasks')]")).click();
		driver.findElement(By.linkText("Projects & Customers")).click();
		WebElement listElement= driver.findElement(By.name("selectedCustomer"));
		Select select = new Select(listElement);
		List<WebElement> allOptions = select.getOptions();
		System.out.println("No of Options:-"+allOptions.size());
		for (int i = 0; i <allOptions.size(); i++) 
		{
			WebElement element = allOptions.get(i);
			System.out.print(element.getText()+"-->");
			System.out.println(element.getAttribute("value"));
			Thread.sleep(1000);
			
		}
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
