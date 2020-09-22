package com.demo.collectionexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Hyderabad");
		cities.add("Delhi");
		cities.add("Noida");
		cities.add("Bhopal");
		cities.add("Simla");
		cities.add("Mumbai");
		cities.add("Hyderabad");

		cities.add(2, "Chandigarh");
		cities.remove(5);
		System.out.println(cities);
		Collections.sort(cities,new MyListSorter());
		
		System.out.println("After sort"+cities);
	}

}

class MyListSorter implements Comparator<String>{

	@Override
	public int compare(String arg0, String arg1) {
		// TODO Auto-generated method stub
		return arg1.compareTo(arg0);
	}
	
}