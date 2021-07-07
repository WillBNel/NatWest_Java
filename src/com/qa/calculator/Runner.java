package com.qa.calculator;

public class Runner {

	public static void main(String[] args) {
		System.out.println(addTwo(80844d, 15400d));
		System.out.println(mulTwo(145d, 56d));
		System.out.println(minTwo(445546d, 1546544d));
		System.out.println(divTwo(1005.65d, 220.83d));
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
	
	public static double divTwo(double numb1, double numb2) {
		return numb1 / numb2;
	}
		
	}
	

