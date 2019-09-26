package com.practice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class KendoUI_DropdownList 
{
	@Test
	public void testKendoUI_DropdownList() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demos.telerik.com/kendo-ui/dropdownlist/index");
		driver.findElement(By.xpath("//div[h4[text()='Cap Color']]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Orange']")).click();
		System.out.println("Option Selected:-"+driver.findElement(By.xpath("//li[text()='Orange']")).getText());
		Thread.sleep(2000);
		driver.close();
	}

}
