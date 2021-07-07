package com.qa.calculatortask;

public class Runner {

	// Entry point - MAIN METHOD
	public static void main(String[] args) {
		System.out.println(addTwo(10.5423456d, 150.46465d));
		System.out.println(subTwo(15.5, 10.4567));
		System.out.println(mulTwo(235.6, 56));
		System.out.println(divTwo(35, 4536));
		System.out.println(divTwo(4, 7));
		System.out.println(mulTwo(5, 57));

	}// END

	// methods - outside of the main method
	public static double addTwo(double number1, double number2) {
		return number1 + number2;
	}

	public static double subTwo(double number1, double number2) {
		return number1 - number2;
	}

	public static double mulTwo(double number1, double number2) {
		return number1 * number2;
	}

	public static double divTwo(double number1, double number2) {
		return number1 / number2;
	}

}// END
