package com.practice;

public class javaProgram 
{
	int i=100;//Global Variable

	public static void main(String[] args) 
	{
		int i=10;//Local Variable
		test2();
		System.out.println("Welcome to JAVA:="+i);
		test1();

	}
	
	public static void test1()
	{
		System.out.println("test1");
		test2();
		
	}
	
	public static void test2()
	{
		System.out.println("test2");
	}

}
