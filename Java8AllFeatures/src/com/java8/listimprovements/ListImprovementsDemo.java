package com.java8.listimprovements;

import java.util.Arrays;
import java.util.List;

public class ListImprovementsDemo {

	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("Apple","Mango","Orange");
		
	    /*
		for (int i=0; i<fruits.size(); i++) {
		 
			fruits.set(i, fruits.get(i).toUpperCase());
		}
		System.out.println("Fruits: " + fruits);
		*/
		
		fruits.replaceAll(str -> str.toUpperCase());
		
		System.out.println("Fruits2: " + fruits);
		
	}

}
