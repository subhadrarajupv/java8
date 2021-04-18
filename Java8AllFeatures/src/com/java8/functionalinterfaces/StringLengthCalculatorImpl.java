package com.java8.functionalinterfaces;

public class StringLengthCalculatorImpl {

	public static void main(String[] args) {
		StringLengthCalculator calc = str -> System.out.println("Length of a string \"" + str + "\" is: " + str.length()); 
		
		calc.printLength("Hello World");
		
		calc.printLength("I'm testing lambda expressions");
	}

}
