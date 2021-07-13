package com.qa.inheritance;

public abstract class Animal {
	// class member should be at the top

	private String name;
	private String colour;
	private double weight;

	public Animal() {
		super();
	}

	public Animal(String name) {
		super();
		this.name = name;
	}

	public Animal(String name, String colour) {
		super();
		this.name = name;
		this.colour = colour;
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

	public abstract void sleep();

	public void eating() {
		System.out.println("Animal nom nom nom");
	}

	// visability modifiers - Public, private, protectd and default
	// METHOD WITH NO BODY
	// VOID - ITS THE RETURN TYPE
	public abstract void eyes();

	// G
	// S

}
