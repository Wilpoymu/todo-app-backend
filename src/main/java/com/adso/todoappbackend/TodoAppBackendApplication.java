package com.adso.todoappbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class TodoAppBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoAppBackendApplication.class, args);
	}

}
