package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class S_DropDownMenuActionsClass 
{
	@Test
	public void test()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://www.yesbank.in/");
		Actions actions = new Actions(driver);
		//Mouse move to Corporate Banking
		WebElement elementCBanking = driver.findElement(By.xpath("//a[@title='Corporate Banking']/span"));
		actions.moveToElement(elementCBanking).perform();
		//Move to Investment Banking
		WebElement elementIBanking = driver.findElement(By.xpath("//a[@title='Investment Banking']/span"));
		actions.moveToElement(elementIBanking).perform();
		driver.findElement(By.xpath("//a[@title='Investment Banking']/span")).click();
//		//Click on Sustaonable Investment Banking
//		WebElement elementSIBanking = driver.findElement(By.xpath("//a[@title='Sustainable Investment Banking']/span"));
//		actions.moveToElement(elementSIBanking).perform();
//		driver.findElement(By.xpath("//a[@title='Sustainable Investment Banking']/span")).click();
//		//Wait for 2 seconds
     	//driver.quit();
		
	
	}

}
