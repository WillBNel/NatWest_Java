package com.NatWest.ClassConstructors;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {

		
		Person pers1= new Person("Dave", 29, "Head of Function");
		Person pers2= new Person("Will", 31, "Entry Level");
		Person pers3= new Person("Emma", 25, "Senior Manager");
		Person pers4= new Person("Neethu", 37, "CEO");
		Person pers5= new Person("Rita", 45, "Regional Director");
		

		
		
		System.out.println(pers1);
		System.out.println(pers2);
		System.out.println(pers3);
		System.out.println(pers4);
		System.out.println(pers5);
		
		ArrayList<Person> listOfPerson= new ArrayList<>();
		listOfPerson.add(pers1);
		listOfPerson.add(pers2);
		listOfPerson.add(pers3);
		listOfPerson.add(pers4);
		listOfPerson.add(pers5);
			
}
	
}