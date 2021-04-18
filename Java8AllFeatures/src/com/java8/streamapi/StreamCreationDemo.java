package com.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreationDemo {

	public static void main(String[] args) {
		
		//Creating Stream from a collection
		List<Integer> numbers = Arrays.asList(8,44,29,18,13,28,64,51,87,92);
		Stream<Integer> numbersStream = numbers.stream();
		
		
		//Creating stream from an array
		int[] myArray = new int[] {4,12,3,55};
		IntStream arrayStream = Arrays.stream(myArray);
		
		//Creating stream from random values
		Stream<String> days = Stream.of("Monday","Tuesday","Wednesday");
		
		//Creating a stream using Stream.generate
		Stream<Integer> randomNumStream = Stream.generate(() -> new Random().nextInt(100));
		
		//Iterating through a stream
		Stream<String> animals = Stream.of("Cat", "Mouse", "Dog");
		animals.forEach(str -> System.out.println(str));
		
		
	}

}
