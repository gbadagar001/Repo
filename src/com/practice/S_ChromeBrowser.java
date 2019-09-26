package com.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S_ChromeBrowser 
{
	@Test
	public void testChromeBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Raddi's documents\\Girish\\IEandChrome drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("http://www.gsmarena.com/nokia-phones-1.php");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		//Number links on the page
		System.out.println("Number of links:="+allLinks.size());
		//Print all the link names on the webpage
		for (int i = 0; i <allLinks.size(); i++)
		{
			String linkName = allLinks.get(i).getText();
			System.out.println(linkName);
			
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
