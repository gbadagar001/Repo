package com.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Collections_ArraListDemo2_IteratorI {

	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		Iterator<String> itr = al.iterator();//Iterator Interface
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
