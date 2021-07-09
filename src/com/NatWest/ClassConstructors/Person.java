package com.NatWest.ClassConstructors;


public class Person {

	private String name;
	private int age;
	private String job_title;
	
	private ArrayList<Person> listOfPerson = new ArrayList<>();

	public Person(String name, int age, String job_title) {
		this.name = name;
		this.age = age;
		this.job_title = job_title;
			

	}

	@Override
	public String toString() {
		return "Person [Name= " + name + ", Age= " + age + ", Job title= " + job_title + "]";
	
	}

		

	 
}


//Tasks
// 1 Create a Person class modelling name, age and job title variables.
//
// 2 Create a method to return all three of these in a formatted string.
//
//HINT: @Override the toString() method.
//
// 3 Create some example objects with this class.
//
// 4 Create a List<> implementation and store those objects inside.
//
//HINT: it's probably best to put your List<> implementation in a separate class.
//
// 5 Create a method that can search for a specific Person by their name.
//
// 6 Use a stream to output all of your people to the console.
//
//HINT: you can iterate through collections using streams with forEach().