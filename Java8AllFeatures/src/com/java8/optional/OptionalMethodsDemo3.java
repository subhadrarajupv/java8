package com.java8.optional;

import java.util.Optional;

public class OptionalMethodsDemo3 {

	public static void main(String[] args) {
		
		Optional<String> opStr = Optional.of("Hello World");
		Optional<String> result = opStr.filter(str -> str.startsWith("Hello"));
		System.out.println("Result isPresent: " + result.isPresent());
		System.out.println("Result: "+ result.get());
		
		Optional<String> result2 = opStr.filter(str -> str.startsWith("World"));
		System.out.println("Result2 isPresent: " + result2.isPresent());
		
		Optional<String> opStr2 = Optional.ofNullable(null);
		Optional<String> result3 = opStr2.filter(str -> str.startsWith("Hello"));
		System.out.println("Result3 isPresent: " + result3.isPresent());
		
		Optional<Integer> opNum = Optional.of(5);
		Optional<Double> doubleResult = opNum.map(num -> num * 2.5);
		System.out.println("Result isPresent: " + doubleResult.isPresent());
		System.out.println("Result : " + doubleResult.get());
		
		Optional<Integer> opNum2 = Optional.ofNullable(null);
		Optional<Double> doubleResult2 = opNum2.map(num -> num * 2.5);
		doubleResult2.ifPresent(val -> System.out.println(val));
	}
}