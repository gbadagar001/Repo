package com.practice;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SuperTestNGDemo
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
}


