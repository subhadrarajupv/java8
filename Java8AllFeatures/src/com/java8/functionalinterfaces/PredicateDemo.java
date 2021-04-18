package com.java8.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<Integer> isEven = num -> num%2==0;
		
		System.out.println("Is 100 Even? : " + isEven.test(100));
		System.out.println("Is 5 Even? : " + isEven.test(5));
		System.out.println("Is 17 Even? : " + isEven.test(17));
		
	}

}
