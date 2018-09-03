package com.test.springbootstrap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringBootstrapApplication {


	Logger logger = LoggerFactory.getLogger(SpringBootstrapApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringBootstrapApplication.class, args);
	}

}
