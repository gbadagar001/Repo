package com.practice;

import org.testng.annotations.Test;

public class AT_LoginToActiTime_S3 extends projectSpecific1
{
	//static WebDriver driver;
	@Test
	public void testAT_LoginToActiTime_S3() throws InterruptedException
	{
		//ProjectSpecific.login("admin","manager");
		projectSpecific1.Login("admin","manager"); 
		//Verification-To make sure that User navigates to Home Page or Not
		String etextLogout = "Logout";
		//System.out.println("Actual:-"+atextLogout+" :: Expected:-"+etextLogout);
		projectSpecific1.Verification(etextLogout);
		//Calling Logout
		projectSpecific1.Logout();

	}


}
