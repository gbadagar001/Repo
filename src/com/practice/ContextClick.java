package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ContextClick 
{
	@Test
	public static void testContextClick()
	{
		//Open the Firefox Browser
		WebDriver driver=new FirefoxDriver();
		//Open IE Browser
		//System.setProperty("webdriver.ie.driver","D:\\Girish\\IEandChrome drivers\\IEDriverServer.exe");
		//WebDriver driver=new InternetExplorerDriver();
		//Open Chrome browser
		//System.setProperty("webdriver.chrome.driver", "D:\\Girish\\IEandChrome drivers\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
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
		WebElement toElement = driver.findElement(By.xpath("//div[text()='Tasks']"));
		//Actions class
		Actions actions=new Actions(driver);
		actions.contextClick(toElement).perform();
		//Open in New TAB
		actions.sendKeys("t").perform();
		//Open in New Window
		//actions.sendKeys("w").perform();
		
		
	}

}
