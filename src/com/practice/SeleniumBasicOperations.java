package com.practice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumBasicOperations {

	public static void main(String[] args)
	{
		//Open the browser
		WebDriver driver=new FirefoxDriver();
		//Maximizing the browser
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		//Get URL
		driver.get("http://www.google.com");
		//Navigate to http://sdjgf-pc/login.do
		driver.navigate().to("http://sdjgf-pc/login.do");
		//Get the title of the page
		System.out.println("Title of the page"+driver.getTitle());
		//Click on back
		driver.navigate().back();
		//Click on Forward
		driver.navigate().forward();
		//Refresh the page
		driver.navigate().refresh();
		//Close the browser
		driver.close();
		//Selenium uses Locators to identify the elements
		//8 Basic identifiers
		//id,name,LinkTest,xpath,tagName,className,partialLinkText,CssSelector
		
		
	}

}
