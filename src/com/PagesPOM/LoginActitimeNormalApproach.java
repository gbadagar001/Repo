package com.PagesPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginActitimeNormalApproach 
{
	WebDriver driver;
	
	By UserName=By.name("username");
	By Password=By.name("pwd");
	By Login=By.id("loginButton");
	
	public LoginActitimeNormalApproach(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	public void setUserName(String UN)
	{
		driver.findElement(UserName).sendKeys(UN);
	}
	
	public void setPassword(String PWD)
	{
		driver.findElement(Password).sendKeys(PWD);
	}
	
	public void clickLogin()
	{
		driver.findElement(Login).click();
	}
	
//	public void LoginToActitime(String UID,String Pass)
//	{
//		this.setUserName(UID);
//		this.setPassword(Pass);
//		this.clickLogin();
//		
//	}
	
	public void LoginToActitime(String UID,String Pass)
	{
		driver.findElement(UserName).sendKeys(UID);
		driver.findElement(Password).sendKeys(Pass);
		driver.findElement(Login).click();		
		
	}

}
