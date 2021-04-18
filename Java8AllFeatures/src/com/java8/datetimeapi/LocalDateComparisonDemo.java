package com.java8.datetimeapi;

import java.time.LocalDate;

public class LocalDateComparisonDemo {

	public static void main(String[] args) {
		
		LocalDate date1 = LocalDate.parse("2011-08-01");
		
		LocalDate date2 = LocalDate.parse("2013-03-26");
		
		System.out.println("Date1: " + date1);
		System.out.println("Date2: " + date2);
		
		boolean after = date1.isAfter(date2);
		System.out.println("isAfter: " + after);
		
		boolean before = date1.isBefore(date2);
		System.out.println("isBefore: " + before);
		
		boolean equal = date1.isEqual(date2);
		System.out.println("isEqual: " + equal);
		
		boolean leapYear = date1.isLeapYear();
		System.out.println("isLeapYear: " + leapYear);
	}

}
