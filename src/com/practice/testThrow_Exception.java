package com.practice;

public class testThrow_Exception 
{
	static void validate(int age)
	{  
		if(age<18)  
			//throw new ArithmeticException("not valid");  
			throw new ArithmeticException("Exception occurred");
		else  
			System.out.println("Exception did not occur");  
	}	

	public static void main(String[] args)
	{
		validate(16);  
		System.out.println("Rest of the code...");
	}

}
