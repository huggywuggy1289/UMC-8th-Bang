package com.umc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class UmcStudy1Application {

	public static void main(String[] args) {
		SpringApplication.run(UmcStudy1Application.class, args);
	}

}
