package com.qa.objectssssss;

public class Car_Two_Generated {

	// Members - Attributes
	public String make;
	public String model;
	public String reg;

	// Default
	public Car_Two_Generated() {

	}

	// All args
	public Car_Two_Generated(String make, String model, String reg) {
		this.make = make;
		this.model = model;
		this.reg = reg;
	}

	// GETTERS
	public String getMake() {
		return make;
	}

	// SETTERS
	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getReg() {
		return reg;
	}

	public void setReg(String reg) {
		this.reg = reg;
	}

	@Override
	public String toString() {
		return "Car_Two_Generated [make=" + make + ", model=" + model + ", reg=" + reg + "]";
	}

}
