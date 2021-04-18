package com.java8.datetimeapi;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeOperationsDemo {

	public static void main(String[] args) {
		
		ZoneId parisZoneId = ZoneId.of("Europe/Paris");
		ZonedDateTime zdt = ZonedDateTime.of(2018, 9, 10, 13,45, 0, 0, parisZoneId);
		System.out.println("custome zdt :" + zdt);
		
		ZonedDateTime zdt2 = zdt.minusMinutes(15);
		System.out.println("ZonedDateTime minus 15 min: " + zdt2);
		
		Month month = zdt.getMonth();
		System.out.println("Month: " + month);
		
		LocalDate date = zdt.toLocalDate();
		System.out.println("Date: " + date);
		
		ZonedDateTime withHour = zdt.withHour(8);
		System.out.println("WithHour 8 : " + withHour);
		
		boolean before = zdt.isBefore(withHour);
		System.out.println("Before: " + before);
	}

}
