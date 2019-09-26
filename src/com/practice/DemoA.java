package com.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA extends SuperTestNGDemo 
{
	@Test
	public void testDemoA()
	{
		Reporter.log("Create a Customer",true);
	}

}

