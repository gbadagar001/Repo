package com.Collections;

import java.util.ArrayList;

public class Collections2_ArrayListDemo {

	public static void main(String[] args) 
	{
      ArrayList l=new ArrayList();
      l.add("A");
      l.add(10);
      l.add("A");
      l.add(null);
      System.out.println(l);
      l.remove(2);
      System.out.println(l);
      l.add(2,"M");
      System.out.println(l);
      l.add("N");
      System.out.println(l);
      l.removeAll(l);
      System.out.println("Nothing:-"+l);
    
      
	}

}
