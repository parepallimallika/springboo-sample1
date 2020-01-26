package com.kakinada1.annavaram1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com")
public class Annavaram1Application {

	public static void main(String[] args) {
		SpringApplication.run(Annavaram1Application.class, args);
	}

}
