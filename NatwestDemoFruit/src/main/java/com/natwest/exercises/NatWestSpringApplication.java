package com.natwest.exercises;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.natwest.exercises.persistence.repo.FruitRepo;

@SpringBootApplication
public class NatWestSpringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(NatWestSpringApplication.class, args);
		ApplicationContext ac = SpringApplication.run(NatWestSpringApplication.class, args);
		FruitRepo repo = ac.getBean(FruitRepo.class);
		System.out.println(repo.findByType("Apple"));
	}

	
	
	
}
