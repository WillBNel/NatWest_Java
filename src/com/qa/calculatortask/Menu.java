package com.qa.calculatortask;

import java.util.Scanner;

public class Menu {

	Calculator calc = new Calculator();
	Scanner sc = new Scanner(System.in);
	double num1;
	double num2;

	public void start() {
		System.out.println("What would you like to do?");
		System.out.println("Press 1 - Add numbers ");
		System.out.println("Press 2 - Sub numbers ");
		System.out.println("Press 3 - Mul numbers ");
		System.out.println("Press 4 - Div numbers ");
		System.out.println("Press 0 - To Exit ");

		int option = sc.nextInt();
		if (option != 0) {
			System.out.println("enter the first number");
			num1 = sc.nextDouble();
			System.out.println("enter the second number");
			num2 = sc.nextDouble();
			choose(option);
		} else {
			System.out.println("Thank you for using the calculator ");
			sc.close();
		}
	}

	public void choose(int option) {

		switch (option) {
		case 1:
			System.out.println(calc.add(num1, num2));
			break;
		case 2:
			System.out.println(calc.sub(num1, num2));
			break;
		case 3:
			System.out.println(calc.mul(num1, num2));
			break;
		case 4:
			System.out.println(calc.div(num1, num2));
			break;

		default:

			break;
		}
		goAgain();

	}

	public void goAgain() {
		System.out.println("Would you like to go again?");
		System.out.println("press 1 for YES");
		System.out.println("press 2 for NO");
		int playAgain = sc.nextInt();
		if (playAgain == 1) {
			start();
		} else if (playAgain == 0) {
			return;
		} else {
			goAgain();
		}
	}

}
