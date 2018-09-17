package com.biosis.apireniec.testreniec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.biosis.apireniec.testreniec")
public class TestreniecApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestreniecApplication.class, args);
	}
}
