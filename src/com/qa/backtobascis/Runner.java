package com.qa.backtobascis;

public class Runner {

	// Main method - The Front Door.
	public static void main(String[] args) {
		// STARTS

		String name = "Vin";

		// DataType
		Cake vinsCake = new Cake();// you create on object and store it in memory
		System.out.println(vinsCake);
		Cake edsCake = new Cake("Chcolate cake", 300, 3, 125, 125);

		Cake richsCake = new Cake("Apple cake");

		System.out.println(edsCake);

		vinsCake.setButter(125);
		vinsCake.setEggs(5);
		vinsCake.setFlour(3000);
		vinsCake.setSugar(50);
		vinsCake.setName("Coconut cake");
		System.out.println(vinsCake);

		System.out.println(edsCake.getName());
		System.out.println(richsCake);
		richsCake.setButter(200);
		richsCake.setEggs(6);
		richsCake.setFlour(400);
		richsCake.setSugar(20);
		System.out.println(richsCake);

	}

}
