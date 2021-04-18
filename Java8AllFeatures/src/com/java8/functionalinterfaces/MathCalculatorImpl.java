package com.java8.functionalinterfaces;

public class MathCalculatorImpl {

	public static void main(String[] args) {
		MathCalculator cal = (a, b) -> a+b;
		
		int sum = cal.add(10, 5);
		System.out.println("Sum: " + sum);
		
	}

}
