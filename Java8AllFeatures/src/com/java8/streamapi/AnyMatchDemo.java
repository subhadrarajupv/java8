package com.java8.streamapi;

import java.util.Arrays;
import java.util.List;

public class AnyMatchDemo {

	public static void main(String[] args) {
		List<String> input = Arrays.asList("Monday","March","September","Friday","August","Tuesday");
		
		boolean dayOfTheWeek = input.stream().anyMatch(str -> str.endsWith("day"));
		System.out.println("Day of the Week present?: " + dayOfTheWeek);
	}

}
