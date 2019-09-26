package com.practice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Guru99CrossBrowserScript 
{
	WebDriver driver;
 // This function will execute before each Test tag in testng.xml

@BeforeTest
@Parameters("browser")
public void PreCondition(String browser) throws Exception{

    //Check if parameter passed from TestNG is 'firefox'
    if(browser.equalsIgnoreCase("firefox"))
    {   
    	//create firefox instance
        driver = new FirefoxDriver();

    }

    //Check if parameter passed as 'chrome'
    else if(browser.equalsIgnoreCase("chrome"))
    {
        System.setProperty("webdriver.chrome.driver","D:\\Raddi's documents\\Girish\\IEandChrome drivers\\chromedriver.exe");
        //create chrome instance
        driver = new ChromeDriver();

    }
   else if(browser.equalsIgnoreCase("ie"))
   {

        System.setProperty("webdriver.ie.driver","D:\\Raddi's documents\\Girish\\IEandChrome drivers\\IEdriverServer.exe");
        //create IE instance
        driver = new InternetExplorerDriver();

    }

    else
    {
        //If no browser passed throw exception
        throw new Exception("Browser is not correct");

    }
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

}

@AfterTest
public void PostCondition()
{
	driver.quit();
	
}


@Test

public void testParameterWithXML() throws InterruptedException
{

    driver.get("http://127.0.0.1/login.do");
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("pwd")).sendKeys("manager");
    driver.findElement(By.linkText("Login")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Logout")).sendKeys(Keys.RETURN);
   
       }
}