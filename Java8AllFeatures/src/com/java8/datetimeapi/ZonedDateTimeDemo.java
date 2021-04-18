package com.java8.datetimeapi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {

	public static void main(String[] args) {
		
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println("Current Time: " + zdt);
		
		ZoneId parisZoneId = ZoneId.of("Europe/Paris");
		zdt = ZonedDateTime.now(parisZoneId);
		System.out.println("Paris Time " + zdt);
	
		LocalDate date = LocalDate.parse("2020-02-02");
		LocalTime time = LocalTime.parse("05:30");
		zdt = ZonedDateTime.of(date, time, ZoneId.systemDefault());
		System.out.println("zdt of given date and time : " + zdt);
		
	}
	

}
