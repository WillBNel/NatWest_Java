package com.natwest.starterproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//import com.natwest.starterproject.domain.Car;

@SpringBootApplication
public class StarterProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StarterProjectApplication.class, args);
		System.out.println(context.getBean("greeting", String.class));
		//Car car = context.getBean(Car.class);
	
	}

}
