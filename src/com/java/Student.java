package com.java;

public class Student {

	
	public static int maximumOfMarks() {
		int[] marks = {98,100,99,101};
		//ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,6,4));
		int max = Integer.MIN_VALUE;
		for(int mark:marks) {
			if(mark > max)
			{
				max = mark;
			}		
	}
		return max;
}
}
