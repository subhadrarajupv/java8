package com.java8.datetimeapi;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateCreationDemo {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		System.out.println("Date1: " + date1);
		
		LocalDate date2 = LocalDate.parse("2020-03-16");
		System.out.println("Date2: " + date2);
		
		LocalDate date3 = LocalDate.of(2019, Month.DECEMBER, 31);
		System.out.println("Date3: " + date3);
		
		LocalDate date4 = LocalDate.ofYearDay(2017, 163);
		System.out.println("Date4: " + date4);
		
	}

}
