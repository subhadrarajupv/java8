package com.java8.streamapi;

import java.util.ArrayList;
import java.util.List;

public class StreamChainingDemo {

	public static void main(String[] args) {
		List<Cartoon> cartoonCharacters = new ArrayList<Cartoon>();
		
		cartoonCharacters.add(new Cartoon("Mickey", "Mouse"));
		cartoonCharacters.add(new Cartoon("Donald", "Duck"));
		cartoonCharacters.add(new Cartoon("Peppa", "Pig"));
		cartoonCharacters.add(new Cartoon("Daffy", "Duck"));
		cartoonCharacters.add(new Cartoon("Scooby", "Doo"));
		cartoonCharacters.add(new Cartoon("Bugs", "Bunny"));
		
		cartoonCharacters.stream().
		filter(cartoon -> cartoon.getLastname().startsWith("D")).
		map( cartoon -> cartoon.getFirstname()+ " " +cartoon.getLastname()).
		sorted().
		forEach( str -> System.out.println("Name of the cartoon character is : " + str));
	}
}
