package com.java8.datetimeapi;

import java.time.LocalTime;

public class LocalTimeDemo {

	public static void main(String[] args) {
		
		LocalTime time1 = LocalTime.now();
		System.out.println("Current Time : " + time1);
		
		LocalTime time2 = LocalTime.parse("12:30");
		System.out.println("Parsed Time: " + time2);
		
		LocalTime time3 = LocalTime.ofSecondOfDay(200);
		System.out.println("Time ofSecondOfDay for 200: " + time3);
	}

}
