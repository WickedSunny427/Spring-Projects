package com.emexo.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityBasicApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringSecurityBasicApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityBasicApplication.class, args);
		LOGGER.info("Strarted basic Security App on port  8082");
	}

}
