package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

//creating the base packages

@ComponentScan("com.tds.HomeController")
@ComponentScan("com.tds.Dao")
@ComponentScan("com.tds.Service")
@ComponentScan("com.tds.Model")
@EntityScan(basePackages = {"com.tds.Model"})

@SpringBootApplication
public class SpringBootTdsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTdsApplication.class, args);
	}

}
