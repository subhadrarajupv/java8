package com.java8.functionalinterfaces;

public class MyInterfaceLambdaImpl {

	public static void main(String args[]) {
		MyInterface demo = () -> System.out.println("Inside MyInterfaceLambdaImpl.main");
		demo.myAbstractMethod();
	}
	
}
