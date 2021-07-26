package com.qa.inheritance;

public class Dog extends Mammals implements Dog_Interface, Dog_Interface_Two, Dog_Interface_Three {

	private boolean walksOnFourLegs;

	public Dog(String name, String colour, double weight, boolean warmBlooded, boolean bigBrain,
			boolean walksOnFourLegs) {
		super(name, colour, weight, warmBlooded, bigBrain);
		this.walksOnFourLegs = walksOnFourLegs;
	}

	@Override
	public void sleep() {
		System.out.println("DOG sleep woof woof woof");

	}

	@Override
	public void eyes() {
		// TODO Auto-generated method stub

	}

	@Override
	public void goToTheVet(String name) {
		System.out.println("I " + name + " DONT WANT TO GO THE VETTTT");

	}

	@Override
	public void goTotheGroomers() {
		System.out.println("Time for a hair cut!!");

	}

	@Override
	public String whatsYourName(String name) {

		return "Hello " + name;
	}

	@Override
	public void goToTheHospital(String name) {
		// TODO Auto-generated method stub

	}

}
