package com.practice;

import org.testng.annotations.Test;

public class S_LoginToActime_POMTest extends SuperTestNGPOM
{
	    
	    S_LoginToActitimePagePOM objLogin;
	    
	    @Test(priority=0)
	    public void testS_LoginToActitimePOM() throws InterruptedException
	    {
	    	//Create Login Page object
	    	objLogin = new S_LoginToActitimePagePOM(driver);
	    	//login to application
	    	objLogin.loginToActiTime("admin","manager");

	    }
	    
}
