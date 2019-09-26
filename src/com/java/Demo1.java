package com.java;

public class Demo1 {

	static char ch;
	void print(int number)
	{
		for (int i = 1; i <= 10; i++) {
			System.out.println(number*i);
		}
	}
	private static void printAlphabetsInLowerCase() {
		for (char ch= 'a';  ch<='z'; ch++) {
			System.out.println(ch);			
		}		
	}
	private static void printAlphabetsInUpperCase() {
		for (char ch= 'A';  ch<='Z'; ch++) {
			System.out.println(ch);			
		}		
	}
	private static boolean isVowel(char ch) {
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			return true;
		else if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			return true;
		else
	    return false;
	}
	public static void main(String[] args) {

		Demo1 demo = new Demo1();
		demo.print(5);
		Demo1.printAlphabetsInLowerCase();
		Demo1.printAlphabetsInUpperCase();
		System.out.println(Demo1.isVowel('A'));
		System.out.println(demo.isConsonant('a'));

	}
	private boolean isConsonant(char ch) {
		if(!isVowel(ch))
			return true;
		return false;		
	}
	
	
	

}
