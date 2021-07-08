package com.qa.loops;

public class Runner {

	public static void main(String[] args) {
		// for loop
		// for(<some variable>;<some condition>; <incrementer>){
		// Body/ LOGIC
		// }
//		int myNum = 10;
//
//		for (int count = 10; count <= myNum;count++) {
//			System.out.println("Do a press up " + count);
//		}

		// While(condition){
		// keep doing it
		// }
		//

		boolean homeTime = false;
		int time = 18; // 5pm

		while (!homeTime) {

			// its setting homeTime to true;
			if (time >= 17) {
				homeTime = true;
				return;
			}
			System.out.println("Keep working " + time);
			time++;

		}

	}

}
