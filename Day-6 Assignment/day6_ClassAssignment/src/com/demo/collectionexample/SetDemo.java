package com.demo.collectionexample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	HashSet<String> names = new HashSet<String>();
		//TreeSet<String> names = new TreeSet<>();
		Set<String> names = new HashSet<>();
		names.add("Abhi");
		names.add("Mayank");
		names.add("Bhago");
		
		
		System.out.println(names.contains("Abhi"));
		System.out.println(names);
		
		
		System.out.println(names.remove("Mayank"));
		System.out.println(names);
		
		names.add("Ratan");
		System.out.println(names);
		
		Iterator<String> itr = names.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
		
		System.out.println(names);
	}

}
