package com.lp.springxml.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HelloApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(HelloApplication.class, args);
		System.out.println(run);

	}
}
