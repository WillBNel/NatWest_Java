package com.qa.operators;

public class Runner {

	public static void main(String[] args) {

//		System.out.println(10 + 10);// 20
//		System.out.println(10 - 11);// 0
//		System.out.println(10 * 10);// 100
//		System.out.println(50 / 10);// 5
//		System.out.println(10 % 2);// Modulus - remainder
		int lesley = 20;
//		System.out.println(lesley);
//		lesley = 10;
//		System.out.println(lesley);// 10
//		lesley = lesley + 5;// its the same
//		System.out.println(lesley);// 15
//		lesley += 5;// as this one over here
//		System.out.println(lesley);// 20

		int count = 2;
		System.out.println(count);// prints 2
		count++; // 3
		System.out.println(count);// prints 3
		count++;// 4
		count++;// 5
		count++;// 6
		System.out.println(++count);// 7
		System.out.println(count);// 7
		count--;
		System.out.println(count);// 6
		count--;
		System.out.println(count--);// 5 update the value to 4
		System.out.println(--count);// minus 1 FIRST FROM 4 EQUAL 3

		System.out.println(10 == 10);// the same value
		System.out.println(10 == 11); // not the same value

		// ! Not operator
		System.out.println(10 != 10);
		System.out.println(1200 != 10);

	}

}
