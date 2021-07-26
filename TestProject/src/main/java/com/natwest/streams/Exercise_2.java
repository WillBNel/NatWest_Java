package com.natwest.streams;

import java.util.*;

public class Exercise_2 {

	public static void main(String[] arg) {
		List<Integer> number = Arrays.asList(3, 4, 7, 8, 12);
		int product = number.stream().reduce((a, b) -> a * b).get();
		System.out.println(product);
	}

}