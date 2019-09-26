package com.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Collections_ArraListDemo2_addAll 
{

	public static void main(String[] args) 
	{
		ArrayList<String> al1=new ArrayList<String>();  
		  al1.add("Ravi");  
		  al1.add("Vijay");  
		  al1.add("Ajay");  
		    
		  ArrayList<String> al2=new ArrayList<String>();  
		  al2.add("Sonu");  
		  al2.add("Hanumant");  
		    
		  al1.addAll(al2);    
		  
		  Iterator<String> itr=al1.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
	}

}
