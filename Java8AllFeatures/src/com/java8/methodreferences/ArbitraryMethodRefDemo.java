package com.java8.methodreferences;

import java.util.ArrayList;
import java.util.List;

public class ArbitraryMethodRefDemo {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();
		animals.add(new Animal("Cat","Fish"));
		animals.add(new Animal("Dog","Bone"));
		animals.add(new Animal("Cow","Grass"));
		
		//Using lambda expression
		//animals.forEach(animal -> animal.print());
		
		//Using arbitrary method
		animals.forEach(Animal::print);
	}

}
