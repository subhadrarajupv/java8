package com.java8.datetimeapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateExtractionDemo {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.parse("2010-09-04");
		
		int dayOfYear = date1.getDayOfYear();
		System.out.println("Day of Year: " + dayOfYear);
		
		int dayOfMonth = date1.getDayOfMonth();
		System.out.println("Day of Month: " + dayOfMonth);
		
		Month month = date1.getMonth();
		System.out.println("Month is : " + month);
		
		DayOfWeek dayOfWeek = date1.getDayOfWeek();
		System.out.println("Day of Week : " + dayOfWeek);
		
	}

}
