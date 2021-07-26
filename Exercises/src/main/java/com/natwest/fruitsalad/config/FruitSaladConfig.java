package com.natwest.fruitsalad.config;

import org.springframework.context.ApplicationContext;

import com.natwest.fruitsalad.domain.FruitSalad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FruitSaladConfig {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FruitSaladConfig.class, args);
		System.out.println(context.getBean("ingredients",String.class));
		FruitSalad fs = context.getBean(FruitSalad.class);
		fs.printFruitSalad();
	}

}
