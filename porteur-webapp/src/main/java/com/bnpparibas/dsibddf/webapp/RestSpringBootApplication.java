package com.bnpparibas.dsibddf.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.bnpparibas.dsibddf")
public class RestSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestSpringBootApplication.class, args);
	}

	protected SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
		return application.sources(RestSpringBootApplication.class);
	}
}
