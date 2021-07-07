package com.qa.classmembers;

public class Runner {
	
	

	public static String fName;
	public static int age;
	public static float money;

	public static void main(String[] args) {
		printName();
		fName = "Vinesh";
		age = 10;
		money = 2.0f;
		System.out.println(fName);// null
		System.out.println(age);// 0
		System.out.println(money);// 0.0
		printName();
		System.out.println();
	}

	public static void printName() {
		System.out.println(fName);
		String someName = "Jim";
		System.out.println(someName);
	}

}
