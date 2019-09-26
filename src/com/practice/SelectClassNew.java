package com.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectClassNew 
{
	@Test
	public void testSelectClassNew() throws InterruptedException
	{
		//open the browser
		WebDriver driver=new FirefoxDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Implicitely time wait
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		//Open the application
		driver.get("http://127.0.0.1/login.do");
		//Enter Username
		driver.findElement(By.name("username")).sendKeys("admin");
		//Enter Password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//Click on Login
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		//Wait for some time
		Thread.sleep(2000);//Wait for 2 seconds
		//Click on Tasks
		driver.findElement(By.xpath("//div[contains(text(),'Tasks')]")).click();
		//Click on Projects&Customers
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		//Customer list box
		WebElement listElement = driver.findElement(By.name("selectedCustomer"));
		Select select = new Select(listElement);
		int count = select.getOptions().size();
		List<WebElement> allOptions = select.getOptions();
		
//		for (int i = 0; i < count; i++) 
//		{
//			WebElement element = allOptions.get(i);
//			System.out.print(element.getText()+"->");
//			System.out.println(element.getAttribute("value"));
//		}
		//Searching required option
		
		String flag = "Not Found";
		String eOptionName = "ljglfjg";
		
		for (int i = 0; i < count; i++)
		{
			String aOptionName=allOptions.get(i).getText();
			if (eOptionName.equalsIgnoreCase(aOptionName))
			{
				flag="Found";
				break;
			}
		}
		System.out.println(flag);
		
		//select.selectByIndex(3);
		//select.selectByVisibleText("ljglfjg");
		Thread.sleep(3000);		
		//Log out from application
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		//Wait for some time
		Thread.sleep(2000);//Wait for 2 seconds
		//Close the application and browser
		//Closes all the instances of browser
		driver.quit();
		//Close the only that instance of browser
		//driver.close();
	
		
	}

}
