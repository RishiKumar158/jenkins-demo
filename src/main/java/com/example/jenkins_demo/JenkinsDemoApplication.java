package com.example.jenkins_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

import org.slf4j.Logger;

@SpringBootApplication
public class JenkinsDemoApplication {

	public static Logger logger = org.slf4j.LoggerFactory.getLogger(JenkinsDemoApplication.class);

	@PostConstruct
	public void initialize() {
		logger.info("Jenkins Demo Application Initialized");
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsDemoApplication.class, args);
		logger.info("Jenkins Demo Application Started");
	}

}
