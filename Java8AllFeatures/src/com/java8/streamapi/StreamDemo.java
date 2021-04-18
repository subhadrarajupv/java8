package com.java8.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(8,44,29,18,13,28,64,51,87,92);
		
		//Prior to java 8 stream api
		List<Integer> evenNumbers = new ArrayList<>();
		
		for (int num: numbers) {
			if (num%2 == 0) {
				evenNumbers.add(num);
			}
		}
		System.out.println("Even numbers are : " + evenNumbers);
		
		evenNumbers.clear();
		
		//Using streams
		numbers.stream().filter(num -> num%2==0).forEach(num -> evenNumbers.add(num));
		System.out.println("Even numbers are : " + evenNumbers);
	}
}
