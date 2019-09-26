package com.collectionn1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Collection_List {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Apple","Bat","Cat");
		System.out.println(words.size());
		System.out.println(words.isEmpty());
		System.out.println(words.get(0));
		System.out.println(words.contains("Cat"));
		System.out.println(words.contains("Dog"));
		System.out.println(words.indexOf("Cat"));
		System.out.println(words.indexOf("Dog"));
		//System.out.println(words.add("Dog"));
		//Will get exceptions as List is immutable
		//To resolve this we can create ArrayList,LinkedList,Vector
		List<String> wordsArrayList = new ArrayList<String>(words);
		List<String> wordsLinkedList = new LinkedList<String>(words);
		List<String> wordsVectorList = new Vector<String>(words);
		
		wordsArrayList.add("Dog");
		System.out.println(wordsArrayList.indexOf("Dog"));
		System.out.println(wordsArrayList.get(3));
		System.out.println(wordsArrayList.remove(3));
		
	}
	
}
