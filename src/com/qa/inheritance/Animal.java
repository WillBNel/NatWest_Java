package com.qa.inheritance;

public class Animal {
	// class member should be at the top

	private String name;
	private String colour;
	private double weight;

	public Animal() {
		super();
	}

	public Animal(String name, String colour, double weight) {
		super();
		this.name = name;
		this.colour = colour;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", colour=" + colour + ", weight=" + weight + "]";
	}

	public void sleep() {
		System.out.println("animal sleeping");
	}

	public void eating() {
		System.out.println("nom nom nom");
	}

	// G
	// S

}
