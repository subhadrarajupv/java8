package com.java8.functionalinterfaces;

public class MyInterfaceImpl implements MyInterface {

	public static void main(String args[]) {
		MyInterface demo = new MyInterfaceImpl();
		demo.myAbstractMethod();
	}
	
	@Override
	public void myAbstractMethod() {
		System.out.println("Inside MyInterfaceImpl.myAbstractMethod");
	}

}
