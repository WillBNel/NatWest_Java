package com.qa.persontask;

import java.util.ArrayList;

public class Person {
	private String name;
	private int age;
	private String jobTitle;
	private boolean glasses;
	private double money;

	private ArrayList<Person> listOfPerson = new ArrayList<>();

	public Person() {
		// empty constructor
	}

	public Person(String name, int age, String jobTitle, boolean glasses) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
		this.glasses = glasses;
	}

	public Person(String name, int age, String jobTitle, boolean glasses, double money) {
		super();
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
		this.glasses = glasses;
		this.money = money;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", jobTitle=" + jobTitle + ", glasses=" + glasses + ", money="
				+ money + "]";
	}

	public void addToList(Person abc) {
		listOfPerson.add(abc);
//		System.out.println("Person has been added with values " + person);
	}

	public void search(String name) {
		// Array list is "listOfPerson"
		// tempPerson - is temp val that we store a value to as it loops
		for (Person tempPerson : listOfPerson) { // what the first loop doing?
//			System.out.println(tempPerson);
			if (tempPerson.getName() == name) {
				System.out.println(tempPerson);
			}
		}
	}

	public void printAll() {
		for (Person p : listOfPerson) {
			System.out.println(p);
		}
	}

//	public void printAllWithstream() {
//		listOfPerson.stream(x=>System.out.println(x));
//	}

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

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public boolean isGlasses() {
		return glasses;
	}

	public void setGlasses(boolean glasses) {
		this.glasses = glasses;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public ArrayList<Person> getListOfPerson() {
		return listOfPerson;
	}

	public void setListOfPerson(ArrayList<Person> listOfPerson) {
		this.listOfPerson = listOfPerson;
	}

}
