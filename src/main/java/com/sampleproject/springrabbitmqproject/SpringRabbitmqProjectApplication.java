package com.sampleproject.springrabbitmqproject;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableJpaAuditing
public class SpringRabbitmqProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRabbitmqProjectApplication.class, args);
	}

}
