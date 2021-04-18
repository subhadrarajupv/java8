package com.java8.methodreferences;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ConstructorReferenceDemo {

	public static void main(String[] args) {
		List<String> fruitNames = Arrays.asList("Mango","Banana","Apple","Orange");
		
		//Using lambda expression
		//List<Fruit> fruits = fruitNames.stream().map(name -> new Fruit(name)).collect(Collectors.toList());
		
		//Using constructor reference
		List<Fruit> fruits = fruitNames.stream().map(Fruit::new).collect(Collectors.toList());
		fruits.forEach(fruit -> System.out.println("Fruit name is " + fruit.getName()));
		
		//another example
		//Supplier<Date> date = () -> new Date();//Using lambda expression
		Supplier<Date> date = Date::new; //Using constructor reference
		System.out.println("Current date is " + date.get());
	}

}
