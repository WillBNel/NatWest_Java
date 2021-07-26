package com.qa.inheritance;

public class Human extends Mammals implements Dog_Interface, Dog_Interface_Two, Dog_Interface_Three {

	private boolean walkOnTwoLegs;

	public Human(String name, String colour, double weight, boolean warmBlooded, boolean bigBrain,
			boolean walkOnTwoLegs) {
		super(name, colour, weight, warmBlooded, bigBrain);
		this.walkOnTwoLegs = walkOnTwoLegs;
	}

	@Override
	public String toString() {
		return "Human [walkOnTwoLegs=" + walkOnTwoLegs + ", getName()=" + getName() + ", getColour()=" + getColour()
				+ ", getWeight()=" + getWeight() + "]";
	}

	public void eating() {
		System.out.println("human is eating this is so good");
	}

	public void watchNetFlix() {
		System.out.println("Watching Tv! Go away");
	}

	@Override
	public void eyes() {
		System.out.println("human has two eyesssssss");

	}

	@Override
	public void sleep() {
		System.out.println("Human sleep zzzzzzz");

	}

	@Override
	public String whatsYourName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void goTotheGroomers() {
		// TODO Auto-generated method stub

	}

	@Override
	public void goToTheVet(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void goToTheHospital(String name) {
		// TODO Auto-generated method stub

	}

}
