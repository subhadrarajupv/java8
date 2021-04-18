package com.java8.functionalinterfaces;

import java.util.function.Function;

public class FunctionStudentDemo {

	public static void main(String[] args) {
		Function<Student, Double> studentMarks = (student) -> student.getMarks();
		
		Student student = new Student(1, "John", 75.0D);
		System.out.println("Marks of Student " + student.getName() + " are : " + studentMarks.apply(student));
	}

}
