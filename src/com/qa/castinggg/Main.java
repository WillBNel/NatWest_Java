package com.qa.castinggg;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Widening casting wich when go smaller to bigger
//		byte--> short-->char--> int-->long-->float--> double;
		int myInt = 100;
		System.out.println(myInt);
		double myDInt = myInt;
		System.out.println(myDInt - 10.5);

		byte myByte = 1;
		double myNewDouble = myByte;

		// Narrow casting - bigger to smaller in terms data types
//		byte<-- short<--char<-- int<--long<--float<-- double;
		double myDouble = 9.95456546564;
		int mySpecialInt = (byte) myDouble;
		System.out.println(mySpecialInt);

	}

}
