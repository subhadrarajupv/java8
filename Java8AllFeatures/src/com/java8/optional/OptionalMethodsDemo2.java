package com.java8.optional;

import java.time.LocalDate;
import java.util.Optional;

public class OptionalMethodsDemo2 {

	public static void main(String[] args) {
		Optional<Integer> opInt = Optional.ofNullable(5);
		int num = opInt.orElse(10);
		System.out.println("num: " + num);
		
		Optional<Integer> opIntEmpty = Optional.ofNullable(null);
		int num2 = opIntEmpty.orElse(10);
		System.out.println("num2: " + num2);
		
		Optional<LocalDate> opDate = Optional.of(LocalDate.of(2020, 12, 30));
		LocalDate date = opDate.orElseGet(() -> LocalDate.now());
		System.out.println("Date : " + date);
		
		Optional<LocalDate> opDate2 = Optional.ofNullable(null);
		LocalDate date2 = opDate2.orElseGet(() -> LocalDate.now());
		System.out.println("Date : " + date2);
		
		Optional<Double> opDouble = Optional.of(4.5);
		Double doubleVal = opDouble.orElseThrow(RuntimeException::new);
		System.out.println("Double value: "+doubleVal);
		
		Optional<Double> opDouble2 = Optional.ofNullable(null);
		Double doubleVal2 = opDouble2.orElseThrow(RuntimeException::new);
		System.out.println("Double value2: "+doubleVal2);
	}

}
