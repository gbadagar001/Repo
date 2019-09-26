package com.practice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SuperTestNGPOM 
{
	public WebDriver driver;
	@BeforeTest
    public void PreCondition()
    {

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://127.0.0.1/login.do");

    }

    @AfterTest
    public void PostCondition()
    {
    	driver.quit();

    }
}
