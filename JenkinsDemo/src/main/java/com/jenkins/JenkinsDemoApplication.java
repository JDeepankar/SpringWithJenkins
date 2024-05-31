package com.jenkins;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDemoApplication {
	
	public static org.slf4j.Logger logger = LoggerFactory.getLogger(JenkinsDemoApplication.class);
	
	public static void main(String[] args) {
		logger.info("Application started");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}
