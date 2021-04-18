package com.java8.functionalinterfaces;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<Double> randomGenerator = () -> new Random().nextDouble();
		
		System.out.println("Random1: " + randomGenerator.get());
		System.out.println("Random2: " + randomGenerator.get());
		
	}

}
