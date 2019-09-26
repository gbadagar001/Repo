package com.practice;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo2 
{
	@BeforeMethod(groups={"all"})
	public void precondition()
	{
		Reporter.log("login",true);
	}
	
	@AfterMethod(groups={"all"})
	public void postcondition()
	{
		Reporter.log("logout",true);
	}
	
	@Test(priority=1)
	public void testA()
	{
		Reporter.log("Create Customer",true);
		
	}
	
	@Test(priority=0)
	public void testB()
	{
		Reporter.log("Delete Customer",true);
		
	}
	
	@Test(priority=3)
	public void testC()
	{
		Reporter.log("Create Product",true);
		
	}
	
	@Test(priority=2)
	public void testD()
	{
		Reporter.log("Delete Customer",true);
		
	}

}
