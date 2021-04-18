package com.java8.defaultmethods;

public interface StaticDemoInterface {

	public static void staticMethod() { //cannot be overridden like default methods
		System.out.println("Inside StaticDemoInterface.staticMethod");
	}
	
}
