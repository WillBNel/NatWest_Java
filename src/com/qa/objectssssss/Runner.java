package com.qa.objectssssss;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
//		ArrayList<String> myList = new ArrayList<>();
		// Instance of Car
		Car vinsCar = new Car("Audi", "A7", "W8M8");
		Car richardsCar = new Car("Tesla", "Model S");
		Car savsCar = new Car("Merc", "C220d", "SAVV");
		Car edsCar = new Car();

		System.out.println(vinsCar);// audi a7
		System.out.println(richardsCar); // tesla model s
		richardsCar.setReg("BRUMMMM");
		System.out.println(richardsCar); // tesla model s
		System.out.println(edsCar.getReg());
//		System.out.println(savsCar);
//		System.out.println(edsCar);

		Car_Two_Generated jordansCar = new Car_Two_Generated();
		System.out.println(jordansCar);
		jordansCar.setMake("Honda");
		jordansCar.setModel("Accord");
		jordansCar.setReg("Oh no!");
		System.out.println(jordansCar);

		ArrayList<Car> vinsList = new ArrayList<>();
		vinsList.add(vinsCar);
		vinsList.add(edsCar);
		vinsList.add(savsCar);

		for (Car aCar : vinsList) {
			System.out.println(aCar);
		}

	}

}
