package com.qa.backtobascis;

public class Cake {
	// Class members
	String name;
	float flour;
	int eggs;
	float butter;
	float sugar;

	// Constructor is the blueprint - instructions of how to make it
	// TO BUILD THE CAKE
	public Cake() {
		// Default Constructor
	}

	public Cake(String name) {
		this.name = name;
	}

	// Constrcutor
	public Cake(String name, float flour, int eggs, float butter, float sugar) {
		//
		this.name = name;
		this.flour = flour;
		this.eggs = eggs;
		this.butter = butter;
		this.sugar = sugar;
	}

	@Override
	public String toString() {
		return "Cake [name=" + name + ", flour=" + flour + ", eggs=" + eggs + ", butter=" + butter + ", sugar=" + sugar
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getFlour() {
		return flour;
	}

	public void setFlour(float flour) {
		this.flour = flour;
	}

	public int getEggs() {
		return eggs;
	}

	public void setEggs(int eggs) {
		this.eggs = eggs;
	}

	public float getButter() {
		return butter;
	}

	public void setButter(float butter) {
		this.butter = butter;
	}

	public float getSugar() {
		return sugar;
	}

	public void setSugar(float sugar) {
		this.sugar = sugar;
	}

}
