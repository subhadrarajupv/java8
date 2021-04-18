package com.java8.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		
		LocalDateTime dt1 = LocalDateTime.now();
		System.out.println("Current Date Time: " + dt1);
		
		LocalDateTime dt2 = LocalDateTime.parse("2012-05-06T10:15:30");
		System.out.println("Parsed Datetime: " + dt2);
		
		LocalDateTime dt3 = LocalDateTime.of(LocalDate.parse("2013-03-24"), LocalTime.parse("06:45"));
		System.out.println("DateTime from given Date and Time: " + dt3);
	}

}
