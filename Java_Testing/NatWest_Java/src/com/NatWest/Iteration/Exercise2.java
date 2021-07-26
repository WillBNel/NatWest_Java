package com.NatWest.Iteration;

public class Exercise2 {
	public static void main(String[] args) {

		Loop();
	}

	public static void Loop() {
		int A = 100;
		for (A = 100; A <= 200; A++) {
			if (A % 2 == 0) {
				System.out.println("EVEN - " + A);
			} else {
				System.out.println("ODD * " + A);
			}
		}
		printNum();
	}

	public static void printNum() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "" + i + "" + i + "" + i + "" + i + "" + i + "" + i + "" + i + "" + i + "" + i);
		}
		printNumIm();
	}

	public static void printNumIm() {
		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i);
			}
		}
	}

}
