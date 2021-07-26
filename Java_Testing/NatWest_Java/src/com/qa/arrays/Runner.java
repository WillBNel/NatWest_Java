package com.qa.arrays;

public class Runner {

	public static void main(String[] args) {
		// 0 1 2 3
//		String[] fruitArray = { "Apple", "Pears", "Grapes", "Cherry" };

//		System.out.println("RUNMEEEE " + fruitArray[0]);
//		System.out.println("RUNMEEEE " + fruitArray[1]);
//		System.out.println("RUNMEEEE " + fruitArray[2]);
//		System.out.println("RUNMEEEE " + fruitArray[3]);
		// 0 1 2 3 4
		int[] ageArray = { 465, 4365, 5465, 879, 3453, 873, 35647, 542, 7687, 34365, 785, 5364, 54645 };
//		System.out.println(ageArray[0]);
//		System.out.println(ageArray[4]);
//		System.out.println(ageArray.length);//

		// Declare an array with no values
		int[] examMarks;

		String[] myCars = new String[5];

		String name = "Vin";// TEXT

		// Multi Array

		int[][] seatNumber = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10 }, { 12 }, { 17, 21, 57, 478 } };
//		System.out.println(seatNumber[3][3]);

		String[] fruitArray = { "Apple", "Pears", "Grapes", "Cherry", "Orange", "Melon" };
//		System.out.println(fruitArray[0]);
//		System.out.println(fruitArray[1]);
//		System.out.println(fruitArray[2]);
//		System.out.println(fruitArray[3]);
//		System.out.println(fruitArray.length);// 6
		// length give us 6
		// arrays start from 0 - 5

//		for (int i = 0; i <= fruitArray.length - 1; i++) {
//			System.out.println(fruitArray[i]);
//		}

		// FOR EACH LOOP/ ENCHANCED LOOP

		for (String tempVal : fruitArray) {
			System.out.println(tempVal);
		}

	}

}
