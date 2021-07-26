package com.natwest.fruitsalad.domain;

import org.springframework.stereotype.Component;

@Component
public class Apple {

	String typeofapple;
	int numofapple;
	
	public Apple() {
		System.out.println("Apples added to salad" );
		
	}
	public void secondaryingredient() {
		System.out.println("Christmas Pippin");
	}
}
