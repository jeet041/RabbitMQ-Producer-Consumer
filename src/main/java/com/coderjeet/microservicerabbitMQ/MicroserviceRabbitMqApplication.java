package com.coderjeet.microservicerabbitMQ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MicroserviceRabbitMqApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceRabbitMqApplication.class, args);
	}

}
