package com.qa.inheritance;

public class Tuna extends Fish {
	// Private
	// Public
	// Default
	// Protected

	private int angerLevel;

	public Tuna(String name, String colour, double weight, int numberOfFins, boolean livesInTheWater,
			boolean freshWater, int angerLevel) {
		super(name, colour, weight, numberOfFins, livesInTheWater, freshWater);
		this.angerLevel = angerLevel;
	}

	@Override
	public void eating() {
		System.out.println("tnom tnom tnom");
	}

	@Override
	public void eyes() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sleep() {
		System.out.println("tuna sleep mmm mmm mmm ");

	}

}
