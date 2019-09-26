package com.java;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number1:");
		int number1 = scanner.nextInt();
		System.out.println("Enter Number2:");
		int number2 = scanner.nextInt();
		System.out.println("Sum = "+(number1+number2));
		
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j+" ");				
			}
			System.out.println();		
		}
		
	}

}
