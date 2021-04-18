package com.java8.optional;

import java.util.Optional;

public class Person {

	private String name;
	private int age;
	//private Address address;//without Optional
	private Optional<Address> address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Optional<Address> getAddress() {
		return address;
	}
	public void setAddress(Optional<Address> address) {
		this.address = address;
	}
	public Person() {
		super();
		address = Optional.ofNullable(null);
	}
	
}
