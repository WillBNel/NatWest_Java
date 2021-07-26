package com.natwest.starterproject.domain;


import org.springframework.stereotype.Component;


@Component

public class Car {

	String model;
	String colour;
	int miles;
	
	public Car() {
		System.out.println("Car created");
		
	}
	public void checkDriver() {
		System.out.println("Checking.....");
		
	} 

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}
	
	
}
