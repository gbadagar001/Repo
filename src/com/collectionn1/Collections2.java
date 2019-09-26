package com.collectionn1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Collections2 {

	public static void main(String[] args) {
		//Immutable list,Mutable list
		//Immutable-Can't change once created
		//ArrayList
		List<String> words = Arrays.asList("Apple","Bat","Cat");
		List<String> wordsArrayList = new ArrayList<String>(words);
		wordsArrayList.add("Elephant");//At the end
		wordsArrayList.add(2,"Ball");//At any position
		wordsArrayList.add("Ball");//Duplicates allowed in ArrayList

		List<String> newList = Arrays.asList("Yak","Zebra");
		wordsArrayList.addAll(newList);//All the elements are added at the end
		//wordsArrayList.addAll(2,newList);//All the elements are added from position 2
		
		//Replacing a value in a list
		wordsArrayList.set(5,"Fish");//Ball will be deleted and Fish will be added to that place
		
		//Removing/Deleting elements
		wordsArrayList.remove(5);
        //wordsArrayList.remove("Fish");
		//If there are multiple instances for same value then 1st instance will get deleted
		//like ("A","C","D","C")
				
		for(String a:wordsArrayList)
		{
			System.out.println(a);
		}
		System.out.println("-------------------");
		
		Iterator wordsIterator = words.iterator();
		while(wordsIterator.hasNext())
		{
			System.out.println(wordsIterator.next());
		}

	}

}
