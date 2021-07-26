package main;

import classes.Example;

public class Runner {

	public static void main(String[] args) {

		Example<Double> objd = new Example<Double>(36d);
		Example<Integer> obji = new Example<Integer>(36);
		Example<String> objs = new Example<String>("Thirty Six");

		objd.print();
		obji.print();
		objs.print();


	}

}
