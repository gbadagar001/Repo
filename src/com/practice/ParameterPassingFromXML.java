package com.practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterPassingFromXML
{
	@Test
	@Parameters("myName")
	public void testParameterPassingFromXML(String myName)
	{
		System.out.println(myName);
	}

}
