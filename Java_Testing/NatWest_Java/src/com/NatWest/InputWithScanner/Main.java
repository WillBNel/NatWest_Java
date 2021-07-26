package com.NatWest.InputWithScanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		double num1;
		double num2;

		System.out.println("Which method would you like to use?");
		System.out.println("1. Addition");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Devide");
		System.out.println("0. Quit");

		boolean running = true;

		while (running) {
			System.out.println("Which method would you like to use?");
			System.out.println("1. Addition");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Devide");
			System.out.println("0. Quit");

			int operation = scan.nextInt();

			switch (operation) {
			case 1:
				System.out.println("Enter your first number:");
				num1 = scan.nextDouble();
				System.out.println("Enter your second number:");
				num2 = scan.nextDouble();
				System.out.println("This is the answer: " + calc.addition(num1, num2));
				break;
			case 2:
				System.out.println("Enter your first number:");
				num1 = scan.nextDouble();
				System.out.println("Enter your second number:");
				num2 = scan.nextDouble();
				System.out.println("This is the answer: " + calc.subtract(num1, num2));
				break;
			case 3:
				System.out.println("Enter your first number:");
				num1 = scan.nextDouble();
				System.out.println("Enter your second number:");
				num2 = scan.nextDouble();
				System.out.println("This is the answer: " + calc.multiply(num1, num2));
				break;
			case 4:
				System.out.println("Enter your first number:");
				num1 = scan.nextDouble();
				System.out.println("Enter your second number:");
				num2 = scan.nextDouble();
				System.out.println("This is the answer: " + calc.divide(num1, num2));
				break;
			case 0:
				System.out.println("Quitting");
				scan.close();
				running = false;
				break;
			default:
				System.out.println("Invalid number.");
				break;

			}
		}
	}
}
