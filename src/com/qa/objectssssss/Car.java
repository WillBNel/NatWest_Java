package com.qa.objectssssss;

public class Car {

	// Class is a blue print to crate objects
	// Members - Attributes
	public String make;
	public String model;

	public Car(String make, String model) {
		this.make = make;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + "]";
	}

}
