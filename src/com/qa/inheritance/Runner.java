package com.qa.inheritance;

public class Runner {

	public static void main(String[] args) {
		Fish fishy = new Fish("Nemo", "Orange", 1.1, 2, true, false);

		Tuna mrT = new Tuna("Mr T", "Grey", 24.3, 2, true, false, 10);
		Tuna mrE = new Tuna("Mr E", "Grey", 30.3, 3, true, false, 2);

		mrE.sleep();
		mrT.eating();

	}

}
