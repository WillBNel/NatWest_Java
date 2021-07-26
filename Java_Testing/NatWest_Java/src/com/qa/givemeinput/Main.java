package com.qa.givemeinput;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// sometimes we want input from the user

		Scanner sc = new Scanner(System.in);
		System.out.println("give me one number");
		double number1 = sc.nextDouble();
		System.out.println("Give me another number");
		double number2 = sc.nextDouble();
		sc.close();

		Main main = new Main();
		main.addTwo(number1, number2);

	}

	public void addTwo(double num1, double num2) {
		System.out.println(num1 + num2);
	}

}
