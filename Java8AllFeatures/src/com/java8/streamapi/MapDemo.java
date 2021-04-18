package com.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapDemo {

	public static void main(String[] args) {
		List<String> input = Arrays.asList("John","Jane","Johnny");
		
		Stream<String> inputWithHello = input.stream().map(str -> "Hello " + str);
		inputWithHello.forEach(str -> System.out.println(str));
		
		
		List<Integer> numbers = Arrays.asList(3,100,5,23,8,50,36, 78, 91,14);
		Stream<Integer> map = numbers.stream().map(num -> num*2);
		map.forEach(num -> System.out.println(num));
	}

}
