package com.qa.objectssssss;

public class Car {

	// Class is a blue print to crate objects
	// Members - Attributes
	public String make;
	public String model;
	public String reg;
	// null, false, 0.0d 0.0f 0L 0

	// Constructor ALL ARGS CONSTRUCTOR
	public Car(String make, String model, String reg) {
		this.make = make;
		this.model = model;
		this.reg = reg;
	}

	// Overloading - SAME NAME but DIFFERENT Arguments
	public Car(String make, String model) {
		this.make = make;
		this.model = model;
	}

	// Default constructor
	public Car() {

	}

	@Override
	public String toString() {
		return "the car make is " + make + ", model is " + model + ", reg is " + reg;
	}

	// SETTER
	public void setReg(String reg) {
		this.reg = reg;
	}

	// GETTERS
	public String getReg() {
		return this.reg;
	}

}
