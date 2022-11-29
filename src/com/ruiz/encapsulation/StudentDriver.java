package com.ruiz.encapsulation;

public class StudentDriver {

	public static void main(String[] args) {
		Student obj1 = new Student();
		System.out.println(obj1.toString());//will print out default values
		
		Student obj2 = new Student(0001,"Sam", "Winchester", "sam@subernatural.com","555-555-5555");
		System.out.println(obj2.toString());

	}

}
