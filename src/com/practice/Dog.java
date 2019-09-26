package com.practice;

abstract class Animal1
{
	abstract void run();
}

public class Dog extends Animal1
{
	void run()
	{
		System.out.println("Dog is running");
	}
	
	public static void main(String args[])
	{
		Animal1 a=new Dog();
		a.run();
	}

}
