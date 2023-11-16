package com.myapplications.dogapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan
public class DogApp {

	public static void main(String[] args) {
		SpringApplication.run(DogApp.class, args);
	}

}
