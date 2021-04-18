package com.java8.functionalinterfaces;

import java.util.function.Consumer;

public class ConsumerIntegerDemo {

	public static void main(String[] args) {
		Consumer<Integer> doubleInputGenerator = (input) -> System.out.println("Double of input "+ input +" is :" + (input*2));
		doubleInputGenerator.accept(100);
		
		Consumer<String> stringLen = str -> System.out.println("\nLength of String"+ str +" is : " + str.length());
		stringLen.accept("\"Hello World!\"");
		
	}

}
