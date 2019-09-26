package com.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AT_dataProvider 
{
	//to
	//subject
	//mail body
	@Test(dataProvider="getData")
	public void testMailSending(String to,String sub,String msg)
	{
		System.out.println(to+"----"+sub+"----"+msg);
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//rows-no oftimes test has to be repeated
		//cols-no of parameters in test data
		Object[][]  data=new Object[2][3];
		//1st row
		data[0][0]="xyz@gmail.com";
		data[0][1]="sub1";
		data[0][2]="Body1";
		//2nd row
		data[1][0]="abc@gmail.com";
		data[1][1]="sub2";
		data[1][2]="Body2";
		
		return data;
		
	}

}
