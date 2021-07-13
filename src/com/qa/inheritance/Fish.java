package com.qa.inheritance;

public class Fish extends Animal {

	public int numberOfFins;
	public boolean livesInTheWater;
	public boolean freshWater;

	public Fish() {
		super();
	}

	public Fish(String name, String colour, double weight, int numberOfFins, boolean livesInTheWater,
			boolean freshWater) {
		super(name, colour, weight);
		this.numberOfFins = numberOfFins;
		this.livesInTheWater = livesInTheWater;
		this.freshWater = freshWater;
	}

	public int getNumberOfFins() {
		return numberOfFins;
	}

	public void setNumberOfFins(int numberOfFins) {
		this.numberOfFins = numberOfFins;
	}

	public boolean isLivesInTheWater() {
		return livesInTheWater;
	}

	public void setLivesInTheWater(boolean livesInTheWater) {
		this.livesInTheWater = livesInTheWater;
	}

	public boolean isFreshWater() {
		return freshWater;
	}

	public void setFreshWater(boolean freshWater) {
		this.freshWater = freshWater;
	}

	@Override
	public void sleep() {
		System.out.println("Fish is sleeping");
	}

}
