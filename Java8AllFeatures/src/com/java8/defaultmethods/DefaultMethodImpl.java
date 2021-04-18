package com.java8.defaultmethods;

public class DefaultMethodImpl implements DefaultMethodInterface {

	public static void main(String[] args) {
		DefaultMethodImpl demo = new DefaultMethodImpl();
		demo.method1();
		demo.method2();
	}

	@Override
	public void method1() {
		System.out.println("Inside DefaultMethodImpl.method1()");
	}
	
	@Override
	public void method2() {
		System.out.println("Inside DefaultMethodImpl.method2()");
	}

}
