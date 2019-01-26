package com.rafaelc.reclameaqui.complains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ComplainsApplication {
	public static void main(String[] args) {
		SpringApplication.run(ComplainsApplication.class, args);
	}
}

