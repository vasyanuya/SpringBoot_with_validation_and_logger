package com.pp_spring.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class Application {

//	private static Logger logger = Logger.getLogger(Application.class.getName());

	public static void main(String[] args) {
//		logger.info("Launching...");
		SpringApplication.run(Application.class, args);
	}

}
