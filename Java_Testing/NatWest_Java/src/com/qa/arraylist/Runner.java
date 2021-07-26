package com.qa.arraylist;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {

		// CATCH -- ONLY WORKS WITH OBJECTSSSSSSS
		ArrayList<String> listOfNames = new ArrayList<String>();
		System.out.println(listOfNames);
		listOfNames.add("Vin");
		System.out.println(listOfNames);
		listOfNames.add("Sav");
		System.out.println(listOfNames);
		listOfNames.add("Richard");
		System.out.println(listOfNames);
		System.out.println(listOfNames.contains("Vin"));
		System.out.println(listOfNames.isEmpty());

		for (String tempVal : listOfNames) {
			System.out.println(tempVal);
		}

	}

}
