package com.qa.inheritance;

public class Runner {

	public static void main(String[] args) {

		// create an instance of a class
		Human vin = new Human("vin", "Brown", 60.00, true, false, true);
		Mammals ed = new Human("Ed", "Yellow", 190.00, true, false, false);
		Animal rich = new Human("Rich", "Yellow", 190.00, true, false, false);

		System.out.println(vin instanceof Mammals);
		System.out.println(vin instanceof Animal);

		// method TENDS to have round brackets at the end!
		vin.eating();
		ed.eating();
		rich.eating();

		vin.watchNetFlix();
		((Human) ed).watchNetFlix();
		((Human) rich).watchNetFlix();

		vin.fun();
		ed.fun();
		((Human) rich).fun();
		((Mammals) rich).fun();

		Human barry = new Human("Mr B", "red", 12.00, true, true, true);
		Dog austinPaws = new Dog("Mr Paws", "Grey", 15.00, true, false, true);
		Tuna fishyy = new Tuna("Mr Tuna", "Grey", 11.00, 2, true, false, 6);

		barry.sleep();
		austinPaws.sleep();
		fishyy.sleep();

		austinPaws.goTotheGroomers();
		austinPaws.goToTheVet("Ed");
		System.out.println(austinPaws.whatsYourName("Austin PAWSSSSSSSSS"));

	}
}
