package com.natwest.starterproject.config;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public String greeting() {
		return "Application started at: " + LocalTime.now();
		
	}
}
