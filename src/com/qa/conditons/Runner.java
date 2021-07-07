package com.qa.conditons;

public class Runner {
	// Class Memebers
	public static int variable = 2;

	public static void main(String[] args) {
//		System.out.println(10 == 10);
//		System.out.println(10 == 20);// false
//		System.out.println(1000 != 2000);// true
//
//		float vinsMoney = 20.00f;
//		boolean paidBills = true;
////			  TRUE					TRUE
//		if (vinsMoney >= 20.00f && paidBills) {
//			System.out.println("Vin has alot of money");// A
//		} else {
//			System.out.println("Vin is very poor currently"); // B
//		}
// this is a comment and will not show in the console 
//		System.out.println(variable);// 2
//		conditional(10000);

		int number = 19;

		if (number <= 20) {
			System.out.println("Number is less than or equal to 20"); // A
		} else if (number < 40) {
			System.out.println("Number is between 20 and 40");// B
		} else {
			System.out.println("Number is greater than or equal 40"); // C
		}

	}

	// METHOD
	// Name = conditional
	public static void conditional(int someNumber) {
		if (true && setValue()) {
			System.out.println(variable);// 2
			System.out.println(someNumber);
		}
	}

	public static boolean setValue() {
		variable = 20;
		return true;
	}

}
