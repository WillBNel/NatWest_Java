package com.qa.persontask;

public class Runner {

	public static void main(String[] args) {
		Person p = new Person();

		Person vin = new Person("vinBob", 12, "Doctor", true, 10.00d);
		Person richard = new Person("Richard", 13, "Doctor", false);
		Person sav = new Person("Sav", 18, "Student", false, 3000.00d);
		Person ed = new Person("Ed", 12, "Programmer", true, 23.00d);

		String name = "Vin";

		p.addToList(vin);
		p.addToList(sav);
		p.addToList(richard);
		p.addToList(ed);

//		p.printAll();
//		p.search("vinBob");

		String[] myArrayOfStrings = { "A", "B", "C", "D", "E", "F", "G" };
//		System.out.println(myArrayOfStrings[0]);
//		System.out.println(myArrayOfStrings[1]);
//		System.out.println(myArrayOfStrings[2]);
//		System.out.println(myArrayOfStrings[3]);
//		System.out.println(myArrayOfStrings[4]);
		// For Loop
		// Enhanced For Loop
		for (String i : myArrayOfStrings) {
//			System.out.println(i);
		}

	}

}
