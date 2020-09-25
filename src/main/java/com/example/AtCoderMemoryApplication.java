package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.controller.AtCoderMemoryController;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories("com.example.repository")
@ComponentScan(basePackageClasses = AtCoderMemoryController.class)
public class AtCoderMemoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtCoderMemoryApplication.class, args);
	}

}
