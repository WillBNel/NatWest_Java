package com.natwest.streams;

import java.util.*;

public class Exercise_1 {
	public static void main(String[] arg) {

		List<String> names = Arrays.asList("Michael", "Dean", "James", "Chris");
		names.stream().filter(i -> i != "James").forEach(i -> System.out.println("Hello " + i));

	}
}