package com.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoB extends SuperTestNGDemo 
{
	@Test
	public void testDemob()
	{
		Reporter.log("Delete a customer",true);
	}

}
