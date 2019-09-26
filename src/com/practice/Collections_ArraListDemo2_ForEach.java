package com.practice;

import java.util.ArrayList;

public class Collections_ArraListDemo2_ForEach {

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("A");
		for(String obj:al)//For each loop
		{
			System.out.println(obj);
		}
	}

}
