package com.java8.datetimeapi;

import java.time.LocalTime;

public class LocalTimeOperationsDemo {

	public static void main(String[] args) {
		
		LocalTime time1 = LocalTime.parse("12:30").plusMinutes(30);
		System.out.println("12:30 plus 30min : " + time1);
		
		int hour = time1.getHour();
		System.out.println("Hour : " + hour);
		
		long second = LocalTime.parse("08:30").toSecondOfDay();
		System.out.println("00:30 in seconds : " + second);
		
		LocalTime time2 = LocalTime.of(10, 30);
		LocalTime time3 = LocalTime.of(11, 30);
		
		boolean before = time2.isBefore(time3);
		System.out.println("isBefore: " + before);
		
	}

}
