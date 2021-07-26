package com.qa.inheritance;

public abstract class Mammals extends Animal {

	private boolean warmBlooded;
	private boolean bigBrain;

	public Mammals(String name, String colour, double weight, boolean warmBlooded, boolean bigBrain) {
		super(name, colour, weight);
		this.warmBlooded = warmBlooded;
		this.bigBrain = bigBrain;
	}

	public Mammals() {
		super();
	}

	@Override
	public String toString() {
		return "Mamals [warmBlooded=" + warmBlooded + ", bigBrain=" + bigBrain + ", getName()=" + getName()
				+ ", getColour()=" + getColour() + ", getWeight()=" + getWeight() + "]";
	}

	public void eating() {
		System.out.println("Mamal is eating yum yum yum");
	}

	public void fun() {
		System.out.println("Java is fun!!!!");
	}

}
