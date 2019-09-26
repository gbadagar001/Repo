package com.practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AT_Annotations 
{
	@Test
	public void testAnnotations1()
	{
		System.out.println("Test1");
		
	}
	@Test
	public void testAnnotations2()
	{
		System.out.println("Test2");
		
	}
	
	@BeforeMethod
	public void BM()
	{
		System.out.println("BM");
	}
	
	@AfterMethod
	public void AM()
	{
		System.out.println("AM");
	}
	
	@BeforeTest
	public void BT()
	{
		System.out.println("BT");
	}
	
	@AfterTest
	public void AT()
	{
		System.out.println("AT");
	}
	
	@BeforeSuite
	public void BS()
	{
		System.out.println("BS");
	}
	
	@AfterSuite
	public void AS()
	{
		System.out.println("AS");
	}
	
	
	

}
