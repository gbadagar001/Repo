package com.java;

import java.util.Arrays;

public class Demo_Arrays1 {
	public static void main(String[] args) {
		//Enhanced for loop
		int[] marks = {20,12,29,17,30};
		for(int mark:marks)
		{
			System.out.println(mark);
		}

		int[] a1= {1,2,3};
		int[] a2= {1,2,3,2};
		if(Arrays.equals(a1, a2))
		{
			System.out.println("Arrays a1 and a2 are equal");
		}else
		{
			System.out.println("Arrays a1 and a2 are not equal");
		}
		Arrays.sort(a2);
		for(int a:a2)
		{
			System.out.println(a);
		}

		System.out.println(Arrays.toString(a1));
		//int A=Integer.MIN_VALUE;
		//System.out.println(A);
		
		int maximum = Student.maximumOfMarks();
		System.out.println("maximum of marks "+maximum);
	}
}