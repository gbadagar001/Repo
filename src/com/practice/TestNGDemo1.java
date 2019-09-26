package com.practice;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo1 
{
    @BeforeMethod
	public void precondition()
	{
		Reporter.log("login to the application",true);
		
	}
    
    @AfterMethod
	public void postcondition()
	{
		Reporter.log("logout from the application",true);
		
	}
    
    @Test(dependsOnMethods="testDemoB")//Execution of this method depends on execution of testDemoB()
    public void testDemoA()            //testDemo1() will execute once testDemoB() executed
    {
    	Reporter.log("Delete a Customer",true);
    }
    
    @Test
    public void testDemoB()
    {
        Reporter.log("Create a Customer",true);
    }

}
