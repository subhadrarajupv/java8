package com.java8.datetimeapi;

import java.time.LocalDate;

public class LocalDateArithmeticDemo {

	public static void main(String[] args) {
		
		LocalDate date1 = LocalDate.parse("2019-11-30");
		
		LocalDate date2 = date1.plusDays(5); //add 5 days
		System.out.println(date1 + " +5 days : " + date2);
		
		date2 = date1.plusWeeks(2); //add 2 weeks
		System.out.println(date1 + " +2 weeks : " + date2);
		
		date2 = date1.minusMonths(6); //minus 6 months
		System.out.println(date1 + " -6 months : " + date2);
		
		date2 = date1.minusYears(2); //minus 2 years
		System.out.println(date1 + " -2 years : " + date2);
		
		System.out.println("----------------- WITH operations --------------------");
		
		date2 = date1.withMonth(2); //Set month to FEB
		System.out.println(date1 + " with month 2 : " + date2);
		
		date2 = date1.withDayOfMonth(24); //Set Day of month to 24
		System.out.println(date1 + " with Day of Month 24 : " + date2);
		
		date2 = date1.withYear(2014); //Set year to 2014
		System.out.println(date1 + " with year 2014 : " + date2);
		
		date2 = date1.withDayOfYear(42); //Set day of year to 42
		System.out.println(date1 + " with day of year 42 : " + date2);
	}
	
}
