package com.java8.functionalinterfaces;

@FunctionalInterface
public interface MyInterface {

	public void myAbstractMethod();//There can only be one abstract method
	
	//Adding another abstract method will throw a compilation error
	
	//Removing the FunctionInterface annotation and adding abstract methods will make it normal interface
	
	public default void myDefaultMethod() {
		System.out.println("Inside myDefaultMethod");
	}
	
	public static void myStaticMethod() {
		System.out.println("Inside myStaticMethod");
	}
	
}
