package com.bpi.day3;

public class Person {

	String name;
	int age;
	float weight;

	void walk() {
		System.out.println("I am now walking.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(String name, int age, float weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public static void main(String[] args) {
		Person james = new Person("James Peter", 33, 150.0f);
		james.walk();
		System.out.println(james.name);
		
		james.setName("John the beloved");
		System.out.println("His name is " + james.getName());

	}

}
