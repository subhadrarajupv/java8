package com.java8.streamapi;

import java.util.stream.Stream;

public class CountDemo {

	public static void main(String[] args) {
		Stream<Integer> inputStream = Stream.of(4,8,12,16,20);
		
		long count = inputStream.count();
		
		System.out.println("No. of elements in the stream: " + count);
	}

}
