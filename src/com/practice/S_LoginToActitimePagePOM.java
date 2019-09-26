package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S_LoginToActitimePagePOM extends SuperTestNGPOM
{

    By username = By.name("username");
    By Password = By.name("pwd");
   //By titleText =By.className("barone");
    By login = By.id("loginButton");
    By logout=By.linkText("Logout");

    public S_LoginToActitimePagePOM(WebDriver driver)
    {
        this.driver = driver;

    }

    //Set user name in textbox
    public void setUserName(String strUserName)
    {
        driver.findElement(username).sendKeys(strUserName);;

    } 

    //Set password in password textbox

    public void setPassword(String strPassword)
    {
         driver.findElement(Password).sendKeys(strPassword);

    }    

    //Click on login button

    public void clickLogin()
    {
         driver.findElement(login).click();
    }
    
    public void clickLogout()
    {
         driver.findElement(logout).click();
    }
    

    //Get the title of Login Page

//    public String getLoginTitle()
//    {
//
//     return    driver.findElement(titleText).getText();
//
//    }

 
    public void loginToActiTime(String strUserName,String strPasword) throws InterruptedException{

        //Fill user name
        this.setUserName(strUserName);
        //Fill password
        this.setPassword(strPasword);
        //Click Login button
        this.clickLogin(); 
        //Click Logout button
        Thread.sleep(2000);
        this.clickLogout();
        

        

    }

}


