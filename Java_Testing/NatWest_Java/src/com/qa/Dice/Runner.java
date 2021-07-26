package com.qa.Dice;

import java.util.Random;

public class Runner {

	public static void main(String[] args) {
		System.out.println(rollTwoDTwenty());
	}

	public static int rollTwoDTwenty() {
		int total = 0;
		System.out.println("Total is " + total);
		total += rollDTwenty();
		System.out.println("Total is after one method run " + total);
		total += rollDTwenty();
		System.out.println("Total is after two method run " + total);
		return total;
	}

	public static int rollDTwenty() {
		return new Random().nextInt(210);
	}
}
