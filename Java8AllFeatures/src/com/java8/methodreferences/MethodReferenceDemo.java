package com.java8.methodreferences;

public class MethodReferenceDemo {

	public static int multiply(int num1, int num2) {
		return num1*num2;
	}
	
	public static void main(String[] args) {
		Calculator calc = (num1, num2) -> num1+num2;
		
		int additionResult = calc.calculate(4, 6);
		System.out.println("Addition Result is : " + additionResult);
		
		//Calculator calc2 = (num1, num2) -> num1*num2;
		Calculator calc2 = MethodReferenceDemo::multiply; //Static Method Reference
		int multiplyResult = calc2.calculate(4, 6);
		System.out.println("Multiplication Result is : " + multiplyResult);
	}

}
