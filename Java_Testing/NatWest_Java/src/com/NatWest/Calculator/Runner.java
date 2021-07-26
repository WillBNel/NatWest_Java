package com.NatWest.Calculator;

public class Runner {

	public static void main(String[] args) {
		System.out.println(addTwo(80844d, 15400d));
		System.out.println(mulTwo(145d, 56d));
		System.out.println(minTwo(445546d, 1546544d));
		divTwo(8d, 2d);
	}

	public static double addTwo(double numb1, double numb2) {
		return numb1 + numb2;
	}

	public static double mulTwo(double numb1, double numb2) {
		return numb1 * numb2;
	}

	public static double minTwo(double numb1, double numb2) {
		return numb1 - numb2;
	}

	public static void divTwo(double numb1, double numb2) {
		if (numb1 < numb2) {
			System.out.println("The devision cannot be perfomed");

		} else {
			System.out.println(numb1 / numb2);
		}

	}
}
//Edit the division method in the Calculator class, the sum should only execute if the first parameter is smaller than the second, 
//otherwise it prints out a message saying that the division cannot be performed.