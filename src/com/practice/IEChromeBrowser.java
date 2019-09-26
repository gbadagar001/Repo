package com.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class IEChromeBrowser 
{
	@Test
	public void testS_checkAlCheckBoxes() throws InterruptedException
	{
		//IE Browser
		//System.setProperty("webdriver.ie.driver","D:\\Raddi's documents\\Girish1\\IEandChrome drivers\\IEDriverServer.exe");
		//WebDriver driver=(WebDriver) new InternetExplorerDriver();

		//Chrome Browser
		System.setProperty("webdriver.chrome.driver","D:\\Raddi's documents\\Girish1\\IEandChrome drivers\\chromedriver.exe");
		WebDriver driver=(WebDriver) new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.gsmarena.com/nokia-phones-1.php");

		//Counting and getting all the names of links
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		System.out.println("No of links:"+allLinks.size());
		for (int i = 0; i < allLinks.size(); i++) 
		{
			String linkName = allLinks.get(i).getText();
			System.out.println(linkName);
		}

		driver.close();
	}

}
