package com.qa.switchthecase;

public class Runner {

	public static void main(String[] args) {
		int day = 1;

		switch (day) {
		case 1:
			System.out.println("Monday you can fall apart");
			break;
		case 2:
			System.out.println("Tuesday,");
			break;
		case 3:
			System.out.println("Wednesday break my heart");
			break;
		case 4:
			System.out.println("Oh, Thursday doesn't even start");
			break;
		case 5:
			System.out.println("It's Friday I'm in love");
			break;
		case 6:
			System.out.println("Saturdaaaay wait");
			break;
		case 7:
			System.out.println("Sunday always comes too late");
			break;
		default:
			System.out.println("You need to listen to The Cure");
			break;
		}

		if (day == 1) {
			System.out.println("M");
		} else if (day == 2) {
			System.out.println("Tues");
		} else if (day == 3) {
			System.out.println("wed");
		} else if (day == 4) {
			System.out.println("thurs");
		} else if (day == 5) {
			System.out.println("fri");
		} else if (day == 6) {
			System.out.println("sat");
		} else if (day == 7) {
			System.out.println("sun");
		} else {
			System.out.println("listen to the cure");
		}

	}

}
