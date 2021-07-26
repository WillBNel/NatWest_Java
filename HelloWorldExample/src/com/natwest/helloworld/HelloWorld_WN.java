package com.natwest.helloworld;

import javax.sound.midi.Soundbank;

public class HelloWorld_WN {

	public static void main(String[] args) {
	
	printMsg("Will", 25, 660.00F);	
	printMsg("Fred", 34, 500.00F);
	printMsg("Jennifer", 45, 250.00F);
	printMsg("Alice", 60, 60.00F);
	sayHello("Sam");
	
	
	}
	
	// method = code more than once 
	// () = argument
	public static void printMsg(String name, int age, float salary) {
		System.out.println("Hello " + name+ " you are " +age+" years old and earn £" + salary);
		
	}
	
	public static void sayHello(String name) {
		System.out.println("Hello " + name);
	
	
	}
	
	
}
