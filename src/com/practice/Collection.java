package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection {

	public static void main(String[] args) {

		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(111);
		arrayList.add(11);
		arrayList.add(21);
		arrayList.add(17);

		Collections.sort(arrayList);

		for(Integer value:arrayList)
		{System.out.println(value);

		}
		}

}
