package com.practice;


import java.util.Scanner;

public class javaClass 
{
	public static void main(String args[])
	{
		Scanner giri=new Scanner(System.in);
		//System.out.println(giri.next());
		double fnum,snum,ans;
		System.out.println("First number:");
		fnum=giri.nextDouble();
		System.out.println("Second Number:");
		snum=giri.nextDouble();
		ans=fnum+snum;
		System.out.println("ans:");
		System.out.println(ans);
		
	}
	
	

}
