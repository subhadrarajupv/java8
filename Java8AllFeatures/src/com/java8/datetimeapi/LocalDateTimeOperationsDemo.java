package com.java8.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeOperationsDemo {

	public static void main(String[] args) {
		LocalDateTime dt1 = LocalDateTime.of(2018, 9, 8, 5, 25);
		
		LocalDateTime dt2 = dt1.plusWeeks(3);
		System.out.println(dt1 + " plus 3 weeks : " + dt2);
		
		int minute = dt1.getMinute();
		System.out.println("Minute: " + minute);
		
		LocalDate localDate = dt1.toLocalDate();
		System.out.println("Date: " + localDate);
		
		LocalTime localTime = dt1.toLocalTime();
		System.out.println("Time: " + localTime);
		
		LocalDateTime withHour = dt1.withHour(7);
		System.out.println("with hour 7: " + withHour);
		
		boolean after = dt1.isAfter(withHour);
		System.out.println("isAfter: " + after);
		
		
		
	}

}
