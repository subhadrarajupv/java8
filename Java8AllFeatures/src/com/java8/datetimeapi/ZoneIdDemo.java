package com.java8.datetimeapi;

import java.time.LocalTime;
import java.time.ZoneId;

public class ZoneIdDemo {

	public static void main(String[] args) {

		ZoneId currentTimeZone = ZoneId.systemDefault();
		System.out.println("Current Time: " + LocalTime.now(currentTimeZone));
		
		ZoneId australiaTimeZone = ZoneId.of("Australia/Sydney");
		System.out.println("Australia Time: " + LocalTime.now(australiaTimeZone));
		
		ZoneId parisTimeZone = ZoneId.of("GMT+2");
		System.out.println("Paris Time: " + LocalTime.now(parisTimeZone));
	}

}
