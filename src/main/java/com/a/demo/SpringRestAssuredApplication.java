package com.a.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.countryservices.demo.beans","com.countryservices.demo.controllers","com.countryservices.demo.services"})
public class SpringRestAssuredApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringRestAssuredApplication.class, args);
	}
}
