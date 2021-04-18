package com.java8.optional;

import java.util.Optional;

public class OptionalMethodsDemo {

	public static void main(String[] args) {
		Optional<String> opStr = Optional.ofNullable("Hello Optional");
		System.out.println("Present: " + opStr.isPresent());
		
		Optional<String> opStr2 = Optional.ofNullable(null);
		System.out.println("Present: " + opStr2.isPresent());
		
		Optional<String> opStr3 = Optional.ofNullable("I am Optional Value");
		String value = opStr3.get();
		System.out.println("value: " + value);
		
		/*
		Optional<String> opStr4 = Optional.ofNullable(null);
		String noValue = opStr4.get(); //NoSuchElementException is thrown
		System.out.println("noValue: " + noValue);
		*/
		
		//To avoid NoSuchElementException and retrieve value only when present
		Optional<String> opStr5 = Optional.ofNullable("Hyderabad");
		opStr5.ifPresent(str -> System.out.println(str));
		
		Optional<String> opStr6 = Optional.ofNullable(null);
		opStr6.ifPresent(str -> System.out.println(str));
	}

}
