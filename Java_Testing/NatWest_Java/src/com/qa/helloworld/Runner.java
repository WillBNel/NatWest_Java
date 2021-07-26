package com.qa.helloworld;

public class Runner {

	// Entry point?
	public static void main(String[] args) {
		// boolean,char,int,bit,long,short,double,float;
		// Object type - String
		// <data type> <name we want> = <the vlaue we want>;
//		printMsg("Vinesh", 12, 32.00f);
//		printMsg("Sav", 30, 38.00f);
//		printMsg("Ed", 9, 12.00f);
//		printMsg("Jim", 3, 38.00f);
//		abc(354645675);
//		abc(245);
//		sayHello("Sam");
		System.out.println("step 1");
		System.out.println(addTwoNumbers(10, 10));
		System.out.println("step 2");

	}

	// Method
	// if you going to do it more than once
	// should probably be a method
	public static void printMsg(String name, int age, float salary) {
		System.out.println("Hello " + name + " you are " + age + " years old and earn £" + salary);
	}

	public static void abc(int age) {
		// sysout
		System.out.println();
		System.out.println("Hello " + age);

	}

	public static void sayHello(String name) {
		System.out.println("Hello " + name);
	}

	public static int addTwoNumbers(int number1, int number2) {
		// body of our method
		int ans = number1 + number2;
		return ans;
	}

}
