package com.qa.classstructures;

public class Runner {

	public static void main(String[] args) {

		String[] nameList = { "Vin", "Sav", "Ed", "Richard", "Jordan", "Piers", "Alan" };

		for (int i = 0; i < 1; i++) {
			for (String name : nameList) {
				hello(name);
			}
			System.out.println("--------------------------");
		}
	}

	public static void hello(String name) {
		System.out.println("Hello " + name);
		help();
	}

	public static void help() {
		System.out.println("Whos confused?");
	}

}
