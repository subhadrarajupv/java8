package com.java8.defaultmethods;

public class MultipleInheritanceDemoClass implements DiamondProblemWithDefaultMethodsInterface1, 
DiamondProblemWithDefaultMethodsInterface2 {

	public static void main(String[] args) {
		MultipleInheritanceDemoClass demo = new MultipleInheritanceDemoClass();
		demo.myMethod();
	}

	@Override
	public void myMethod() {
		System.out.println("Inside MultipleInheritanceDemoClass.myMethod()");
	}

}
