package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

/*'###############################################################################
'-------------------------------------------------------------------------------
' Case Study: Case Study 1
' Script Name: TS_HDFCAutomation
' Brief Functional Description: Automate the Home, CSR, About US pages
' Created On: DD-MMM-YYYY
' Created By: Enterprise ID
' Comments/Remmark: 
'-------------------------------------------------------------------------------
'###############################################################################
 */
public class HDFC extends ReadPropertyFile
{
	@Test
	static void testHDFC() throws InterruptedException
	{

		//WebDriver driver=new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		//driver.get("http://www.hdfcbank.com/");
		System.out.println("URL="+driver.getCurrentUrl());
		String expected = "http://www.hdfcbank.com/";
		Assert.assertEquals(expected,driver.getCurrentUrl());
		String eTitle = "HDFC Bank: Personal Banking Services";
		System.out.println("Title="+driver.getTitle());
		Assert.assertEquals(eTitle,driver.getTitle());

		//Component 1 **********************************************************************************************
		//Verify default value-NetBanking
		String actual1   = driver.findElement(By.xpath("//div[text()='NetBanking']")).getText();
		//System.out.println("actual1:-"+actual1);
		String expected1 ="NetBanking";
		Assert.assertEquals(actual1, expected1);

		//Verify drop down options
		String expected2 = "NetBanking";
		driver.findElement(By.xpath("//div[text()='NetBanking']")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//li[@id='netbanking']")).getText(), expected2);

		driver.navigate().refresh();
		Thread.sleep(1000);
		String expected3 = "Prepaid/ Forex Card";
		driver.findElement(By.xpath("//div[text()='NetBanking']")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//li[@id='prepaidcard']")).getText(), expected3);

		driver.navigate().refresh();
		Thread.sleep(1000);
		String expected4 = "Verified by Visa/ MasterCard SecureCode/ Netsafe/ RuPay PaySecure";
		driver.findElement(By.xpath("//div[text()='NetBanking']")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//li[@id='netsafe']")).getText(), expected4);

		//Component 2 ************************************************************************************************		
		//Verifying CSR link
		boolean CSRTrue = driver.findElement(By.linkText("CSR")).isDisplayed();
		Assert.assertTrue(CSRTrue);
		//Click on CSR link
		driver.findElement(By.linkText("CSR")).click();
		//Verify-Navigated to CSR page
		String CSRTitlee="HDFC Bank- CSR Responsibility - Overview";
		Assert.assertEquals(driver.getTitle(),CSRTitlee);
		//Verify CSR link not visible here
		//boolean CSRFalse = driver.findElement(By.linkText("CSR")).isDisplayed();

		//Component 3 *************************************************************************************************
		//Navigate back to HDFC Home Page
		driver.navigate().back();
		//Click on About us link
		driver.findElement(By.linkText("About us")).click();
		String AUExpected = "HDFC Bank - Leading Bank in India, Banking Services, Private Banking, Personal Loan, Car Loan";
		Assert.assertEquals(driver.getTitle(),AUExpected);
		//Verifying Find your nearest drop down options
		String[] exp = {"Please Select","Branch","ATM","PhoneBanking","Branch with LAS Facility","Branch with Lockers","Branch collecting Direct Tax","NRI Centre","Retail Loan Service Centre","Access Point in Gulf","Access Point in Kenya","Access Point in Hong Kong"};
		WebElement dropdown = driver.findElement(By.name("where"));  
		Select select = new Select(dropdown);  

		List<WebElement> options = select.getOptions();  
		for(WebElement we:options)  
		{  
			boolean match = false;
			for (int i=0; i<exp.length; i++)
			{
				if (we.getText().equals(exp[i]))
				{
					//System.out.println(we.getText());
					match = true;
				}
			}
			Assert.assertTrue(match);
		} 
		//System.out.println("All the options within the dropdowns are matching");

	}

}
