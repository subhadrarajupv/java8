package com.java8.functionalinterfaces;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<String, Integer> strLengthCheck = str -> str.length();
		
		String input = "This is a test string";
		System.out.println("Length: " + strLengthCheck.apply(input));
	}

}
