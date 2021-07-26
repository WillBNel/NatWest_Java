package com.natwest.fruitsalad.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FruitSaladDemo {

	@Bean
	public String ingredients() {
		return "Ingredients";
	}
}
