package com.java8.optional;

import java.util.Optional;

public class OptionalCreationDemo {

	public static void main(String[] args) {
		
		Optional<Integer> opInt = Optional.empty();
		
		Optional<String> opStr = Optional.of("Hello Optional");
		
		//Optional<String> opStr1 = Optional.of(null); //This will throw NullPointerException, because of method expects a non NULL value
		
		//ofNullable can hold both null and non-null values
		Optional<String> opstr2  = Optional.ofNullable("Hello Optional");
		
		Optional<String> opstr3  = Optional.ofNullable(null);
		
		
	}

}
