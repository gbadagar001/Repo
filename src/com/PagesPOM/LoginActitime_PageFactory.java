package com.PagesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginActitime_PageFactory 
{
	
	WebDriver driver;
	
	public LoginActitime_PageFactory(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(name="username") 
	@CacheLookup
	WebElement username;
	
	@FindBy(how=How.NAME,using="pwd") 
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.XPATH,using="//a[@id='loginButton']") 
	@CacheLookup
	WebElement login_button;
	
	@FindBy(linkText="Actimind Inc.") 
	@CacheLookup
	WebElement actimind_link;
	
	@FindBy(id="keepLoggedInCheckBox")
	@CacheLookup
	WebElement KeepMeLoggedIn_checkBox;
	
	public void loginActitime(String uid,String pass)
	{
	
		username.sendKeys(uid);
		password.sendKeys(pass);
		login_button.click();
	}

}
