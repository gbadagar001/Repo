package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class S_ContextClick_ActionsClass 
{
	@Test
	public void testContextClick_ActionsClass() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://www.yesbank.in/");
		Actions actions = new Actions(driver);
		//Mouse move to Corporate Banking
		WebElement elementCBanking = driver.findElement(By.xpath("//a[@title='Corporate Banking']/span"));
		actions.contextClick(elementCBanking).perform();
		//Oprn in separate tab
		//actions.sendKeys("t").perform();
		//open in seperate window
		actions.sendKeys("w").perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
