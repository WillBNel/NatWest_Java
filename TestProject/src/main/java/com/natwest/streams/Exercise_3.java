package com.natwest.streams;

import java.util.*;

import java.util.stream.Collectors;

public class Exercise_3 {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(3, 4, 7, 8, 12);
		int max = number.stream().max(Integer::compare).get();
		System.out.println("Max value = " + max);

		int min = number.stream().min(Integer::compare).get();
		System.out.println("Min value = " + min);

		List<Integer> odd = number.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println("Removed odd numbers = " + odd);

		List<Integer> even = number.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
		System.out.println("Removed even numbers = " + even);

		System.out.println("Total is = " + number.stream().reduce(0, Integer::sum));

		System.out.println("Squared value is = "
				+ number.stream().map(n -> n * n).filter(i -> i % 2 != 0).min(Integer::compare).get());

		
	}

}
