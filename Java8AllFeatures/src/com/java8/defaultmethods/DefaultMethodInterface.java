package com.java8.defaultmethods;

public interface DefaultMethodInterface {

	public void method1();
	
	default public void method2() {
		System.out.println("In DefaultMethodInterface.method2()");
	}
	
}
